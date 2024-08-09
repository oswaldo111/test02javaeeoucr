package com.test02javaeeoucr.test02javaeeoucr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test02javaeeoucr.test02javaeeoucr.repository.detalleordenoucrRepository;
import com.test02javaeeoucr.test02javaeeoucr.models.detalleordenoucr;


@Service
public class detalleordenoucrService {

    @Autowired
    private detalleordenoucrRepository detalleordenoucrRepository;

    public List<detalleordenoucr> listarDetalles(){
        return detalleordenoucrRepository.findAll();
    }

    public detalleordenoucr guardar(detalleordenoucr detalleordenoucr){
        return detalleordenoucrRepository.save(detalleordenoucr);
    }

    public detalleordenoucr ObtenerPorId(Long id){
        return detalleordenoucrRepository.findById(id).orElse(null);
    }

    public void eliminar (Long id){
        detalleordenoucrRepository.deleteById(id);
    }
}
