package com.Uber.UberBasico.Service;

import com.Uber.UberBasico.Request.ClientAddress;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UberService {


    private ClientAddress clientAddress;


    public ArrayList<String> cargarRuta() {

        ArrayList<String> ListaDeCalles = new ArrayList<String>();

        ListaDeCalles.add("Juan B Justo");
        ListaDeCalles.add("San Martin");
        ListaDeCalles.add("Nogoya");

        return ListaDeCalles;
    }

}
