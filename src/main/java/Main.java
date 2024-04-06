import com.sofka.ioc.IEmpleadoTareas;
import com.sofka.ioc.Jefe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//      1. Cargar contexto
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

//        2. Genererar la instancia
        Jefe empleado = contexto.getBean("miEmpleadoBeanSetter", Jefe.class);

        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());
        System.out.println(empleado.getCorreoGrupal());
        System.out.println(empleado.getNombreEmpresaGrupal());



        contexto.close();
    }
}