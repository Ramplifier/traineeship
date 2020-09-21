package homeworkExercises;

import extraClasses.personTypes.Android;
import extraClasses.personTypes.Employee;
import extraClasses.personTypes.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Hw10Test {

    @Test
    void testPersonGreeting() {
        Android andro = new Android();
        assertEquals("I'm only half human, but human still...", andro.greet());
    }

    @Test
    void testEmployeeGreeting() {
        Employee employee = new Employee();
        assertEquals("I'm tired of working. This is inhuman!", employee.greet());
    }

    @Test
    void testTeacherGreeting() {
        Teacher teach = new Teacher();
        assertEquals("I'm tired of working. This is inhuman!", teach.greet());
    }

}