package com.sofka.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("directorBean")
public class Director implements IEmpleadoTareas{

    @Autowired
    private IGenerarInforme informe;

    @Override
    public String getTareas() {
        return "Soy un director y estas son mis tareas";
    }

    @Override
    public String getInforme(){
        return informe.generarInforme();
    }

}
