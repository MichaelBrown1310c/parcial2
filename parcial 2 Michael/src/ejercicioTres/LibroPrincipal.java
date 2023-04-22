package ejercicioTres;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Aclaro que nose que significa ISBN y como no tengo permitido investigar internet lo pongo asi aunque escribo uno en
		//mayuscula y otro en minuscula para que pueda ver que si funciona su geter y seter 
		
		
		libro s2 = new libro();
		
		s2.setAutor("Pedro Perez");
		s2.setIsbn("ISBN");
		s2.setTitulo("CLean Code");
		s2.setNumeroPaginas(250);
		System.out.println(s2);
		
		libro s3 = new libro();
		
		s3.setAutor("Agustin Laje");
		s3.setIsbn("isbn");
		s3.setTitulo("El libro negro de la nueva Izquierda");
		s3.setNumeroPaginas(400);
		System.out.println(s3);
		

		
		if (s2.getNumeroPaginas() > s3.getNumeroPaginas()) {
			System.out.println("El libro " + s2.getTitulo() + " tiene mas paginas");
		}else {
			System.out.println("El libro " + s3.getTitulo() + " tiene mas paginas");
		}
	}
	

}
