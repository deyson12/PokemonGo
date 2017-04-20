package calculadora;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class CalculadoraTest {
	
	@Rule
	public MockitoRule regla = MockitoJUnit.rule();
	
	@Mock
	private MathService mockServicio;
	
	Calculadora calc;
	
	@Before
	public void setUp() {
		calc = new Calculadora();
		calc.setService(mockServicio);
	}

	@Test
	public void testMult() {
		when(mockServicio.multiplicar(-3, 20)).thenReturn(-60);
		int resultado = calc.calcular(-3, 20, Operacion.MULTIPLICAR);
		assertSame("Multiplicacin", resultado, -60);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDiv() {
		when(mockServicio.dividir(anyInt(), eq(0))).thenThrow(IllegalArgumentException.class);
		calc.calcular(9, 0, Operacion.DIVIDIR);
	}

}
