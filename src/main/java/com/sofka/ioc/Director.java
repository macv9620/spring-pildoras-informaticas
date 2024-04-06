package com.sofka.ioc;

public class Director implements IEmpleadoTareas{

    private final ICreacionInformes creacionInformes;

    public Director(ICreacionInformes creacionInformes) {
        this.creacionInformes = creacionInformes;
    }

    @Override
    public String getTareas() {
        return "Soy un director y estas son mis tareas";
    }

    public String getInforme() {
        return creacionInformes.getInforme();
    }
}
