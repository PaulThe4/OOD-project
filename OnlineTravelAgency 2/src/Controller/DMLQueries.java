/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import Model.Admin;
import Model.User;
import Model.Package;
import Model.Trip;
import javax.swing.JOptionPane;

/**
 *
 * @author sonipriyapaul
 */
public class DMLQueries extends SQLQueries implements In_DMLQueries{
    
    protected PreparedStatement pst = null;
    protected Statement st = null;
    protected ResultSet rs = null;

    private static DMLQueries inst;

    public static DMLQueries getInst() {
        if (inst == null) {
            inst = new DMLQueries();
        }
        return inst;
    }

    @Override
    public int InsertUser(User user) {
        int id = 0;
        try {
            String query = "insert into Users (Name,Email,Mobile,Password) values(?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setInt(3, user.getMobile());
            pst.setString(4, user.getPassword());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("got Member id" + id);
            }
            return id;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Member failed");
        }
        return id;
    }
    

    @Override
    public int InsertTrip(Trip trip) {
        
        int id = 0;
        try {
            String query = "insert into Trips (ID,Destination,Duration,Cost) values(?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, trip.getTripid());
            pst.setString(2, trip.getDestination());
            pst.setString(3, trip.getDuration());
            pst.setInt(4, trip.getCost());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("got Vehicle id" + id);
            }
            return id;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Vehicle failed");
        }
        return id;
    }

    @Override
    public boolean DeleteUser(int userId) {
        
        try {
            String query = "DELETE FROM Users WHERE UserID=" + userId;
            st = getConnection().createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Such Member exist");
        }
        return false;
    }

    @Override
    public boolean DeletePackage(int tripid) {
        
        try {
            String query = "DELETE FROM Trips WHERE TripID=" + tripid;
            st = getConnection().createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Such Package exist");
        }
        return false;
    }
}
