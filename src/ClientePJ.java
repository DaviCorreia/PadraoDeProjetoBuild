
public class ClientePJ extends Cliente {

	private String RazaoSocial;
	private String cnpj;

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ClientePJ(String razaoSocial, String cnpj) {
		super();
		RazaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

}
