package com.sofka.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sofka.annotations")
@PropertySource("classpath:aplicacion.propiedades")
public class EmpleadosConfig {
    // Definir el bean para Informe Comercial
    @Bean
    public IGenerarInforme informeComercial() {
        return new InformeComercial();
    }

    // Definir el bean para Director Comercial e inyectar dependencias
    @Bean
    public DirectorComercial directorComercial(
            @Qualifier("informeComercial") IGenerarInforme iGenerarInforme
    ) {
        return new DirectorComercial(iGenerarInforme);
    }
}
