package ejercicioUno;

import java.io.CharArrayWriter;
import java.util.Scanner;
public class ejercicioUno {
	 private static Scanner sc;

	public static void main(String[] args) {
		    sc = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
	  String frase = sc.nextLine();

		    char[] caracteres = frase.toCharArray();

		 System.out.println("Los caracteres son: ");
		    for (int i = 0; i < caracteres.length; i++) {
		      System.out.println(caracteres[i]);
  }
		}
		}


