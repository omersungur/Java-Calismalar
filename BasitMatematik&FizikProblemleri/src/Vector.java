import java.util.Scanner;

public class Vector {

	private String isim;
	private int i,j,k;
	
	public Vector (String isim) {
		this.isim = isim;
		Scanner s = new Scanner (System.in);
		
		System.out.println(isim + " in i,j ve k deðerlerini giriniz.");
		System.out.print("i: ");
		this.i = s.nextInt();
		System.out.print("j: ");
		this.j = s.nextInt();
		System.out.print("k: ");
		this.k = s.nextInt();
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	
}
