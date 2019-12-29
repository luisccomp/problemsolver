package br.com.mycompany.problemsolver.cleaner;

import br.com.mycompany.problemsolver.solver.Action;
import br.com.mycompany.problemsolver.solver.State;

public class Left extends Action {

	public Left() {
		super("Left");
	}

	@Override
	public State execute(State state) {
		// TODO Auto-generated method stub
		Home home = (Home) state;
		
		return new Home(home.getRooms(), 0);
	}
}
