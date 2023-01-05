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
public interface In_Trip {
	 public String gettripid();
     public void settripid(String tripid);
     public String getDuration();
     public void setDuration(String dur);
     public String getDestination();
     public void setDestination(String dest);
     public int getCost();
     public void setCost(int c);
}

