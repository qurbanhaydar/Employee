public class Manager extends Employee{
    private int responsible_persons;

    public Manager(String name, String surname, int id, int responsible_persons) {
        super(name, surname, id);
        this.responsible_persons = responsible_persons;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("People whom is the manager responsible: " +responsible_persons);
    }
    public void get_a_raise(int raise){
        System.out.println(getName()+" increased salaries by " +raise + " dollars");
    }
}
