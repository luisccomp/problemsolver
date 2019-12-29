package br.com.mycompany.problemsolver.cleaner;

import br.com.mycompany.problemsolver.solver.Action;
import br.com.mycompany.problemsolver.solver.State;

public class Right extends Action {

	public Right() {
		super("Right");
	}

	@Override
	public State execute(State state) {
		// TODO Auto-generated method stub
		Home home = (Home) state;
		
		return new Home(home.getRooms(), 1);
	}
	
}
