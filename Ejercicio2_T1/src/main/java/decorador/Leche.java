package decorador;

import bebida.Bebida;

public class Leche extends CondimentDecorador {
	private Bebida bebida;
	private Double costoLeche=2.0;
	
	public Leche(Bebida bebida) {
		this.bebida=bebida;
	}
	
	@Override
	public String getDescripcion() {
		return  bebida.getDescripcion() + ", Leche";
	}
	
	@Override
	public Double costo() {
		return bebida.costo() + costoLeche;
	}

}
