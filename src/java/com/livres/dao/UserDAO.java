/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.dao;

import com.livres.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author usager
 */
public class UserDAO extends DAO<User> {
    
    public UserDAO(Connection cnx) {
       super(cnx);
    }
    @Override
    public boolean create(User x) {
        String req = "INSERT INTO users (`USERNAME` , `PASSWORD` , `EMAIL`)";
        PreparedStatement stm = null;
        try
        {
            
            stm = cnx.prepareStatement(req);
            stm.setString(1,x.getUsername());
            stm.setString(2,x.getPassword());
            stm.setString(3,x.getEmail());
            int n= stm.executeUpdate();
            if (n>0)
            {
                    stm.close();
                    return true;
            }
        }
        catch (SQLException exp)
        {
        }
        finally
        {
                if (stm!=null)
                try {
                        stm.close();
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }			
        }
        return false;
    }
    public User FindByUsername(String Username)
    {
        PreparedStatement stm = null;
        ResultSet r = null;
        try
        {
            String req="SELECT * FROM COMPTE WHERE USERNAME =?";
            stm = cnx.prepareStatement(req);
            stm.setString(1,Username);
            r = stm.executeQuery();
            if(r.next()){
                User u = new User();
                u.setUsername(r.getString("USERNAME"));
                u.setUsername(r.getString("PASSWORD"));
                u.setUsername(r.getString("EMAIL"));
                r.close();
                stm.close();
                return u;
            }
        }
        catch(SQLException exp)
        {
        }
        finally
        {
            if (stm!=null)
            {
                try
                {
                    r.close();
                    stm.close();
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return null;
        
    
    }
    
    @Override
    public User read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
