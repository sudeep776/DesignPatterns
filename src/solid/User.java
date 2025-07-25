package solid;

//Single responsibility - to create users
abstract class User {
    private String name;
    private String role;

    public User(String name,String role){
        this.name=name;
        this.role=role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void showPermissions();
}
