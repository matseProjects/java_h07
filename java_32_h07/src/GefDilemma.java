
/**
 * 
 * @author lukas, markus
 * Represaentiert das Spiel Gefangenendilemma
 */
public class GefDilemma {

	GefStrategie g1, g2; //Strategien
	int penaltyPointP1, penaltyPointP2; //Strafpunkte

	public GefDilemma(GefStrategie g1, GefStrategie g2) {
		this.g1 = g1;
		this.g2 = g2;
		
		this.penaltyPointP1 = 0;
		this.penaltyPointP2 = 0;
	}

	/**
	 * Fuehrt das Spiel durch
	 * @param n Anzahl der Runden
	 */
	public void spiele(int n) {

		for (int i = 0; i < n; i++) {
			
			boolean decisionP1 = this.g1.getNextDecision();
			boolean decisionP2 = this.g2.getNextDecision();
			g1.setOppenentsLastDecision(decisionP2);
			g2.setOppenentsLastDecision(decisionP1);

			calculatePenaltyPoints(decisionP1, decisionP2);
		}
	}

	/**
	 * Punktevergabe
	 * @param decisionP1 Entscheidung von Spieler 1
	 * @param decisionP2 Entscheidung von Spieler 2
	 */
	private void calculatePenaltyPoints(boolean decisionP1, boolean decisionP2) {
		if (!decisionP1 && !decisionP2) {
			this.penaltyPointP1 += 2;
			this.penaltyPointP2 += 2;
		} else if (decisionP1 && decisionP2) {
			this.penaltyPointP1 += 4;
			this.penaltyPointP2 += 4;
		} else if (decisionP1) {
			this.penaltyPointP1 += 1;
			this.penaltyPointP2 += 6;
		}else if (decisionP2) {
			this.penaltyPointP1 += 6;
			this.penaltyPointP2 += 1;
		}
	}
	
	@Override
	public String toString() {
		boolean tie = this.penaltyPointP1 == this.penaltyPointP2;
		String output = "Spielstand:\nSpieler 1: " + this.penaltyPointP1 + " Strafpunkte, Spieler 2: " + this.penaltyPointP2 + " Strafpunkte";
		if (tie) {
			output += "\nGleichstand!";
		}else {
			output = this.penaltyPointP1 < this.penaltyPointP2 ? output + "\nSpieler 1 hat gewonnen" : output + "\nSpieler 2 hat gewonnen";
		}
		
		return output;
	}
}
