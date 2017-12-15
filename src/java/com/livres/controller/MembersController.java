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

/**
 *
 * @author Moumene
 */
@Controller
public class MembersController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String pageLogin(ModelMap model, HttpSession session)  {
        System.out.println("In controller MembersController.pageLogin");

        User user = (User)session.getAttribute("User");
        if (user == null) {
            return "login";
        } else {
            return "redirect:/";
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(ModelMap model, HttpSession session)  {
        System.out.println("In controller MemberController.login");

        User user = (User)session.getAttribute("User");
        if (user == null) {
            //TODO: créer un login
            return null;
        } else {
            return "redirect:/";
        }

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String pageRegister(ModelMap model, HttpSession session)  {
        System.out.println("In controller MembersController.pageRegister");

        User user = (User)session.getAttribute("User");
        if (user == null) {
            return "CreerCompte";
        } else {
            return "redirect:/";
        }

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(ModelMap model, HttpSession session)  {
        System.out.println("In controller MemberController.register");

        User user = (User)session.getAttribute("User");
        if (user == null) {
            //TODO: créer un compte
            return null;
        } else {
            return "redirect:/";
        }

    }

    //@ResponseBody
    @RequestMapping("/")
    public String welcome(ModelMap model, HttpSession session)  {
        System.out.println("In controller MembersController.welcome");

        User user = (User)session.getAttribute("User");
        if (user != null) {
            return "redirect:/members/login";
        } else {
            //<property name="prefix" value=""/>
            //<property name="suffix" value=".jsp"/>
            return"index";
        }

    }

    //@ResponseBody
//    @RequestMapping(method = RequestMethod.GET, value="/", params={"nom"})
//    public String convert(@RequestParam("nom") String nom, ModelMap model) {
//        model.addAttribute("message", "1 "+nom+" vaut "+converterService.getTaux(nom)+" $CAN");
//        return "convert";
//    }
}
