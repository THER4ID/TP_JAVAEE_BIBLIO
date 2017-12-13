/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.controller;

import com.livres.model.User;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Moumene
 */
@Controller
public class BooksController {

    //@ResponseBody
    @RequestMapping("/")
    public View welcome(ModelMap model, HttpSession session)  {
        System.out.println("In controller BooksController");
        User user = (User)session.getAttribute("User");
        if (user != null) {
            System.out.println("(user != null)");
            return new JstlView("index");
        } else {
            System.out.println("do a redirect");
            return new RedirectView("/members/login", true, false);
        }

    }

    //@ResponseBody
//    @RequestMapping(method = RequestMethod.GET, value="/", params={"nom"})
//    public String convert(@RequestParam("nom") String nom, ModelMap model) {
//        model.addAttribute("message", "1 "+nom+" vaut "+converterService.getTaux(nom)+" $CAN");
//        return "convert";
//    }
}
