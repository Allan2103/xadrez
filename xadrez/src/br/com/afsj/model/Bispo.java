package br.com.afsj.model;

public class Bispo extends Peca {
	
	@Override
	public boolean movimentoOK(int x, int y) {
	    if (posX == -1 && posY == -1) {
	        return true;
	    }
	    
	    int diferencaX = Math.abs(x - posX);
	    int diferencaY = Math.abs(y - posY);
	    
	    return diferencaX == diferencaY;
	}

}
