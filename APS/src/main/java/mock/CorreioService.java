package mock;

public class CorreioService {
	
	private String endereco;
	private String numero;
	
	public String buscaEndereco(String cep) {
		return endereco + numero;
	}
	
}
