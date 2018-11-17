/**
 * 
 * @author lukas, markus
 * Beschreibt eine Spielstrategie
 */
public interface GefStrategie {

	/**
	 * Gibt das ergebnis naechste eigene Spielentscheidung zurück
	 * @return Entscheidung
	 */
	public boolean getNextDecision();
	
	/**
	 * Letzter zug des spielers wird mitgeteilt
	 * @param decision Letzter zug des spieler
	 */
	public void setOppenentsLastDecision(boolean decision);
}
