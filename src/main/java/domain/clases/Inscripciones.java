package domain.clases;

import java.util.List;

public class Inscripciones {
    private   Alumnos alumno;


    private List<Materias> matInscr;

    public Inscripciones(Alumnos alumno,List<Materias> matInscr) {
        this.alumno = alumno;
        this.matInscr = matInscr;
    }
    public Boolean aprobada(){
    return this.matInscr
        .stream()
            .allMatch(m->this.alumno.tieneAprCor(m.getMateriasCor()));


    }
}
