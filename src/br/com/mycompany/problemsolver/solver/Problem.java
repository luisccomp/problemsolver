package br.com.mycompany.problemsolver.solver;

import java.util.ArrayList;

public final class Problem {
	private final ArrayList<Action> actions;
	private final State initialState;

	public Problem(State initialState) {
		super();
		this.initialState = initialState;
		actions = new ArrayList<Action>();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Action> getActions() {
		return (ArrayList<Action>) actions.clone();
	}

	public State getInitialState() {
		return initialState;
	}
	
	/**
	 * 
	 * @param action
	 */
	public void addAction(Action action) {
		if (action != null)
			actions.add(action);
	}
	
	/**
	 * 
	 */
	public void clearActions() {
		actions.clear();
	}
}
