import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        while (true) {
            System.out.println("Введите команду из списка:" + "\n" +
                    "1 - для создание контакта;" + "\n" +
                    "2 - вывод контактов на экран" + "\n" +
                    "3 - удаление контакта" + "\n" +
                    "4 - прекращеие ввода;");
            int command = Integer.parseInt(reader.readLine());
            if (command == 1) {
                System.out.println("Введите имя, телефон и электронный адрес:");
                Contact contact = new Contact();
                contact.setName(reader.readLine());
                contact.setPhone(reader.readLine());
                contact.setEmail(reader.readLine());
                contacts.add(contact);
                System.out.println("Контакт добавлен");
                for (int j = 0; j < contacts.size() - 1; j++) {
                    for (int i = 0; i < contacts.size() - 1 - j; i++) {
                        int minLenght = contacts.get(i).getName().length();
                        if (minLenght > contacts.get(i + 1).getName().length()) {
                            minLenght = contacts.get(i + 1).getName().length();
                        }
                        for (int k = 0; k < minLenght; k++) {
                            char left = contacts.get(i).getName().toCharArray()[k];
                            char right = contacts.get(i + 1).getName().toCharArray()[k];
                            if (left > right || contacts.get(i).getName().contains(contacts.get(i + 1).getName())) {
                                Contact temp = contacts.get(i);
                                contacts.set(i, contacts.get(i + 1));
                                contacts.set(i + 1, temp);
                                break;
                            } else if (left < right) {
                                break;
                            }
                        }
                    }
                }
            }
            else if (command == 2) {
                for (int i = 0; i < contacts.size(); i++) {
                    System.out.println("Список контактов:" + "\n" + "Имя: " + contacts.get(i).getName() + "; Телефон: " +
                            contacts.get(i).getPhone() + "; Электронный адрес: " + contacts.get(i).getEmail() + ";");
                }
            } else if (command == 3) {
                System.out.println("Введите имя удяляемого контакта:");
                String remover = reader.readLine();
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getName().contains(remover)) {
                        contacts.remove(i);
                    }
                }
                System.out.println("Контакт " + remover + " удалён");
            } else if (command == 4) {
                System.out.println("Я устал, я ухожу.");
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
    }
}