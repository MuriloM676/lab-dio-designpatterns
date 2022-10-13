package one.digitalinnovation.gof;
/**
 * Projeto Design Patterns do curso Bootcamp DIO
 * Singleton "preguiçoso"
 * 
 * @author murilo martins
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
