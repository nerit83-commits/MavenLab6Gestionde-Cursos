package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.Models.Course;




/*Requerimientos
 * Para cada una de las clases mencionadas, debés crear una clase de prueba que:
 * CourseTest:
 * Verifique que el constructor guarda correctamente los valores ingresados.
 * Pruebe el constructor con y sin profesor asignado.
 * Confirme que el método showInformation() devuelve el texto esperado.
 */

/*Requisitos:
 * Usar anotaciones de JUnit 5 (como @Test ).
 * Incluir al menos 2 test methods por clase.
 * Utilizar métodos de aserción como assertEquals, assertTrue. 
 * No incluir pruebas para la clase Main/App.
 */



public class AppCourseTest {
    

    // CourseTest
    @Test
    public void testCourseConstructorAndShowInformation() {  // CourseTest verifica el constructor y showInformation
        Course course = new Course("Java Basics", 40, "John Doe", "", 0, 0);  // Constructor con profesor asignado
        course.showInformation();  // Debería mostrar: [Course] Java Basics (40 hr) - Professor: John Doe
        assertEquals("Java Basics", course.getTitle());  // Verifica título
        assertEquals(40, course.getDuration());  // Verifica duración
        assertEquals("John Doe", course.getProfessor());  // Verifica profesor

        assertTrue(course.getProfessor().equals("John Doe"));  // Verifica que el profesor sea "John Doe"

    }


    @Test // CourseTest verifica el constructor sin profesor y showInformation
    public void testCourseConstructorWithoutProfessorAndShowInformation() {
        Course course = new Course("Java Basics", 40);  // Constructor sin profesor asignado
        course.showInformation();  // Debería mostrar: [Course] Java Basics (40 hr) - Professor: unassigned
        assertEquals("Java Basics", course.getTitle());  // Verifica título
        assertEquals(40, course.getDuration());  // Verifica duración
        assertEquals("unassigned", course.getProfessor());  // Verifica profesor por defecto

        assertTrue(course.getProfessor().equals("unassigned"));  // Verifica que el profesor sea "unassigned"

    }


    @Test
    public void testCourseShowInformationNotNull() {
        Course c = new Course("Java Basics", 40, "John Doe", "", 0, 0);
        c.showInformation();

        assertNotNull(c, "showInformation() no debería devolver null");
    }

}
