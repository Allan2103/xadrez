package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Peao extends Peca {
	
	@Override
	public boolean movimentoOK(int x, int y) {
		if (posX == -1 && posY == -1) {
			return true;
		}
		if (cor == Xadrez.corBRANCA) {
	        if ((x == posX) && (y == posY - 1)) {
	        	 if (y == 0 && cor == Xadrez.corBRANCA) {
	                 promoverParaRainha();
	                 return true;
	             } 
	        	 else if (y == 7 && cor == Xadrez.corPRETA) {
	                 promoverParaRainha();
	        	 }
	        }
	 
	         }

			return false;
	         }
	
	     
			private void promoverParaRainha() {
				Rainha rainha = new Rainha();
				rainha.setCor(cor);
				rainha.mover(posX, posY);
				// Adicione a nova rainha na posição do peão atual
				if (cor == Xadrez.corBRANCA) {
					Tabuleiro.listaBrancas.add(rainha);
				} else {
					Tabuleiro.listaPretas.add(rainha);
				}
				// Remova o peão atual da lista de peças
				remover();
				}
	@Override
	public boolean capturar(int x, int y) {

		//System.out.println(z);

		if (cor == Xadrez.corBRANCA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY-1) ) {
				posX = x;
				posY = y;
				return true ;
			}
		}

		if (cor == Xadrez.corPRETA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY+1) ) {
				posX = x;
				posY = y;
				return true ;
			}
		}
		return false;		
	}
		
}
