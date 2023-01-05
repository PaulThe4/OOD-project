/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Trip;
import Model.Admin;
import java.util.ArrayList;
import Model.User;
import java.sql.*;

/**
 *
 * @author sonipriyapaul
 */
public class DDLQueries extends SQLQueries implements In_DDLQueries{

   protected PreparedStatement pst = null;
    protected Statement st = null;
    protected ResultSet rs = null;

    private static DDLQueries inst;

    public static DDLQueries getInst() {
        if (inst == null) {
            inst = new DDLQueries();
        }
        return inst;
    }
    public ArrayList<User> selectAllUsers() {
        try {
            String query = "SELECT * FROM User ";
            ArrayList<User> members = new ArrayList<User>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt(1);
                String name = rs.getString(2);
                int mobile = rs.getInt(3);
                String email = rs.getString(4);
                String password = rs.getString(6);
                User users = new User(userId, name, mobile, email, password);
                members.add(users);
            }
            return members;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Trip> selectAllTrip() {
    
        try {
            String query = "SELECT * FROM Trips ";
            ArrayList<Trip> trips = new ArrayList<Trip>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int tripId = rs.getInt(1);
                String dest = rs.getString(2);
                String dur = rs.getString(3);
                int cost = rs.getInt(4);
                Trip Trips = new Trip(tripId, dest, dur, cost);
                trips.add(Trips);
            }
            return trips;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    }
        
   
