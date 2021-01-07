import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void TestCreateStudent(){
        Student student1 = new Student(23, "len");
        Student law = null;

        assertNotNull(student1.getId());
    }

    @Test
    public void testStudentFields(){
        Student student1 = new Student(1l, "len");
        assertSame(1L, student1.getId());
        assertSame("fer", student1.getName());
        assertSame(0, student1.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}



