package subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia =  new CepApi();

	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String RecuperarCidade(String cep) {
		return "São Paulo";
	}
	
	public String RecuperarEstado(String cep) {
		return "SP";
	}
}
