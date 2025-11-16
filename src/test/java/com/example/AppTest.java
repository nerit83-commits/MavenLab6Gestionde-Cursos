package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.Course;
import com.example.OnlineCourse;
import com.example.OnsiteCourse;


/*Requerimientos
 * Para cada una de las clases mencionadas, debés crear una clase de prueba que:
 * CourseTest:
 * Verifique que el constructor guarda correctamente los valores ingresados.
 * Pruebe el constructor con y sin profesor asignado.
 * Confirme que el método showInformation() devuelve el texto esperado.
 * OnlineCourseTest:
 * Verifique que la plataforma se asigna correctamente.
 * Compruebe que showInformation() devuelve el formato correcto incluyendo la plataforma.
 * OnSiteCourseTest:
 * Pruebe que se asignen correctamente el aula y el cupo máximo.
 * Verifique que showInformation() contenga toda la información correctamente formateada. 
 */

/*Requisitos:
 * Usar anotaciones de JUnit 5 (como @Test ).
 * Incluir al menos 2 test methods por clase.
 * Utilizar métodos de aserción como assertEquals, assertTrue. 
 * No incluir pruebas para la clase Main/App.
 */



public class AppTest {
    

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
        String info = c.showInformation();

        assertNotNull(info, "showInformation() no debería devolver null");
    }


    // OnlineCourseTest
    @Test
    public void testOnlineCoursePlatformAndShowInformation() {  // OnlineCourseTest verifica plataforma y showInformation
        OnlineCourse onlineCourse = new OnlineCourse("Python Basics", 30, "Jane Smith", "Udemy");  // Crear curso online
        onlineCourse.showInformation();  // Debería mostrar: [Online] Python Basics (30 hr) - Professor: Jane Smith - Plataform: Udemy
        assertEquals("Udemy", onlineCourse.getPlataform());  // Verifica plataforma

        assertTrue(onlineCourse.getPlataform().equals("Udemy"));  // Verifica que la plataforma sea "Udemy"

    }

    @Test
        public void testOnlineCoursePlatformNotNull() {
        OnlineCourse oc = new OnlineCourse("Java Web", 50, "Ana Pérez", "YouTube");

        assertNotNull(oc.getPlataform(), "La plataforma no debería ser null");
    }



    // OnsiteCourseTest
    @Test
    public void testOnsiteCourseRoomQuotaAndShowInformation() {  // OnsiteCourseTest verifica aula, cupo y showInformation
        OnsiteCourse onsiteCourse = new OnsiteCourse("Data Science", 50, "Aula 101", 25);  // Crea un curso onsite
        onsiteCourse.setProfessor("Alice Johnson");  // Asigna un profesor
        onsiteCourse.showInformation();  // Debería mostrar: [Onsite] Data Science (50 hr) - Room: Aula 101, MaxQuota: 25
        assertEquals("Aula 101", onsiteCourse.getClassroom());  // Verifica aula
        assertEquals(25, onsiteCourse.getMaxQuota());  // Verifica cupo máximo

        assertTrue(onsiteCourse.getClassroom().equals("Aula 101"));  // Verifica que el aula sea "Aula 101"
        assertTrue(onsiteCourse.getMaxQuota() == 25);  // Verifica que el cupo máximo sea 25

        assertNotNull(onsiteCourse);  // Verifica que el objeto curso onsite no sea nulo
    }

    @Test
    void testOnSiteCourseClassroomNotNull() {
        OnsiteCourse osc = new OnsiteCourse("C++ Inicial", 60, "Aula 12", 25);

        assertNotNull(osc.getClassroom(), "El aula no debería ser null");
    }


}