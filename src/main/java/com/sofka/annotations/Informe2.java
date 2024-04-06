package com.sofka.annotations;

import org.springframework.stereotype.Component;

@Component
public class Informe2 implements IGenerarInforme{
    @Override
    public String generarInforme(){
        return "Este es el informe 2";
    }
}
