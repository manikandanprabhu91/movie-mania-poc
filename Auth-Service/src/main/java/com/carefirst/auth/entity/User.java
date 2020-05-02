package com.carefirst.auth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TEST", schema = "TIBCO_MHR")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="USR_SKEY_GENERATOR", sequenceName="TIBCO_MHR.USR_TEST_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USR_SKEY_GENERATOR")
	@Column(name="USR_SKEY")
	private long userSkey;
	
	@Column(name="USR_ID")
	private String userId;
	@Column(name = "USR_PWD")
	private String password;
	@Column(name = "USR_EMAIL")
	private String emailId;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getUserSkey() {
		return userSkey;
	}
	public void setUserSkey(long userSkey) {
		this.userSkey = userSkey;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
