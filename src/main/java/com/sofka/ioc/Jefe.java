package com.sofka.ioc;

public class Jefe implements IEmpleadoTareas {

    private ICreacionInformes creacionInformes;

    private String correoGrupal;
    private String nombreEmpresaGrupal;

    public String getTareas(){
        return "Soy un jefe y estas son mis tareas";
    }

    @Override
    public String getInforme() {
        return creacionInformes.getInforme();
    }

    public void setCreacionInformes(ICreacionInformes creacionInformes) {
        this.creacionInformes = creacionInformes;
    }

    public String getCorreoGrupal() {
        return correoGrupal;
    }

    public void setCorreoGrupal(String correoGrupal) {
        this.correoGrupal = correoGrupal;
    }

    public String getNombreEmpresaGrupal() {
        return nombreEmpresaGrupal;
    }

    public void setNombreEmpresaGrupal(String nombreEmpresaGrupal) {
        this.nombreEmpresaGrupal = nombreEmpresaGrupal;
    }
}
