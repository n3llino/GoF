package it.nello.gof.strategy;

import java.util.List;
import java.util.Set;

/**
 * @author n3llino
 */
public class Context {

	private List<String> listOfNames;
	private Set<Number> setOfNumbers;

	private Strategy strategy;

	public void letsDoIt() {
		strategy.algorithm(this);
	}

	public List<String> getListOfNames() {
		return listOfNames;
	}

	public Set<Number> getSetOfNumbers() {
		return setOfNumbers;
	}
}
