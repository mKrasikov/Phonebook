public class Contact {
    public Contact() {

    }

    protected String name;
    protected String phone;
    protected String email;

    public void print() {
        System.out.println(string());
    }

    public String string() {
        return "Имя: " + name + ": Телефон: " + phone + "; Электронный адрес: " + email + ";";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}