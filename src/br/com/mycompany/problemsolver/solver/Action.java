package br.com.mycompany.problemsolver.solver;

public abstract class Action {
	private final String name;

	public Action(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param state
	 * @return
	 */
	public abstract State execute(State state);
}
