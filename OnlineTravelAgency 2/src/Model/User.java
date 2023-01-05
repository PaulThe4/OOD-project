/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sonipriyapaul
 */
public class User implements In_User
{
	private int userId;
    private String name;
    private int mobile;
    private String email;
    private String password;
 
 public User(int userid,String name, int mobile, String email, String password) {
        
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
    }

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMobile() {
	return mobile;
}

public void setMobile(int mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String getuserId() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setuserid(int userid) {
	// TODO Auto-generated method stub
	
    }
 
}
