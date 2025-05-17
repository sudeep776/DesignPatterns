package Creational_Patterns.Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John Doe")
                .setAge(30)
                .setAddress("123 Main Street")
                .setPhone("9876543210")
                .build();

        person.showDetails();
    }
}

class Person {
    //require params
    private String name;

    //optional
    private int age;
    private String address;
    private String phone;

    private Person(PersonBuilder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.address=builder.address;
        this.phone=builder.phone;
    }

    public static class PersonBuilder{
        private String name;
        private int age;
        private String address;
        private String phone;

        public PersonBuilder(String name){
            this.name=name;
        }

        public PersonBuilder setAge(int age){
            this.age=age;
            return this;
        }

        public PersonBuilder setAddress(String address){
            this.address=address;
            return this;
        }
        public PersonBuilder setPhone(String phone){
            this.phone=phone;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}