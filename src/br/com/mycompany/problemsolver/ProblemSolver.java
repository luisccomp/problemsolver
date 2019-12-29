package br.com.mycompany.problemsolver;

import java.util.List;

import br.com.mycompany.problemsolver.cleaner.Clean;
import br.com.mycompany.problemsolver.cleaner.Home;
import br.com.mycompany.problemsolver.cleaner.Left;
import br.com.mycompany.problemsolver.cleaner.Right;
import br.com.mycompany.problemsolver.cleaner.Status;
import br.com.mycompany.problemsolver.solver.Action;
import br.com.mycompany.problemsolver.solver.Problem;
import br.com.mycompany.problemsolver.solver.Solver;
import br.com.mycompany.problemsolver.solver.Step;

public class ProblemSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem problem = new Problem(new Home(new Status[] {Status.DIRTY, Status.DIRTY}, 1));
		
		for (Action action : new Action[] {new Left(), new Right(), new Clean()})
			problem.addAction(action);
		
		Solver solver = new Solver(problem);
		solver.setStrategy((dst, src) -> {
			src.forEach((node) -> {
				dst.add(node);
			});
		});
		
		List<Step> steps = solver.solve();
		
		steps.forEach((step) -> {
			System.out.println("Action: " + step.getAction().getName());
		});
	}

}
