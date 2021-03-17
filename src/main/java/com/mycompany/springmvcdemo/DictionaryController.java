/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcdemo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping(value = "/dicts")
public class DictionaryController {
    private final static Map<String, String> dicts;
    static {
        dicts = new HashMap<>();
        dicts.put("Hello", "Xin chào");
        dicts.put("Love", "Yêu");
        dicts.put("Computer", "Máy tính");
        dicts.put("Remember", "Nhớ");
        dicts.put("Artificial", "Nhân tạo");
    } 
    @RequestMapping
    public String index(ModelMap model) {
        model.addAttribute("message", "Welcome to Our Dictionary!!!");
        return "dicts";
    } 
    @RequestMapping(value = "/list")
    public String list(ModelMap model) {
        model.addAttribute("words", dicts);
        return "dicts-list";
    }
}
