
package tarea1;
import java.util.Scanner;
public class TestEstudiante {
  
    public static void main(String[] args) {   
      Objeto objeto1 = new Objeto();
      objeto1.crear();
      Presentar objeto2 = new Presentar();
      objeto2.presentar1();
    }
}
class Objeto{
    public void crear(){
        Scanner teclado = new Scanner(System.in);
        Estudiante obj1 = new Estudiante();   
        System.out.println("Ingrese el nombre");
        obj1.setNombre(teclado.next());
        System.out.println("Ingrese el apellido");
        obj1.setApellido(teclado.next());
        System.out.println("Ingrese la edad");
        obj1.setEdad(teclado.nextInt());
        Estudiante obj2 = new Estudiante();   
        System.out.println("Ingrese el nombre");
        obj2.setNombre(teclado.next());
        System.out.println("Ingrese Apellido");
        obj2.setApellido(teclado.next());
        System.out.println("Ingrese edad");
        obj2.setEdad(teclado.nextInt());
    }
}   
    class Presentar{
        public void presentar1(){
            Estudiante obj1 = new Estudiante();
            Estudiante obj2 = new Estudiante();
            System.out.println("Nombre: "+obj1.getNombre()+" Apellido: "+obj1.getApellido()+" Edad: "+obj1.getEdad());
            System.out.println("Nombre: "+obj2.getNombre()+" Apellido: "+obj2.getApellido()+" Edad: "+obj2.getEdad());
        }
    }

