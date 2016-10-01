package it.nello.gof.strategy;

/**
 * @author n3llino
 */
public class ConcreteStrategyC implements Strategy {

	public void algorithm(Context context) {
		System.out.println(getClass().getName());
		System.out.println("I'm so lazy");
	}
}