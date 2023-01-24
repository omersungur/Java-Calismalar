import com.mysql.jdbc;
import com.mysql.jdbc.Connection;

public class Baglanti {

	private String kullanici_adi = "root";
	private String parola = "";
	
	private String db_ismi = "demo";
	private String host = "localhost";
	
	private int port = 3306;
	
	private Connection con = null;
	
	public Baglanti () {
		String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
		
		try {
			Class.forName(com.mysql.cj.jdbc.Driver);
		}
		catch (ClassNotFoundException e) {
			
		}
		
	}
	
	
}
