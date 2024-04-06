package com.sofka.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("directorBean")
@Scope("prototype")
public class Director implements IEmpleadoTareas{

    @Autowired
    private IGenerarInforme informe2;

    @Override
    public String getTareas() {
        return "Soy un director y estas son mis tareas";
    }

    @Override
    public String getInforme(){
        return informe2.generarInforme();
    }

}
