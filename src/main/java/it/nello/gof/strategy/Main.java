package it.nello.gof.strategy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Nello
 */
public class Main {

	public static void main(String[] args) {

		List<String> s = Arrays.asList("first", "second", "third", "fourth");
		Set<Number> n = new HashSet<Number>(Arrays.asList(1, 2, 3, 4, 5));

		Context context = new Context(new ConcreteStrategyB());
		context.setListOfNames(s);
		context.setSetOfNumbers(n);
		context.letsDoIt();
	}
}
