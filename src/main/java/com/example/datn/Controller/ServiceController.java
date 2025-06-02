package com.example.datn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ServiceController {
    @GetMapping("/")
    public String home(Model model){
        return "/page/home";
    }
    @GetMapping("/overview")
    public String overview(Model model){
        model.addAttribute("newOrders", 57);
        model.addAttribute("onHoldOrders", 5);
        model.addAttribute("outOfStock", 15);
        model.addAttribute("totalOrders", 16247);
        model.addAttribute("newCustomers", 356);
        model.addAttribute("couponUsage", 72);
        model.addAttribute("payingCustomerPercent", 30);
        return "/page/Overview";
    }
    @GetMapping("/listProduct")
    public String listProduct(Model model){
        model.addAttribute("newOrders", 57);
        model.addAttribute("onHoldOrders", 5);
        model.addAttribute("outOfStock", 15);
        model.addAttribute("totalOrders", 16247);
        model.addAttribute("newCustomers", 356);
        model.addAttribute("couponUsage", 72);
        model.addAttribute("payingCustomerPercent", 30);
        return "/page/ListProduct";
    }
}
