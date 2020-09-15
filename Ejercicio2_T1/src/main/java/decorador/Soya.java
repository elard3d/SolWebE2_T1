package decorador;

import bebida.Bebida;

public class Soya extends CondimentDecorador {
	
	private Bebida bebida;
	private Double costoSoya = 5.5;
	
	
	public Soya(Bebida bebida) {
		
		this.bebida=bebida;
		
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return  bebida.getDescripcion() + ", Soya";
	}

	@Override
	public Double costo() {
		// TODO Auto-generated method stub
		return bebida.costo() + costoSoya;
	}

}
