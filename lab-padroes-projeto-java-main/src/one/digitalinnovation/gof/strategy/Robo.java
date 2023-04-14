package one.digitalinnovation.gof.strategy;

public class Robo {
	
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	// Movimenta o robo que é o contexto da strategy
	public void mover() {
		comportamento.mover();
	}
}
