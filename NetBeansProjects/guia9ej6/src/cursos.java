
import entidades.Curso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class cursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aca va toda la fruta jaja
    Curso curso=new Curso();
    curso.crearCurso();
        System.out.println("===================================================");
        System.out.println("El curso " + curso.getNombreCurso() + " tiene los siguientes alumnos: ");
        String[]alumnos = curso.getAlumnos();
        for (String alumno : alumnos){
            System.out.println(alumno);
            System.out.println("========================================================");
        }
        System.out.println("La ganancia semanal del curso es: $"+curso.calcularGananciasSemanales());
    }
    
}
