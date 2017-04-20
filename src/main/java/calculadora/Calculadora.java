package calculadora;

public class Calculadora {
	
	MathService servicio;
	
	public void setService(MathService servicio) {
		this.servicio = servicio;
	}
	
    public int calcular(int a, int b, Operacion op) {
    	int resultado;
    	switch (op) {
	    	case MULTIPLICAR:
	    		resultado = servicio.multiplicar(a, b);
	    		break;
	    	case DIVIDIR:
	    		resultado = servicio.dividir(a, b);
	    		break;
	    	default:
	    		throw new UnsupportedOperationException();
    	}
    	return resultado;
    }
}
