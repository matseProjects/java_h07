/**
 * 
 * @author lukas, markus
 * Repraesentiert die Strategie: Zufaellige Entscheidung
 */
public class Random implements GefStrategie {

	private boolean oppenentsLastDecision;  //Decision independent of opponent 
	@Override
	public boolean getNextDecision() {
		double x = Math.random();
		return x < 0.5d;
	}

	@Override
	public void setOppenentsLastDecision(boolean decision) {
		this.oppenentsLastDecision = decision;
	}

}
