package com.test02javaeeoucr.test02javaeeoucr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test02javaeeoucr.test02javaeeoucr.models.productooucr;
import com.test02javaeeoucr.test02javaeeoucr.repository.productooucrRepository;

@Service
public class productooucrService {

    @Autowired
    private productooucrRepository productooucrRepository;

    public List<productooucr> listartodos() {
        return productooucrRepository.findAll();
    }

    public productooucr guardar(productooucr productooucr) {
        return productooucrRepository.save(productooucr);
    }

    public productooucr ObtenerPorId(Long id) {
        return productooucrRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        productooucrRepository.deleteById(id);
    }
}
