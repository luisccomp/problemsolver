package br.com.mycompany.problemsolver.solver;

import java.util.List;

public interface Strategy {

	/**
	 * 
	 * @param dst
	 * @param src
	 */
	public void add(List<Node> dst, List<Node> src);
}
