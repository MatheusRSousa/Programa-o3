package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		Scanner teclado = new Scanner(System.in);
		conta.setSaldo(1000);
		conta.setLimite(1000);
		System.out.print("Digite 1 para deposito ou 2 para sacar");
		int condicao = teclado.nextInt();
		if(condicao == 1) {
			System.out.print("Digite o valor a depositar: ");
			float valorDeposito = teclado.nextFloat();
			try {
				conta.depositar(valorDeposito);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Saldo: "+conta.getSaldo());
		}
		else if(condicao == 2){
			System.out.print("Digite o valor a sacar: ");
			float valorSacar = teclado.nextFloat();
			try {
				conta.sacar(valorSacar);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Saldo: "+ conta.getSaldo());
		}
		teclado.close();
	}

}
