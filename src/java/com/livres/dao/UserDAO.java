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
 * @author Virtual-nicolas
 */
public class UserDAO extends DAO<User>{

    public UserDAO(Connection cnx) {
        super(cnx);
    }

    @Override
    public User read(String id) {

    User utilisateur = null;
    String type = "etudiant";

    String requeteEtud = "SELECT * from etudiant WHERE courriel = ?";
    String requetePro = "SELECT * from professeur WHERE courriel = ?";

    PreparedStatement paramQuery = null;
    ResultSet resultat = null;

    try {

        paramQuery = cnx.prepareStatement(requeteEtud);
        paramQuery.setString(1,id);
        resultat = paramQuery.executeQuery();

        utilisateur = new User();
        utilisateur.setCourriel(resultat.getString("courriel"));
        utilisateur.setMotDePasse(resultat.getString("mot_de_passe"));
        utilisateur.setNom(resultat.getString("nom"));

        paramQuery.close();
        cnx.close();

    } catch (SQLException ex) {
        System.out.println("Exception : "+ex);
    } catch (Exception exp){
        System.out.println("Exception : "+exp);
    }
    finally{
        if(paramQuery != null){
            try {
                paramQuery.close();
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Exception : "+ex);
            }
        }
    }
    return utilisateur;
}

    @Override
    public Boolean create(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User read(int id) {
        User u = this.read(id+"");
        return u;
    }

    @Override
    public boolean update(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
