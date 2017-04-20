package calculadora;

public class MathService {
	
	private AddService addService;
	
	public int restar(int a, int b) {
        throw new IllegalArgumentException("Not implemented");
    }
    
    public int multiplicar(int a, int b) {
    	
    	// El resultado es negativo cuando a y b tienen signos opuestos
    	boolean negativo = (a < 0 && b > 0) || (a > 0 && b < 0);
    	
    	// Multiplicar es sumar a veces el número b
    	int limite = Math.abs(a);
    	int delta = Math.abs(b);
    	int resultado = 0;
        for (int i = 0; i < limite; i = addService.sum(i, 1)) {
        	resultado = addService.sum(resultado, delta);
        }
        
        return negativo ? -resultado : resultado;
    }
    
    public int dividir(int a, int b) {
        throw new IllegalArgumentException("Not implemented");
    }

	public void setAddService(AddService addService) {
		this.addService = addService;
	}
    
}
