import java.util.*;

public class Employee {
    public int add() {
        int a = 10, b = 10;
        int c = a + b;

        System.out.println("addition is" + c);
        return c;
    }

    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.add();
    }
}
