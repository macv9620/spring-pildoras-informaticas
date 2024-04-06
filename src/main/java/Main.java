import com.sofka.annotations.EmpleadosConfig;
import com.sofka.annotations.IEmpleadoTareas;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//      1. Cargar contexto
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

//        2. Genererar la instancia
        IEmpleadoTareas empleado = contexto.getBean("directorComercial", IEmpleadoTareas.class);

        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());

        contexto.close();
    }
}