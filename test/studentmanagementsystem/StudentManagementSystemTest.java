

package studentmanagementsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentManagementSystemTest {

    private static Student stu=new Student("Supun", "Gothama", 100196, "Galle");
    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.listAllStudents();
        
    }

    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
     
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.registerStudent(stu);
        
    }

}