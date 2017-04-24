/**
 * Created by George Dzagali on 2/28/2017.
 */
public class EmployeeTest {
    public class EmployeeTest {
        Employee EmployeeTest;

        @Before
        public void setup() {
            testEmployee = new Employee();
        }

        @Test
        public Employee getEmployee() {
            String name = "Joseph  Banks";
            assertEquals(name, EmployeeTest.getName());
            return EmployeeTest;
        }
        public Employee getEmployee2(){
            String name = "Mike Lin";
            assertEquals(name, EmployeeTest.getName());
            return EmployeeTest;
        }

        public Employee getEmployee3() {
            String name = "Ike Sun";
            assertEquals(name, EmployeeTest.getName());
            return EmployeeTest;
        }
    }
}
