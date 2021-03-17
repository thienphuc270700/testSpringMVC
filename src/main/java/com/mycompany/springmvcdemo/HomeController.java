    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
        public String index(ModelMap model) {
            model.addAttribute("message", "Welcome to our Website!!!");
            return "welcome";
        }
}
