package testesmock;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import junit.framework.Assert;
import mock.CorreioService;



class CorreioServiceTest {

	@Test
	public void valorTeste(){
		CorreioService correio = Mockito.mock(CorreioService.class);
		when(correio.buscaEndereco("9000000")).thenReturn("Porto Alegre");
		String resultado = correio.buscaEndereco("9000000");
		Assertions.assertEquals("Porto Alegre", resultado);
	}
	
	@Test
	public void valorTeste2(){
		CorreioService correio = Mockito.mock(CorreioService.class);
		when(correio.buscaEndereco("8000000")).thenReturn("Av. Assis Brasil");
		String resultado = correio.buscaEndereco("8000000");
		Assertions.assertEquals("Av. Assis Brasil", resultado);
	}

}
