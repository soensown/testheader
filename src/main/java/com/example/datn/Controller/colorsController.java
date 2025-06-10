package com.example.datn.Controller;

import com.example.datn.Model.categories;
import com.example.datn.Model.colors;
import com.example.datn.repository.categoriesRepository;
import com.example.datn.repository.colorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/colors")
public class colorsController {
    @Autowired
    colorsRepository colorsRepo;

    @GetMapping("/hienThi")
    public String hienThi(Model model){
        model.addAttribute("listColors",colorsRepo.findAll());
        return "...";//link này mapping fontend file html
    }

    @GetMapping("/delete")
    public String delete(@RequestParam()Integer id){
        colorsRepo.deleteById(id);
        return "redirect:/colors/hienThi";
    }

    @GetMapping("/update/{id}")
    public String viewUpdate(Model model,@PathVariable Integer id){
        model.addAttribute("listColors",colorsRepo.findById(id).get());
        return "...";//link này mapping fontend file html
    }

    @PostMapping("/add")
    public String add(colors colors){
        colorsRepo.save(colors);
        return "redirect:/colors/hienThi";
    }
}
