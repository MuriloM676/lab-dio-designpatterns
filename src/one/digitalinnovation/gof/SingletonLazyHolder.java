package one.digitalinnovation.gof;
/**
 * Projeto Design Patterns do curso Bootcamp DIO
 * Singleton "Lazy Holder"
 * @author murilo martins
 */
public class SingletonLazyHolder {
	
	private static class Holder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}
}
