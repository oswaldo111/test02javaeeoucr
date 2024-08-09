package com.test02javaeeoucr.test02javaeeoucr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test02javaeeoucr.test02javaeeoucr.models.productooucr;
import com.test02javaeeoucr.test02javaeeoucr.service.productooucrService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("producto")
public class productooucrController {

    @Autowired
    private productooucrService productooucrService;

    @GetMapping()
    public String listarProductos(Model model) {
        model.addAttribute("productos", productooucrService.listartodos());
        return "productos/productos-list";
    }

    @GetMapping("nuevo")
    public String ShowNewProduct(Model model) {
        model.addAttribute("productos", new productooucr());
        return "productos/productos-form";
    }

    @PostMapping
    public String SaveProduct(productooucr productooucr) {
        productooucrService.guardar(productooucr);
        return "redirect:/producto";
    }

    @GetMapping("/editar/{id}")
    public String ShowEditProduct(@PathVariable Long id, Model model) {
        model.addAttribute("productos", productooucrService.ObtenerPorId(id));
        return "productos/productos-form";
    }

    @GetMapping("/eliminar/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        productooucrService.eliminar(id);
        return "redirect:/producto";
    }

}
