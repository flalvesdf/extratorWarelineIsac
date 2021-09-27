package br.org.isac.extrator.extratorWarelineIsac.app.config;

public enum WarelineServers {
	
	HMA("10.100.8.13", "TI", "T3cnologia20","5432", "db1");
	
	private String url;
	private String user;
	private String psw;
	private String port;
	private String db;
	
	private WarelineServers(String url, String user, String psw, String port, String db) {
		this.url = url;
		this.user = user;
		this.psw = psw;
		this.port = port;
		this.db = db;
	}
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}
