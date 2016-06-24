public class DetailContact extends Contact {
    private int age;
    private String addres;
    private String workplase;

    public DetailContact (String name, String phone, String email) {
        super();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setWorkplase(String workplase) {
        this.workplase = workplase;
    }

    public String getWorkplase() {
        return workplase;
    }

    public int getAge() {
        return age;
    }

    public String getAddres() {
        return addres;
    }
}