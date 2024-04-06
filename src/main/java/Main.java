import com.sofka.annotations.IEmpleadoTareas;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//      1. Cargar contexto
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

//        2. Genererar la instancia
        IEmpleadoTareas empleado = contexto.getBean("directorBean", IEmpleadoTareas.class);

        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());

        contexto.close();
    }
}