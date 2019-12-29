package br.com.mycompany.problemsolver.cleaner;

public enum Status {
	CLEAN(true),
	DIRTY(false);
	
	private boolean status;
	
	Status(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
}
