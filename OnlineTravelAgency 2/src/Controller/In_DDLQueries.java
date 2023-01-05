/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.User;
import Model.Trip;
import Model.Package;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author sonipriyapaul
 */
public interface In_DDLQueries {
    
    public abstract ArrayList<User> selectAllUsers();
    public abstract ArrayList<Trip> selectAllTrip();
    
}
