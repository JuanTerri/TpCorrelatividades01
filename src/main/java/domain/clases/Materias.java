package domain.clases;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Materias {
    private String nombre;
    private List<Materias> materiasCor;
    private Alumnos alumno;
    public void agregarMateria(Materias... materias) {
        Collections.addAll(this.materiasCor, materias);
    }
    public Materias(String nombre,Alumnos alumno) {
        this.nombre = nombre;
        this.materiasCor = new ArrayList<>();
        this.alumno = alumno;
    }

    public String getNombre() {
        return nombre;
    }
    public List<Materias> getMateriasCor() {
        return materiasCor;
    }
}
