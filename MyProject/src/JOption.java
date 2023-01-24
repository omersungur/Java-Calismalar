import javax.swing.JOptionPane;

public class JOption {

	public static void main(String[] args) {
		

		String sayi = JOptionPane.showInputDialog("Lütfen bir sayi giriniz:"); //Ekrana panel içinde bir mesaj gösterir. String tipinde verir alýr.
		//int yeniSayi = Integer.parseInt(sayi); //Cast iþlemi
		JOptionPane.showMessageDialog(null, "Dikkat Dikkat!" , "Sonuçç" , JOptionPane.CANCEL_OPTION);// null,"bilgilendirme mesajý","buton baþlýðý",panel iþareti

		
	}

}
