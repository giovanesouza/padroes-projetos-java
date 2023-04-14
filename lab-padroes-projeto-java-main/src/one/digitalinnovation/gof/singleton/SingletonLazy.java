package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author giovanesouza
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	// Não permite instanciamento fora da classe
	private SingletonLazy() {
		super();
	}
	
	
	// Exposição pública para uso
	public static SingletonLazy getInstancia() {

		// Verificação 
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
