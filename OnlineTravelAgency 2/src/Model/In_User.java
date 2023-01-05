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
public interface In_User {
	public String getuserId();
    public void setuserid(int userid);
    public String getName();
    public void setName(String n);
    public String getEmail();
    public void setEmail(String e);
    public int getMobile();
    public void setMobile(int m);
    public String getPassword();
    public void setPassword(String p);
    
}

