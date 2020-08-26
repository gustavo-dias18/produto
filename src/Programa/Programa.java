package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Produto.Importado;
import Produto.Produto;
import Produto.Usado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for (int x=1;x<=n;x++) {
			System.out.printf("\nProduto #%d:",x);
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (tipo == 'c') {
				lista.add(new Produto(nome, preco));
			}
			
			else if (tipo == 'u') {
				System.out.print("Qual a data de fabricação (DD/MM/AAAA)? ");
				Date fabricado = sdf.parse(sc.next());
				lista.add(new Usado(nome, preco, fabricado));
			}
			
			else {
				System.out.print("Qual o valor da taxa: ");
				double taxa = sc.nextDouble();
				lista.add(new Importado(nome, preco, taxa));
			}
		}
		
		System.out.printf("\n\nETIQUETAS:\n");
		for (Produto x : lista) {
			System.out.println(x.Etiqueta());
		}
		
		sc.close();
	}

}