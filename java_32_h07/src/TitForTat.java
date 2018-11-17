/**
 * 
 * @author lukas, markus
 * Repraesentiert die Strategie: "Wie du mir, so ich dir" Nimmt die Entscheidung des Gegner in der vorherigen Runde an
 */
public class TitForTat implements GefStrategie {

	private boolean oppenentsLastDecision = false; // in der ersten Runde soll er kooperieren
	
	public boolean getNextDecision() {
		return oppenentsLastDecision;
	}
	
	public void setOppenentsLastDecision(boolean decision) {
		this.oppenentsLastDecision = decision;
	}
}
