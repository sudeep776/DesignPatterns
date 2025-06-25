package solid;

//dependency injection , dependency inversion
public class Main {

    private OrgRepositoryImpl orgRepository;

    public Main(OrgRepositoryImpl orgRepository){
        this.orgRepository=orgRepository;
    }
s
    public void run(){
        User manager = new Manager("sudeep","manager");
        User employee = new Employee("Rahul","employee");

        orgRepository.savePeople(manager);
        orgRepository.savePeople(employee);

        int result = orgRepository.getPeopleCount();
        System.out.println(result);
    }

    public static void main(String[] args) {
        OrgRepositoryImpl orgRepository1 = new OrgRepositoryImpl();
        Main main = new Main(orgRepository1);
        main.run();
    }
}
