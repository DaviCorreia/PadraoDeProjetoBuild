
import org.junit.jupiter.api.Test;

class TestBuild {

	@Test
	void test() {
		Produto Cuzcuz = new Produto("cuzcuz", 2.50);
		Produto Ovo = new Produto("ovo", 0.25);
		Venda venda = new VendaBuild()
				.data("10/03/20")
				.ClientePF("Davi", "09156664470")
				.item(3, Cuzcuz)
				.item(5, Ovo)
				.Funcionario("Galega")
				.Frete(0).Build();

	}

	@Test
	void test2() {
		Produto Acoes = new Produto("acoes", 20.000000);
		Produto Investimentos = new Produto("investimento", 50.000000);
		Venda venda = new VendaBuild()
				.data("10/03/20")
				.ClientePJ("75.498.620/0001-00", "DaviBank")
				.item(3, Acoes)
				.item(5, Investimentos)
				.Funcionario("Morena")
				.Frete(0).Build();
	}

}
