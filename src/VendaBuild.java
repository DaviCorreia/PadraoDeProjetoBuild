
public class VendaBuild {
	
	private Venda venda;
	
	public VendaBuild () {
		venda = new Venda();
	}
	public VendaBuild data (String data) {
		venda.setData(data);
		return this;
	}

}
