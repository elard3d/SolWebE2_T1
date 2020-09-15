package decorador;

import bebida.Bebida;

public class Chocolate extends CondimentDecorador{
	private Bebida bebida;
	private Double costoChocolate=1.5;
	
	public Chocolate(Bebida bebida) {
		this.bebida=bebida;
	}
	
	@Override
	public String getDescripcion() {
		return  bebida.getDescripcion() + ", Chocolate";
	}
	
	@Override
	public Double costo() {
		return bebida.costo() + costoChocolate;
	}
}
