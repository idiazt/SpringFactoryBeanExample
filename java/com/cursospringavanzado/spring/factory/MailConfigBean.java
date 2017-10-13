package com.cursospringavanzado.spring.factory;

public class MailConfigBean {
	 
    private String host;
    private String username;
    private String password;
    private String port;
    
    public MailConfigBean(String profile) {
    	if (profile.equals("dev")) {
    		host = "smtp.gmail.com";
    		username = "test@gmail.com";
    		password = "test";
    		port = "465";
    	} else {
    		host = "smtp.gmail.com";
    		username = "pro@gmail.com";
    		password = "pro@gmail.com";
    		port ="465";
    	}
    }
    
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}