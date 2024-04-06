package com.sofka.annotations;

public class DirectorComercial implements IEmpleadoTareas{
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
        return informeComercial.generarInforme();
    }
}
