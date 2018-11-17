/**
 * 
 * @author lukas, markus
 * Repraesentiert die Strategie: Kooperiert solange, bis er einmal betrogen wird, dann betruegt er selbst
 */
public class Spite implements GefStrategie {

	private boolean oppenentsLastDecision = false; //Kooperiert zuerst
	private boolean gotBetrayed = false;
	
	public boolean getNextDecision() {
		if (this.oppenentsLastDecision) {
			this.gotBetrayed = true;
		}
		return gotBetrayed;
	}
	
	public void setOppenentsLastDecision(boolean decision) {
		this.oppenentsLastDecision = decision;
	}
}
