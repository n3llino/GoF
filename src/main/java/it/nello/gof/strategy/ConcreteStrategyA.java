package it.nello.gof.strategy;

import java.util.Collections;

/**
 * @author n3llino
 */
public class ConcreteStrategyA implements Strategy {

	public void algorithm(Context context) {
		System.out.println(getClass().getName());
		Collections.sort(context.getListOfNames());
		for (String s : context.getListOfNames()) {
			System.out.println("---> " + s);
		}
		long l = 0L;
		for (Number n : context.getSetOfNumbers()) {
			l += n.longValue();
		}
		System.out.println("++> " + l);
	}
}
