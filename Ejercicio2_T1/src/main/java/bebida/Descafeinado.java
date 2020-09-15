package bebida;

public class Descafeinado extends Bebida{
	private Double costo;
	
	public Descafeinado() {
		setDescripcion("Cafe descafeinado");
	}
	
	@Override
	public Double costo() {
		costo=12.00;
		return costo;
	}

}
