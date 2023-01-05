/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sonipriyapaul
 */
public class Admin implements In_Admin
{
	    private String adminid;
	    private String email;
	    private String password;
	    private ArrayList<Admin> adminid1;
		public String getadminid() {
			return adminid;
		}
		public void setAdminId(String adminid) {
			this.adminid = adminid;
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
		public ArrayList<Admin> getadminid1() {
			return adminid1;
		}
		public void setUserid1(ArrayList<Admin> adminid1) {
			this.adminid1 = adminid1;
		}
		@Override
		public String getAdminID() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void setAdminID(String adminID) {
			// TODO Auto-generated method stub
			
		}
        

}
