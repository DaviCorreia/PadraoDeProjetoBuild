import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private VendaBuild builder;
	private List<ItemVenda> itemVendidos = new ArrayList<>();
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;
	private Double total;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public VendaBuild getBuilder() {
		return builder;
	}
	public void setBuilder(VendaBuild builder) {
		this.builder = builder;
	}
	public List<ItemVenda> getItemVendidos() {
		return itemVendidos;
	}
	public void setItemVendidos(List<ItemVenda> itemVendidos) {
		this.itemVendidos = itemVendidos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

}
