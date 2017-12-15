/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.services;

import com.livres.dao.UserDAO;
import com.livres.model.User;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Moumene
 */
public class LoginService {

    private UserDAO dao;

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    public boolean login(String email, String password, HttpSession session) {
        User user = dao.FindByEmail(email);
        if (user != null && password != null && password.equals(user.getPassword())) {
            session.setAttribute("User", user);
            return true;
        }
        return false;
    }

}
