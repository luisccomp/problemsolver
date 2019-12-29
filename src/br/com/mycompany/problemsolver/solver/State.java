package br.com.mycompany.problemsolver.solver;

public interface State {

	/**
	 * 
	 * @return
	 */
	public double distance(State state);
	
	/**
	 * 
	 * @return
	 */
	public long getId();
	
	/**
	 * 
	 * @return
	 */
	public boolean isObjective();
}
