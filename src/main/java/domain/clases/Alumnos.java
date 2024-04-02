package domain.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumnos {
    private String legajo;
    private List<Materias> materiasAp;


    public List<Materias> getMateriasAp() {
        return materiasAp;
    }

    public Alumnos(String legajo) {
        this.legajo = legajo;
        this.materiasAp = new ArrayList<>();
    }
    public void agregarMateria(Materias... materias) {
        Collections.addAll(this.materiasAp, materias);
    }

    public Boolean tieneAprCor(List<Materias> correlativas){
        if (correlativas.isEmpty()){
            return true;
        }else {
            return this.materiasAp.containsAll(correlativas);
        }
        }
}
