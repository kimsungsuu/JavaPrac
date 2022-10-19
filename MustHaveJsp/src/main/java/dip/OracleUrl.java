package dip;

public class OracleUrl implements JdbcUrl{

	private final String dbName;
	
	public OracleUrl(String dbName) {
		this.dbName = dbName;
	}
	
	@Override
	public String get() {
		return dbName;
	}
	
}
