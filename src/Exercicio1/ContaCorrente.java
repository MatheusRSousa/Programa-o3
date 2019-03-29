package Exercicio1;

public class ContaCorrente {
	
	private float limite;
	private float saldo;
	private float valorLimite;
	
	
	
	public void sacar(float valor) throws Exception{
		if(valor > saldo + limite){
			throw new SaldoInsuficienteException("Saldo indisponivel");
		} 
		if(valor<=0) {
			throw new Exception("Valor Invalido");
		}
		saldo -= valor;
	}
	
	public void depositar(float valor) throws Exception{
		if(valor<=0) {
			throw new Exception("valor invalido");
		}
		saldo += valor;
	}


	public void setValorLimite(float valor) throws Exception{
		if(valor <= 0) {
			throw new Exception("valor invalido");
		}
		this.valorLimite = valor;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}
	
}
