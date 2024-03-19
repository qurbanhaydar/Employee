public class Developer extends Employee {
    private String languages;
    public Developer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;

    }
    public void formatting (String operating_system){
        System.out.println(getName() + " formatting " + operating_system + "operating system..");

    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Developer knows these languages: " + languages);
    }

}