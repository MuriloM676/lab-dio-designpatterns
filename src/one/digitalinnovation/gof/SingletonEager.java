package one.digitalinnovation.gof;
/**
 * Projeto Design Patterns do curso Bootcamp DIO
 * Singleton "apressado"
 * 
 * @author murilo martins
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
