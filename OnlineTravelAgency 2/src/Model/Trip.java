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
public class Trip implements In_Trip{
	private int tripid;
	private String destination;
        private String duration;
        private int cost;

    public Trip(int tripId, String dest, String dur, int cost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public int getTripid() {
		return tripid;
	}
	public void setTripid(int tripid) {
		this.tripid = tripid;
	}
        @Override
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
        public String getDuration() {
		return duration;
	}
	public void setDuration(String dur) {
		this.duration = dur;
	}
        @Override
        public int getCost() {
		return cost;
	}
        @Override
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String gettripid() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void settripid(String tripid) {
		// TODO Auto-generated method stub
		
	}
	

}

