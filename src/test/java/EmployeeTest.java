import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void modifyVal() {
        Employee emp = new Employee();
        System.out.println(emp.age);
        emp.modifyVal(emp.age);
        System.out.println(emp.age);
    }
}