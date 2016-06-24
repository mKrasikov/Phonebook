public class Contact {
    protected String name;
    protected String email;
    protected String phone;

    public Contact() {
    }

    public Contact(String phone) {
        getPhone();
    }

    public void print() {
        System.out.println(string());
    }

    public String string() {
        return "Список контактов:" + "\n" +  "Имя: " + name + "; Электронный адрес: " + email + ";";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}