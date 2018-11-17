/**
 * 
 * @author lukas, markus
 * Repraesentiert die Strategie: Gleiche Entscheidungen in der vorherigen Runde fuehren zum Kooperieren, Ungleiche zum Erzaehlen
 */
public class Pavlov implements GefStrategie {

	//In der ersten Runde soll kooperiert werden, deshalb gleiche Werte
	private boolean oppenentsLastDecision = true;
	private boolean myLastDecision = true;
	
	@Override
	public boolean getNextDecision() {
		
		boolean cheat = !(oppenentsLastDecision==myLastDecision);
		myLastDecision = cheat;
		return cheat;
	}

	@Override
	public void setOppenentsLastDecision(boolean decision) {
		this.oppenentsLastDecision = decision;
	}

}
