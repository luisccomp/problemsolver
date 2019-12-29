package br.com.mycompany.problemsolver.cleaner;

import br.com.mycompany.problemsolver.solver.State;

public final class Home implements State {
	private final Status[] rooms;
	private final int pos;
	
	public Home() {
		rooms = new Status[] { Status.DIRTY, Status.DIRTY };
		pos = 0;
	}
	
	public Home(Status[] rooms, int pos) {
		this.rooms = rooms;
		this.pos = pos;
	}
	
	public Status[] getRooms() {
		return rooms.clone();
	}

	public int getPos() {
		return pos;
	}

	@Override
	public double distance(State state) {
		// TODO Auto-generated method stub
		return 1.0;
	}

	private long statusToInt(Status status) {
		if (status == Status.CLEAN)
			return 1L;
		else
			return 0L;
	}
	
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		long id = 0L;
		
		for (Status status : rooms) {
			id <<= 1;
			id += statusToInt(status);
		}
		
		id <<= 1;
		
		return id + pos;
	}

	@Override
	public boolean isObjective() {
		// TODO Auto-generated method stub
		for (Status status : rooms)
			if (status == Status.DIRTY)
				return false;
		
		return true;
	}
}
