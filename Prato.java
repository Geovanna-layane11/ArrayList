package caixaMagica;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
		public static void main (String[]args) {
			Scanner scanner = new Scanner (System.in);
			ArrayList<Double> precos = new ArrayList<>();
			ArrayList<String> prato = new ArrayList<>();	
			while (true) {
				System.out.print("digite o prato: ");
				String pratoN = scanner.nextLine();
				if (pratoN.equalsIgnoreCase("fim")) {
						break;
				}
			
				prato.add(pratoN);
					
				System.out.print("digite preco: ");
				double preco = scanner.nextDouble();
				scanner.nextLine();
				precos.add(preco);
				prato.remove;
				}
			if (prato.isEmpty()) {
				System.out.println("nenhum produto foi inserido.");
			}else { 
				System.out.println("\nlista de produtos: ");
			}

			for (int i = 0; i < prato.size(); i++) {
				System.out.println(prato.get(i) + "R$" + precos.get(i));
				}
			
			}
		}
