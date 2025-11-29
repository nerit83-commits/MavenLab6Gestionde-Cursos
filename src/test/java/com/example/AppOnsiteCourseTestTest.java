package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.Models.OnsiteCourse;


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



public class AppOnsiteCourseTestTest {

    // OnsiteCourseTest
    @Test
    public void testOnsiteCourseRoomQuotaAndShowInformation() {  // OnsiteCourseTest verifica aula, cupo y showInformation
        OnsiteCourse onsiteCourse = new OnsiteCourse("Data Science", 50, "Alice Johnson", 101, 25);  // Crea un curso onsite
        onsiteCourse.showInformation();  // Debería mostrar: [Onsite] Data Science (50 hr) - Professor: Alice Johnson - Room: 101, MaxQuota: 25
        assertEquals(101, onsiteCourse.getRoom());  // Verifica aula
        assertEquals(25, onsiteCourse.getMaxQuota());  // Verifica cupo máximo

        assertTrue(onsiteCourse.getRoom() == 101);  // Verifica que el aula sea 101
        assertTrue(onsiteCourse.getMaxQuota() == 25);  // Verifica que el cupo máximo sea 25

        assertNotNull(onsiteCourse);  // Verifica que el objeto curso onsite no sea nulo
    }

    @Test
    void testOnSiteCourseClassroomNotNull() {
        OnsiteCourse osc = new OnsiteCourse("C++ Inicial", 60, 12, 25);

        assertNotNull(osc.getRoom(), "El aula no debería ser null");
    }


}