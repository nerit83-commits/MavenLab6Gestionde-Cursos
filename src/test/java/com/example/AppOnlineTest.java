package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.Models.OnlineCourse;


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


public class AppOnlineTest {

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

}