package br.com.mycompany.problemsolver.cleaner;

import br.com.mycompany.problemsolver.solver.Action;
import br.com.mycompany.problemsolver.solver.State;

public class Clean extends Action {

	public Clean() {
		super("Clean");
	}

	@Override
	public State execute(State state) {
		// TODO Auto-generated method stub
		Home home = (Home) state;
		Status[] rooms = home.getRooms();
		int pos = home.getPos();
		
		rooms[pos] = Status.CLEAN;
		
		return new Home(rooms, pos);
	}
}
