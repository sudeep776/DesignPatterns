package solid;

//open close principle
public class Manager extends User{
    public Manager(String name, String role) {
        super(name, role);
    }

    @Override
    void showPermissions() {
        System.out.println(getName()+ "manager");
    }
}
