import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Carlos", "Fernandez");
        Alumno alumno2 = new Alumno("Andres", "Cabral");
        Alumno alumno3 = new Alumno("Esteban", "Rios");
        Alumno alumno4 = new Alumno("Raul", "Forlan");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Para inscribir a una materia seleccione el alumno:");
        System.out.println("1 para " + alumno1.getNombre() + "" + alumno1.getApellido());
        System.out.println("2 para " + alumno2.getNombre() + "" + alumno2.getApellido());
        System.out.println("3 para " + alumno3.getNombre() + "" + alumno3.getApellido());
        System.out.println("4 para " + alumno4.getNombre() + "" + alumno4.getApellido());
        int selectAlumno = entrada.nextInt();
        entrada.nextLine();

        switch (selectAlumno) {
            case 1 : alumno1.inscribirMateria1();
                     break;
            case 2 : alumno1.inscribirMateria1();
                break;
            case 3 : alumno1.inscribirMateria1();
                System.out.println("ok");
                break;
            case 4 : alumno1.inscribirMateria1();
                break;

        }


    }
}