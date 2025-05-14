package examen;

public class Principal {

	public static void main(String[] args) {
		
		Publicaciones[] p = { new Libro(), new Revista() };

		for (Publicaciones publicaciones : p) {
			System.out.println(publicaciones);
		}
	}

	static int numeroPrestamos(Publicaciones[] p) {

		int numeroPublicaciones = 0;
		for (Publicaciones publicaciones : p) {
			if (publicaciones.estado)
				numeroPublicaciones++;
		}
		return numeroPublicaciones;
	}
}