package model;

public class ContaPolpanca extends Conta{
	private double rendimento;
	ContaPolpanca(String email) {
		super(email);
		this.rendimento = rendimento;
	}
	public String Saque (double ValorSaque) {
		if(ValorSaque <= saldo) {
			saldo =- ValorSaque;
	        return (
	        		"Valor Sacado: " + ValorSaque
	        		+"\nValor Saldo Após o Saque: "
	        		+ saldo	        		
	        		);        		
	} else {
		return "Saldo Insuficiente";
	}
}

public String Deposito (double ValorDeposito) {
	saldo += ValorDeposito;
	return ("Valor Sacado; " + ValorDeposito
			+"\nValor Saldo Após o Saque: "
			+ saldo);
			
     }
    public double getSaldo( ) {
    	return saldo;
    }
}