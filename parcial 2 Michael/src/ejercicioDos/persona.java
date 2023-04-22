package ejercicioDos;

import java.util.Scanner;

public class persona {


	private static String nombre;
	private static String DNI;
	private static int edad;
	private static String sexo;
	private static int peso;
	private static int altura;

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
					System.out.println("ingrese el nombre de la persona");
					 nombre = sc.next();
					System.out.println("ingrese la edad de la persona");
					 edad = sc.nextInt();
			        System.out.println("ingrese el sexo de la persona H para hombre y M para mujer");
			         //sexo
			        System.out.println("ingrese primero el peso y luego la altura de la persona");
			         // peso;
			        //altura;
				
			}

	public static String getnombre() {
		return nombre;
	}

	public static String setnombre(String nmbre, String nombre) {
		return persona.nombre = nombre;
	}

	public static String getDNI() {
		return DNI;
	}

	public static void setDNI(String dNI) {
		DNI = dNI;
	}

	public static int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		persona.edad = edad;
	}

	public static String getSexo() {
		return sexo;
	}

	public static void setSexo(String sexo) {
		persona.sexo = sexo;
	}

	public static int getPeso() {
		return peso;
	}

	public static void setPeso(int peso) {
		persona.peso = peso;
	}
	public static int getAltura() {
		return altura;
	}

	public static void setAltura(int altura) {
		persona.altura = altura;
	}

}
