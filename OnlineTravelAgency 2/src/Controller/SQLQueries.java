/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author sonipriyapaul
 */
public abstract class SQLQueries extends SQLMethods{
    
    public static DDLQueries DDL() {
        return DDLQueries.getInst();
    }

    public static DMLQueries DML() {
       return DMLQueries.getInst();
    }

    
}
