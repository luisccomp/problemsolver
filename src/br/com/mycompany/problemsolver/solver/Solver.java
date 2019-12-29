package br.com.mycompany.problemsolver.solver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Solver {
	private final Problem problem;
	private Strategy strategy;

	public Solver(Problem problem) {
		super();
		this.problem = problem;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	private List<Node> expand(Node node, Set<Long> visited) {
		List<Node> successors = new ArrayList<>();
		
		problem.getActions().forEach((action) -> {
			State newState = action.execute(node.getState());
			
			if (!visited.contains(newState.getId()))
				successors.add(new Node(node, newState, action,
						newState.distance(node.getState()) + node.getDistance(),
						1 + node.getDepth()));
		});
		
		return successors;
	}
	
	private List<Step> solution(Node node) {
		List<Step> solution = new ArrayList<>();
		Node curr = node;
		
		while (curr.getParent() != null) {
			solution.add(0, new Step(curr.getAction(), curr.getDistance(), curr.getDepth()));
			curr = curr.getParent();
		}
		
		return solution;
	}
	
	public List<Step> solve() {
		List<Node> nodes = new ArrayList<>();
		nodes.add(new Node(null, problem.getInitialState(), null, 0.0, 0));
		
		Set<Long> visited = new HashSet<>();
		
		while (true) {
			if (nodes.isEmpty())
				return null;
			
			Node node = nodes.remove(0);
			visited.add(node.getState().getId());
			
			// Checks if current state is objective state. If it's true, then return a list of steps
			// required to solve our problem.
			if (node.getState().isObjective())
				return solution(node);
			
			// Expand current node and get it's successors and add to nodes list.
			List<Node> successors = expand(node, visited);
			strategy.add(nodes, successors);
		}
	}
}
