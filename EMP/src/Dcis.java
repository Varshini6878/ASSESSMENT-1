public class Dcis {
    private String name;
    private String department;

    public Dcis() {
    }

    public Dcis(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public static void main(String[] args) {
        Dcis dcis = new Dcis();
        dcis.setName("Jack");
        dcis.setDepartment("QA");

        System.out.println("Name:" + dcis.getName());
        System.out.println("Department:" + dcis.getDepartment());
    }
}