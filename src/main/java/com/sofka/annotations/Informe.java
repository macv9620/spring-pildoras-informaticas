package com.sofka.annotations;

import org.springframework.stereotype.Component;

@Component
public class Informe implements IGenerarInforme{
    @Override
    public String generarInforme(){
        return "Generando informe primer trimestre";
    }
}
