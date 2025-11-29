package com.example.Main;

import java.util.ArrayList;
import com.example.Models.Course;
import com.example.Models.OnlineCourse;


public class Main {
   public static void main(String[] args) {
     ArrayList<Course> courses = new ArrayList<>();

        //Crear cursos y añadir a la lista.
        OnlineCourse oc1 = new OnlineCourse("Java 101", 60, "Teams" );
        oc1.setProfessor("Fernández");
        courses.add(oc1);

        Course c1 = new Course ("Matemáticas", 40);
        c1.setProfessor("García");
        courses.add(c1);

        //Ejempo usando el constructor completo.
        Course c2 = new Course("Programación", 120, "Hernández", "Teams", 0, 0);
        courses.add(c2);

        //Imprimir informacion de todos los cursos con for-each
        for (Course curso : courses) {
            curso.showInformation();
        }

    }


}
