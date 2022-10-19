package dip;

public class MySQLJdbcUrl implements JdbcUrl {
	private final String dbName;
	
	public MySQLJdbcUrl(String dbName) {
		this.dbName = dbName;
	}
	
	@Override
	public String get() {
		
		return dbName;
	}
	
	
}
