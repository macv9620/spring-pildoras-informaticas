package com.sofka.annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorComercial implements IEmpleadoTareas{

    @Value("${correo.general}")
    private String correo;

    @Value("${empresa.filial}")
    private String empresa;
    private final IGenerarInforme informeComercial;

    public DirectorComercial(IGenerarInforme informeComercial) {
        this.informeComercial = informeComercial;
    }

    @Override
    public String getTareas() {
        return "Tareas de un Director Comercial";
    }

    @Override
    public String getInforme() {
        return informeComercial.generarInforme()+correo+empresa;
    }
}
