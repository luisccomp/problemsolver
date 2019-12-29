package br.com.mycompany.problemsolver.solver;

public final class Node {
	private final Node parent;
	private final State state;
	private final Action action;
	private final double distance;
	private final int depth;

	public Node(Node parent, State state, Action action, double distance, int depth) {
		super();
		this.parent = parent;
		this.state = state;
		this.action = action;
		this.distance = distance;
		this.depth = depth;
	}

	public Node getParent() {
		return parent;
	}

	public State getState() {
		return state;
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
