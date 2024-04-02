package domain;

import domain.clases.Alumnos;
import domain.clases.Inscripciones;
import domain.clases.Materias;
import org.junit.Assert;
import org.junit.Test;
import java.util.Collections;
import java.util.List;

public class TestCorre {

    @Test

    public void funcionaSinTenerCorrelativas() {


        Alumnos juan = new Alumnos("2088381");

        Materias algoritmosMat = new Materias("algoritmos",juan);

        Materias aInscribirme = new Materias("inscripcion",juan);

        aInscribirme.agregarMateria(algoritmosMat);

        Inscripciones inscripcionAlg = new Inscripciones(juan,aInscribirme.getMateriasCor());

        Assert.assertEquals(true,inscripcionAlg.aprobada());
    }
    @Test
    public void funcionaConCorrelativas() {

        Alumnos juan = new Alumnos("2088381");

        Materias algoritmosMat = new Materias("algoritmos",juan);
        Materias pdP = new Materias("paradigmas",juan);
        pdP.agregarMateria(algoritmosMat);
        juan.agregarMateria(algoritmosMat);
        Materias aInscribirme = new Materias("inscripcion",juan);

        aInscribirme.agregarMateria(pdP);

        Inscripciones inscripcionAlg = new Inscripciones(juan,aInscribirme.getMateriasCor());

        Assert.assertEquals(true,inscripcionAlg.aprobada());
    }
    @Test
    public void noFuncionaSiNoCumpleCorrelativas() {


        Alumnos juan = new Alumnos("2088381");

        Materias algoritmosMat = new Materias("algoritmos",juan);
        Materias pdP = new Materias("paradigmas",juan);
        pdP.agregarMateria(algoritmosMat);

        Materias aInscribirme = new Materias("inscripcion",juan);

        aInscribirme.agregarMateria(pdP);

        Inscripciones inscripcionAlg = new Inscripciones(juan,aInscribirme.getMateriasCor());

        Assert.assertEquals(false,inscripcionAlg.aprobada());
    }

}
