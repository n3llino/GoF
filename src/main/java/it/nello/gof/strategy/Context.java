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

	public Context() {
		super();
		this.strategy = new ConcreteStrategyC();
	}

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void letsDoIt() {
		strategy.algorithm(this);
	}

	public List<String> getListOfNames() {
		return listOfNames;
	}

	public Set<Number> getSetOfNumbers() {
		return setOfNumbers;
	}

	public void setListOfNames(List<String> listOfNames) {
		this.listOfNames = listOfNames;
	}

	public void setSetOfNumbers(Set<Number> setOfNumbers) {
		this.setOfNumbers = setOfNumbers;
	}
}
