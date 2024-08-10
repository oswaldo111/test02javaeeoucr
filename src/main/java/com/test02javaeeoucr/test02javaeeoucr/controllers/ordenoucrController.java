package com.test02javaeeoucr.test02javaeeoucr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test02javaeeoucr.test02javaeeoucr.models.ordenoucr;
import com.test02javaeeoucr.test02javaeeoucr.service.ordenoucrService;
 
@Controller
@RequestMapping("orden")
public class ordenoucrController {

     @Autowired
    private ordenoucrService ordenoucrService;

    @GetMapping()
    public String listarordenes(Model model) {
        model.addAttribute("ordenes", ordenoucrService.listarOrdenes());
        return "ordenes/ordenes-list";
    }

    @GetMapping("nuevo")
    public String ShowNewordenes(Model model) {
        model.addAttribute("ordenes", new ordenoucr());
        return "ordenes/ordenes-form";
    }

    @PostMapping
    public String Saveordenes(ordenoucr ordenesooucr) {
        ordenoucrService.guardar(ordenesooucr);
        return "redirect:/orden";
    }

    @GetMapping("/editar/{id}")
    public String ShowEditordenes(@PathVariable Long id, Model model) {
        model.addAttribute("ordenes", ordenoucrService.ObtenerPorId(id));
        return "ordenes/ordenes-form";
    }

    @GetMapping("/eliminar/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        ordenoucrService.eliminar(id);
        return "redirect:/orden";
    }
}
