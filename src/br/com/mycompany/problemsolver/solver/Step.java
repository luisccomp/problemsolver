package br.com.mycompany.problemsolver.solver;

public final class Step {
	private final Action action;
	private final double distance;
	private final int depth;

	public Step(Action action, double distance, int depth) {
		super();
		this.action = action;
		this.distance = distance;
		this.depth = depth;
	}

	public Action getAction() {
		return action;
	}

	public double getDistance() {
		return distance;
	}

	public int getDepth() {
		return depth;
	}
}
