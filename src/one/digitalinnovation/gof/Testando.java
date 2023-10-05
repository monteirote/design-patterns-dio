package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonLazy;

public class Testando {

	public static void main(String[] args) {
		
		SingletonLazy singletonLazy = SingletonLazy.getInstancia();
		System.out.println(singletonLazy);
		SingletonLazy singletonLazy2 = SingletonLazy.getInstancia();
		System.out.println(singletonLazy2);
	}
}
