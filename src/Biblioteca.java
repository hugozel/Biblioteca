
public class Biblioteca {
	public static void main(String[] args) {
		Livro l1,l2,l3,l4,l5;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();
		l5 = new Livro();
		
		l1.setAno(1999);
		l1.setTitulo("A volta dos que nao foram");
		l1.setPrateleira(5);
		
		l2.setAno(2010);
		l2.setTitulo("Java's Crazy World");
		l2.setPrateleira(2);
		
		l3.setAno(1999);
		l3.setTitulo("A volta dos que nao foram");
		l3.setPrateleira(9);
		l3.setCategoria("Suspense");
		
		l4.setAno(2020);
		l4.setTitulo("A Isidrolândia");
		l4.setPrateleira(9);
		l4.setCategoria("Humor");
		
		l5.setAno(2020);
		l5.setTitulo("A Isidrolândia");
		l5.setPrateleira(9);
		l5.setCategoria("Humor");
		
		System.out.println("Titulo:" + l1.getTitulo());
		System.out.println();
		
		l1.ExibeLivro();
	
	}
}
