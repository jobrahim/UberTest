package com.Uber.UberBasico.Service;

import com.Uber.UberBasico.Request.ClientAddress;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CalculoCalles {


    private UberService uberService;

    public String returnStreet(ClientAddress clientAddress){

        if(clientAddress.getLatitudeDestino().longValue() < clientAddress.getLatitudeOrigen().longValue()){

            ArrayList<String> calleLista = uberService.cargarRuta();

            return calleLista.get(0);
        }else if (clientAddress.getLatitudeDestino().longValue() > clientAddress.getLongitudOrigen().longValue()){

            ArrayList<String> calleLista = uberService.cargarRuta();

            return calleLista.get(1);
        }else{

            ArrayList<String> calleLista = uberService.cargarRuta();

            return calleLista.get(2);

        }

    }
}
