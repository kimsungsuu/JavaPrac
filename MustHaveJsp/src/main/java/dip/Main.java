package dip;

public class Main {
	public static void main(String[] args) {
		ConnectToDatabase ctd = new ConnectToDatabase();

		ctd.connect(new MySQLJdbcUrl(" MySQL" ));
	}

}
