import javax.swing.JOptionPane;

public class JOption {

	public static void main(String[] args) {
		

		String sayi = JOptionPane.showInputDialog("L�tfen bir sayi giriniz:"); //Ekrana panel i�inde bir mesaj g�sterir. String tipinde verir al�r.
		//int yeniSayi = Integer.parseInt(sayi); //Cast i�lemi
		JOptionPane.showMessageDialog(null, "Dikkat Dikkat!" , "Sonu��" , JOptionPane.CANCEL_OPTION);// null,"bilgilendirme mesaj�","buton ba�l���",panel i�areti

		
	}

}
