package com.example.demo;

import org.example.calculadora.RestarRequest;
import org.example.calculadora.RestarResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculadoraEndRestar {

    @PayloadRoot(namespace = "http://www.example.org/calculadora", localPart = "RestarRequiest")
    @ResponsePayload
    public RestarResponse dameResta(@RequestPayload RestarRequest peticion) {
        RestarResponse respuestaR = new RestarResponse();
        respuestaR.setResultado(String.valueOf(Integer.parseInt(peticion.getA()) - Integer.parseInt(peticion.getB())));
        return respuestaR;
    }
}