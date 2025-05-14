package examen;

public class Publicaciones implements GestioPublis {
	int anioPublicacion;
	boolean estado;

	@Override
	public void prestar() {
		estado = true;

	}

	@Override
	public boolean prestado() {
		return estado;
	}

	@Override
	public void devolver() {
		estado = false;

	}

}
