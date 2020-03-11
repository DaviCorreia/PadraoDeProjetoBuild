

import org.junit.jupiter.api.Test;

class TestBuild {

	@Test
	void test() {
		Produto Corote =  new Produto("cuzcuz",2.50);
		Produto Derby =  new Produto("ovo",0.25);
		Venda venda = new VendaBuild()
				.data("10/03/20")
				.ClientePJ("Davi","11111")
				.item(3,Corote)
				.item(5,Derby)
				.Funcionario("Galega boa")
				.Frete(0)
				.Build();
	}

}
