/**
 * 
 * @author lukas, markus
 * Repraesentiert die Strategie: 2xKooperieren + 1xErzaehlen (periodisch)
 */
public class PerKind implements GefStrategie {

	private boolean oppenentsLastDecision; //Decision independent of opponent 
	private int counter = 1;
	@Override
	public boolean getNextDecision() {
		if(counter%3==0) {
			counter ++;
			return true;
		}
		counter++;
		return false;
	}

	@Override
	public void setOppenentsLastDecision(boolean decision) {
		this.oppenentsLastDecision = decision;

	}

}
