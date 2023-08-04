package Steps;

import Elementos.ElementosDeTela;
import Metodos.MetodosPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Teste {
	MetodosPage m = new MetodosPage();
	ElementosDeTela e = new ElementosDeTela();
	
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
		
	m.abrirNavegador(url);
	   
	}

	@Quando("preencher os dados de login")
	public void preencher_os_dados_de_login() throws InterruptedException {
		
		m.pausar(2000);
		m.preencherTexto(e.getPreencher(), "standard_user");
		m.pausar(2000);
		m.preencherTexto(e.getPreecher2(), "secret_sauce");
		m.pausar(2000);
		m.clicar(e.btnLogin());
		m.pausar(2000);
		m.clicar(e.getBtnAddToCart());
		m.pausar(2000);
		m.clicar(e.getBtnCarrinho());
		m.pausar(2000);
		m.clicar(e.getBtnCheckout());
		m.pausar(2000);
		m.preencherTexto(e.getPreencherFistName(), "Flash");
		m.pausar(2000);
		m.preencherTexto(e.getPreencherLastName(), "Code");
		m.pausar(2000);
		m.preencherTexto(e.getPreencherZipPostalCode(), "04897-010");
		m.pausar(2000);
		m.clicar(e.getBtnContinue());
		m.pausar(2000);
		m.clicar(e.getBtnFinish());
		m.pausar(2000);
		m.clicar(e.getBtnBackHome());
		
		
		
		
		
		
		
		
		
		
		
	   
	}

	@Quando("clicar no produto desejado")
	public void clicar_no_produto_desejado() {
	   
	}

	@Então("deverá ser direcionado para o carrinho")
	public void deverá_ser_direcionado_para_o_carrinho() {
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
