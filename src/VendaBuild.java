
public class VendaBuild {

	private Venda venda;

	public VendaBuild() {
		venda = new Venda();
	}

	public VendaBuild data(String data) {
		venda.setData(data);
		return this;
	}

	public VendaBuild ClientePF(String nome, String cpf) {
		venda.setCliente(new ClientePF(nome,cpf));
		return this;
	}

	public VendaBuild ClientePJ(String cnpj, String razaoSocial) {
		venda.setCliente(new ClientePJ(cnpj, razaoSocial));
		return this;
	}

	public VendaBuild item(int quant, Produto produto) {
		venda.addItem(new ItemVenda(quant, produto));
		return this;
	}

	public VendaBuild Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}

	public VendaBuild Frete(double valor) {
		venda.setFrete(new Frete(valor));
		return this;
	}

	public Venda Build() {
		return new Venda(this);
	}
	
}
