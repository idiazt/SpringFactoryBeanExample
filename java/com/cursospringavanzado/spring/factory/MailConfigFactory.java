package com.cursospringavanzado.spring.factory;

import org.springframework.beans.factory.FactoryBean;

public class MailConfigFactory implements FactoryBean<MailConfigBean> {
	 
    private String accountName;
    private String profile;
 
    public MailConfigBean getObject() throws Exception {
        return new MailConfigBean(profile);
    }
 
    public Class<?> getObjectType() {
        return MailConfigBean.class;
    }
 
    public boolean isSingleton() {
        return false;
    }

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
 
    
    
}
