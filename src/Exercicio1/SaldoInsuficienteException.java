package Exercicio1;

public class SaldoInsuficienteException extends Exception{
	private static final long serialVersionUID = 1L;

	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
