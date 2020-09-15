package bebida;

public class Expreso extends Bebida {
	private Double costo;
	
	public Expreso() {
		setDescripcion("Cafe Expreso");
	}
	
	@Override
	public Double costo() {
		costo=10.00;
		return costo;
	}

}
