package com470.primerParcial2022;

public class NumeroComplejo {
	
	 	private int _parteReal;
	    private int _parteImaginaria;

	    public NumeroComplejo(int _parteReal,int _parteImaginaria) {
	        this._parteReal = _parteReal;
	        this._parteImaginaria = _parteImaginaria;
	    }

	    public int getParteReal() {
	        return _parteReal;
	    }

	    public int getParteImaginaria() {
	        return _parteImaginaria;
	    }
	    public NumeroComplejo sumar(NumeroComplejo c){
	    return new NumeroComplejo(this.getParteReal()+c.getParteReal(),this.getParteImaginaria()+c.getParteImaginaria());
	      
	    }
	    public NumeroComplejo restar(NumeroComplejo c){
	    return new NumeroComplejo(this.getParteReal()-c.getParteReal(),this.getParteImaginaria()-c.getParteImaginaria());
	      
	    }

		@Override
		public String toString() {
			return "NumeroComplejo [_parteReal=" + _parteReal + ", _parteImaginaria=" + _parteImaginaria + "]";
		}
	    
	    
}