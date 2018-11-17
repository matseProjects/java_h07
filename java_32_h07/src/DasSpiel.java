
public class DasSpiel {
	public static void main(String[] args) {
		// boolean test = false == false;
		GefStrategie[] strategies = {new TitForTat(),new PerKind(), new Random(), new Pavlov(), new Spite() };
		for(GefStrategie g : strategies) {
			for(GefStrategie h : strategies) {
				System.out.println(g.getClass().toString().replace("class ","") + " - " + h.getClass().toString().replace("class ",""));
				GefDilemma gd = new GefDilemma(g,h);
				gd.spiele(100);
				System.out.println(gd + "\n");
			}
		}
		
	}
}
