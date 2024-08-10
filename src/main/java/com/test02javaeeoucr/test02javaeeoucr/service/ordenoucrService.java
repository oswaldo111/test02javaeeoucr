package com.test02javaeeoucr.test02javaeeoucr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test02javaeeoucr.test02javaeeoucr.models.ordenoucr;
 import com.test02javaeeoucr.test02javaeeoucr.repository.ordenoucrRepository;

@Service
public class ordenoucrService {

    @Autowired
    private ordenoucrRepository ordenoucrRepository;

    public  List<ordenoucr> listarOrdenes(){
        return ordenoucrRepository.findAll();
    }

    public ordenoucr guardar(ordenoucr ordenoucr) {
        return ordenoucrRepository.save(ordenoucr);
    }

    public ordenoucr ObtenerPorId(Long id) {
        return ordenoucrRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        ordenoucrRepository.deleteById(id);
    }
}
