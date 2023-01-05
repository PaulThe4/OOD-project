/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Trip;
import Model.User;

/**
 *
 * @author sonipriyapaul
 */
public interface In_DMLQueries {
    
    //public abstract boolean  UpdateUser(User user);

 //   public abstract boolean InsertNotification(Notification notification);

    public abstract int InsertUser(User user);
    
    public abstract int InsertTrip(Trip trip);
    
    public abstract boolean DeleteUser(int userId);
    
    //public abstract boolean UpdatePackage(Package pack);
    
    public abstract boolean DeletePackage(int tripid);
    
    //public abstract boolean InsertBookingInfo(RiderTrip trip);
    
    //public abstract boolean UpdateTrip(int tripID, int slots,String status);
    
    
}
