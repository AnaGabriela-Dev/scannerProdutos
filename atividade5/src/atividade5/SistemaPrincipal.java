package atividade5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean cont = true;
		
		System.out.println("=== BEM VINDO AO SISTEMA DO MERCADINHO ===");
		System.out.println("Qual o seu nome?");
		String nome = scanner.next();

		ClientePF c1 = new ClientePF(nome);
		
		Pedido carrinho1 = new Pedido(c1);
		
		scanner.nextLine();
		
		while (cont == true){
			try {
				System.out.println("Qual o nome do produto buscado?");
				String pNome = scanner.next();
				System.out.println("Qual o valor do produto?");
				double pValor = scanner.nextDouble();
				System.out.println("Qual a quantidade desejada?");
				int pQuant = scanner.nextInt();
				
				carrinho1.addItem(new ItemPedido(pNome, pValor, pQuant));
				
				System.out.println("Deseja adicionar outro produto? S/N");
				String valid = scanner.next();
				if (valid.equalsIgnoreCase("S")) {
					cont = true;
				} else if (valid.equalsIgnoreCase("N")){
					cont = false;
				} else {
					System.out.printf("Valor inserido invalido! Iremos fechar as entradas por segurança!\n\n");
					cont = false;
				}
			} catch (InputMismatchException ime) {
				System.out.println("\n--- ATENÇÃO: ERRO DE ENTRADA ---");
                System.out.println("Por favor, insira valores válidos!");
                System.out.println("--------------------------------\n");
                
                scanner.nextLine();
			}
		}
		
		scanner.close();
		
		carrinho1.setMetodoPagamento(new PagamentoCartaoCredito());
		carrinho1.exibirCarrinho();
		carrinho1.getMetodoPagamento().processarPagamento(carrinho1.calcularTotal());
	}
}
