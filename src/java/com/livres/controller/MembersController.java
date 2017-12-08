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

/**
 *
 * @author Moumene
 */
@Controller
public class MembersController {

    //@ResponseBody
    @RequestMapping("/*")
    public String welcome(ModelMap model, HttpSession session)  {

        User user = (User)session.getAttribute("User");
        if (user != null) {
            return "index";
        } else {
            return "login";
        }

    }

    //@ResponseBody
//    @RequestMapping(method = RequestMethod.GET, value="/", params={"nom"})
//    public String convert(@RequestParam("nom") String nom, ModelMap model) {
//        model.addAttribute("message", "1 "+nom+" vaut "+converterService.getTaux(nom)+" $CAN");
//        return "convert";
//    }
}
