package com.example.demo;

import org.example.calculadora.DividirRequest;
import org.example.calculadora.DividirResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculadoraEndDividir {

    @PayloadRoot(namespace = "http://www.example.org/calculadora", localPart = "DividirRequiest")
    @ResponsePayload
    public DividirResponse dameDivision(@RequestPayload DividirRequest peticion) {
        DividirResponse respuestaD = new DividirResponse();
        respuestaD.setResultado(
                String.valueOf(Integer.parseInt(peticion.getDivisor()) / Integer.parseInt(peticion.getDividendo())));
        return respuestaD;
    }
}