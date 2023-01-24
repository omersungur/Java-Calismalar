
public class Problem {

	public static class Matematik {
		public static void daire_alan (int yaricap) {
			System.out.println("Dairenin alaný: " + (yaricap * yaricap * Math.PI));
		}
		
		public static void ucgen_cevre (int kenar1, int kenar2, int kenar3) {
			System.out.println("Üçgenin çevresi:" + (kenar1+kenar2+kenar3));
		}
	}
	
	public static class Fizik {
		
		public static void icCarpim (Vector vek1, Vector vek2) {
			
			int iccarpim = vek1.getI() * vek2.getI() + vek1.getJ() * vek2.getJ() + vek1.getK() * vek2.getK();
			System.out.println(vek1.getIsim() + " ile " + vek2.getIsim() + " in iç çarpýmý: " + iccarpim);
		}
	}
	
}
