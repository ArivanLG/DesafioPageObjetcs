package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTela {
	
	private By preencherUserName = By.id("user-name");

	public By getPreencherUserName() {
		return preencherUserName;
	}
	
	public By getPreencher() {
		return preencher;
	}
	private By preencher = By.id("user-name");
	

	public By getPreecher2() {
		return preecher2;
	}

	private By preecher2 = By.id("password");
	
	
	public By btnLogin() {
		return btnLogin;
		
	}
		
	public By getBtnAddToCart() {
		return btnAddToCart;
	}
	public By getBtnCarrinho() {
		return btnCarrinho;
	}
	private By btnLogin = By.id("login-button");
	
	
	public By getBtnLogin() {
		return btnLogin;
	}

	public By getBtnCheckout() {
		return btnCheckout;
	}

	public By getPreencherFistName() {
		return preencherFistName;
	}

	public By getPreencherLastName() {
		return preencherLastName;
	}

	public By getPreencherZipPostalCode() {
		return preencherZipPostalCode;
	}

	public By getBtnContinue() {
		return btnContinue;
	}
	
	

	public By getBtnFinish() {
		return btnFinish;
	}
	public By getBtnBackHome() {
		return btnBackHome;
	}
	private By btnAddToCart = By.id("add-to-cart-sauce-labs-backpack");
	
	private By btnCarrinho = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	private By btnCheckout	= By.id("checkout");
	
	private By preencherFistName = By.id("first-name");
	
	private By preencherLastName = By.id("last-name");
	
	private By preencherZipPostalCode = By.id("postal-code");
	
	private By btnContinue = By.id("continue");
	
	private By btnFinish = By.id("finish");
	
	private By btnBackHome = By.id("back-to-products");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
