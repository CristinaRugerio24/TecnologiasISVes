package com.example.demo;

import org.example.calculadora.MultiplicarRequest;
import org.example.calculadora.MultiplicarResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculadoraEndMultiplicar {

    @PayloadRoot(namespace = "http://www.example.org/calculadora", localPart = "MultiplicarRequiest")
    @ResponsePayload
    public MultiplicarResponse dameMultiplicacion(@RequestPayload MultiplicarRequest peticion) {
        MultiplicarResponse respuestaM = new MultiplicarResponse();
        respuestaM.setResultado(String.valueOf(Integer.parseInt(peticion.getA()) * Integer.parseInt(peticion.getB())));
        return respuestaM;
    }
}