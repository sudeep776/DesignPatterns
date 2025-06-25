package solid;

public class Employee extends User{
    public Employee(String name, String role) {
        super(name, role);
    }

    @Override
    void showPermissions() {
        System.out.println(getName()+ "employee");
    }
}
