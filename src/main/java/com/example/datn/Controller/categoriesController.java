package com.example.datn.Controller;

import com.example.datn.Model.categories;
import com.example.datn.repository.categoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class categoriesController {
    @Autowired
    categoriesRepository categoriesRepo;

    @GetMapping("/hienThi")
    public String hienThi(Model model){
        model.addAttribute("listCategories",categoriesRepo.findAll());
        return "...";//link này mapping fontend file html
    }

    @GetMapping("/delete")
    public String delete(@RequestParam()Integer id){
        categoriesRepo.deleteById(id);
        return "redirect:/categories/hienThi";
    }

    @GetMapping("/update/{id}")
    public String viewUpdate(Model model,@PathVariable Integer id){
        model.addAttribute("listCategories",categoriesRepo.findById(id).get());
        return "...";//link này mapping fontend file html
    }

    @PostMapping("/add")
    public String add(categories categories){
        categoriesRepo.save(categories);
        return "redirect:/categories/hienThi";
    }
}
