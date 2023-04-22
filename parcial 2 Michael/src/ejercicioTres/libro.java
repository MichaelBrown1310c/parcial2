package ejercicioTres;

public class libro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String isbn;

	public libro() {
	}

	public String getTitulo() {
		return titulo;

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

	}

	
	public String getAutor() {
		return autor;

	}
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
		
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
		
	}
	public String getIsbn() {
		return isbn;
		
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		
		String s1 = " ";
		s1 = "El libro " + getTitulo() 
		+ " con " + getIsbn()
		+  " creado por el autor " + getAutor()
		+ " tiene " + getNumeroPaginas() + " paginas. ";
		return s1;
	}
	
}
