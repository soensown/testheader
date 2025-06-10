package com.example.datn.Controller;

import com.example.datn.Model.categories;
import com.example.datn.Model.sizes;
import com.example.datn.repository.categoriesRepository;
import com.example.datn.repository.sizesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sizes")
public class sizesController {
    @Autowired
    sizesRepository sizesRepo;

    @GetMapping("/hienThi")
    public String hienThi(Model model){
        model.addAttribute("listSizes",sizesRepo.findAll());
        return "...";//link này mapping fontend file html
    }

    @GetMapping("/delete")
    public String delete(@RequestParam()Integer id){
        sizesRepo.deleteById(id);
        return "redirect:/sizes/hienThi";
    }

    @GetMapping("/update/{id}")
    public String viewUpdate(Model model,@PathVariable Integer id){
        model.addAttribute("listSizes",sizesRepo.findById(id).get());
        return "...";//link này mapping fontend file html
    }

    @PostMapping("/add")
    public String add(sizes sizes){
        sizesRepo.save(sizes);
        return "redirect:/sizes/hienThi";
    }
}
