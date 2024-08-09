package com.test02javaeeoucr.test02javaeeoucr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test02javaeeoucr.test02javaeeoucr.models.detalleordenoucr;
import com.test02javaeeoucr.test02javaeeoucr.service.detalleordenoucrService;
import com.test02javaeeoucr.test02javaeeoucr.service.ordenoucrService;
import com.test02javaeeoucr.test02javaeeoucr.service.productooucrService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("detalle")
public class detalleordenoucrController {

    @Autowired
    private detalleordenoucrService detalleordenoucrService;

    @Autowired
    private ordenoucrService ordenoucrService;

    @Autowired
    private productooucrService productooucrService;

    @GetMapping
    public String listarDetalles(Model model){
        model.addAttribute("detalles", detalleordenoucrService.listarDetalles());
        return "detalle/detalle-list";
    }

    @GetMapping("nuevo")
    public String ShowNewDetail(Model model) {
        model.addAttribute("detalle", new detalleordenoucr());
        model.addAttribute("ordenes", ordenoucrService.listarOrdenes());
        model.addAttribute("productos", productooucrService.listartodos());
        return "detalle/detalle-form";
    }

    @PostMapping
    public String SaveDetails(detalleordenoucr detalleordenoucr) {
        detalleordenoucrService.guardar(detalleordenoucr);
        return "redirect:/detalle";
    }
    
    @GetMapping("editar/{id}")
    public String EditDetail(@PathVariable Long id, Model model) {
        model.addAttribute("detalle", detalleordenoucrService.ObtenerPorId(id));
        model.addAttribute("ordenes", ordenoucrService.listarOrdenes());
        model.addAttribute("productos", productooucrService.listartodos());
        return "detalle/detalle-form";
    }

    @GetMapping("eliminar/{id}")
    public String DeleteDetalis(@PathVariable Long id) {
        detalleordenoucrService.eliminar(id);
        return "redirect:/detalle";
    }
    
    
}
