import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private int idAlumno=0;
    private String nombre = "Juan";
    private String apellido = "Cruz";

    List<String> listaMaterias = new ArrayList<>();



    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idAlumno++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaMaterias() {
        return listaMaterias;
    }

    public void inscribirMateria1() {
        String materia = Materia.materia_1;
        this.listaMaterias.add(materia);
    }

    public void inscribirMateria2() {
        String materia = Materia.materia_2;
        this.listaMaterias.add(materia);
    }

    public void inscribirMateria3() {
        String materia = Materia.materia_3;
        this.listaMaterias.add(materia);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
