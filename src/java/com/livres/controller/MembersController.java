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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Moumene
 */
@Controller
public class MembersController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public View pageLogin(ModelMap model, HttpSession session)  {
        System.out.println("In controller MembersController.pageLogin");

        if (session != null) {
            System.out.println("In condition for null session");
            return new JstlView("login");
        }
        User user = (User)session.getAttribute("User");
        if (user == null) {
            return new JstlView("login");
        } else {
            return new RedirectView("/", true, false);
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public View login(ModelMap model, HttpSession session)  {
        System.out.println("In controller MemberController.login");

        User user = (User)session.getAttribute("User");
        if (user == null) {
            return new JstlView("login");
        } else {
            return new RedirectView("/", true, false);
        }

    }

    //@ResponseBody
    @RequestMapping("/")
    public View welcome(ModelMap model, HttpSession session)  {
        System.out.println("In controller MembersController.welcome");

        User user = (User)session.getAttribute("User");
        if (user != null) {
            return new RedirectView("/members/login", true, false);
        } else {
            //<property name="prefix" value=""/>
            //<property name="suffix" value=".jsp"/>
            return new JstlView("index");
        }

    }

    //@ResponseBody
//    @RequestMapping(method = RequestMethod.GET, value="/", params={"nom"})
//    public String convert(@RequestParam("nom") String nom, ModelMap model) {
//        model.addAttribute("message", "1 "+nom+" vaut "+converterService.getTaux(nom)+" $CAN");
//        return "convert";
//    }
}
