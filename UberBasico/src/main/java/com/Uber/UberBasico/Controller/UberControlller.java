package com.Uber.UberBasico.Controller;

import com.Uber.UberBasico.Request.ClientAddress;
import com.Uber.UberBasico.Service.CalculoCalles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UberControlller {

    @Autowired
    private CalculoCalles calculoCalles;

    @RequestMapping("/SolicitarRuta")
    public String route(@RequestBody ClientAddress clientAddress) {

        return calculoCalles.returnStreet(clientAddress);

    }

}
<<<<<<< HEAD
// pedro perez

// hola coca cola
=======

// nuevos cambios para rama ibra
>>>>>>> ibra
