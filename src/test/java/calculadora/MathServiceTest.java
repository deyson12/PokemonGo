package calculadora;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MathServiceTest {

	@Rule
	public MockitoRule regla = MockitoJUnit.rule();
	
	@Mock
	private AddService sumador;
	
	MathService mathService;
	
	@Before
	public void setUp() throws Exception {
		
		when(sumador.sum(0, 5)).thenReturn(5);
		when(sumador.sum(5, 5)).thenReturn(10);
		when(sumador.sum(10, 5)).thenReturn(15);
		
		// Usado para definir los ciclos
		when(sumador.sum(0, 1)).thenReturn(1);
		when(sumador.sum(1, 1)).thenReturn(2);
		when(sumador.sum(2, 1)).thenReturn(3);
		
		mathService = new MathService();
		mathService.setAddService(sumador);
	}

	@Test
	public void multiplicar() {
		int resultado = mathService.multiplicar(-3, 5);
		assertSame("Multiplicación", resultado, -15);
	}
	
	@Test
	public void multiplicarPositivo() {
		int resultado = mathService.multiplicar(5, 5);
		assertSame("Multiplicación", resultado, 25);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void dividirTestExeption() {
		when(mathService.dividir(4, 2)).thenThrow(IllegalArgumentException.class);
		mathService.dividir(4, 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void restarTestExeption() {
		when(mathService.restar(4, 2)).thenThrow(IllegalArgumentException.class);
		mathService.restar(4, 2);
	}

}
