package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import atividade5.Produto;

public class LeitorDeArquivos {
	public static void main(String[] args) {
		BufferedReader leitor = null;
		try {
			FileReader fileReader = new FileReader("produtos.csv");
			leitor = new BufferedReader(fileReader);
			
			String linha = leitor.readLine();
			System.out.println(linha);
			
			List<Produto> produtos = new ArrayList<>();
			
			while((linha = leitor.readLine()) != null) {				
				String infos[] = linha.split(",");
				String id = infos[0]; 
				String nome = infos[1]; 
				double preco = Double.valueOf(infos[2]); 
				int estoque = Integer.valueOf(infos[3]); 
				String descricao = infos[4];
				
				Produto p = new Produto(id, nome, preco, estoque, descricao);
				
				produtos.add(p);
			}
		} catch (IOException e) {
			System.err.println("Arquivo não encontrado");
		} finally {
			if (leitor != null) {
				try {
					leitor.close();
				} catch (IOException e) {
					System.err.println("Erro ao fechar arquivo");
				}
			}
		}
	}
}
