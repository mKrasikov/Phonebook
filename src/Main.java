import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        ArrayList<Contact> arrayPhones = new ArrayList<Contact>();

        while (true) {
            System.out.println("Введите команду из списка:" + "\n" +
                    "1 - для создание контакта;" + "\n" +
                    "2 - вывод контактов на экран;" + "\n" +
                    "3 - удаление контакта;" + "\n" +
                    "4 - прекращеие ввода;");
            int command = Integer.parseInt(reader.readLine());
            if (command == 1) {
                System.out.println("Ввод имени, телефона и электронного адреса:");
                Contact contact = new Contact();
                Contact phones = new Contact();
                System.out.println("Введите имя:");
                contact.setName(reader.readLine());
                System.out.println("Введите электронный адрес:");
                contact.setEmail(reader.readLine());
                System.out.println("Введите телефон:");
//                contact.setPhone(reader.readLine());
                phones.setPhone(reader.readLine());
                System.out.println();
                arrayPhones.add(phones);
                contacts.add(contact);
//                contacts.addAll(arrayPhones.subList(0, 0));

                for (int i = 0; i < arrayPhones.size() + 1; i++) {
                    System.out.println("Введите команду из списка:" + "\n" +
                            "1 - для дщобавления ещё одного номера телефона;" + "\n" +
                            "0 - для прекращения ввода номера телефона;");
                    int c = Integer.parseInt(reader.readLine());
                    if (c == 1) {
                        System.out.println("Введите номер телефона:");
                        phones.setPhone(reader.readLine());
                        arrayPhones.add(phones);
                        System.out.println("Телефон добавлен." + "\n");
                    } else if (c == 0) {
                        break;
                    } else {
                        System.out.println("Неверная команда, попробуйте снова.");
                    }
//                    System.out.println("Введите команду из списка:" + "\n" +
//                            "1 - для дполонительных полей, возраст, адрес и место работы;" + "\n" +
//                            "0 - для прекращения создания контакта;");
//                    int d = Integer.parseInt(reader.readLine());
//                    if (d == 1) {
//                        DetailContact dContact = new DetailContact(contacts.get(i).getName(), contacts.get(i).getEmail(), arrayPhones.get(i).getPhone());
//                        System.out.println("Введите возраст:");
//                        dContact.setAge(Integer.parseInt(reader.readLine()));
//                        System.out.println("Введите место работы:");
//                        dContact.setWorkplase(reader.readLine());
//                        System.out.println("Введите адрес:");
//                        dContact.setWorkplase(reader.readLine());
//                    } else if (d == 0) {
//                        break;
//                    } else {
//                        System.out.println("Неверная команда, попробуйте снова.");
//                    }
                }

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
                System.out.println("Контакт добавлен." + "\n");




            }else if (command == 2) {
//                for (int i = 0; i < arrayPhones.size(); i++) {
//                    System.out.println(arrayPhones.get(i).getPhone());
//                }

                for (int i = 0; i < arrayPhones.size() + 100; i++) {
                    if (arrayPhones.size() == 1) {
                        contacts.get(i).print();
                        System.out.print("Телефон " + arrayPhones.get(0).getPhone() + ";" + "\n");
                    } else if (arrayPhones.size() > 1) {
                        contacts.get(i).print();
                        System.out.println("<--- phones --->" + "\n" +
                                arrayPhones.get(i).getPhone() + "\n" + "<<< Name's phones >>>" + "\n");
                    } else {
                        break;
                    }
                }


            } else if (command == 3) {
                System.out.println("Введите имя удяляемого контакта:");
                String remover = reader.readLine();
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getName().contains(remover)) {
                        contacts.remove(i);
                    }
                }
                System.out.println("Контакт " + remover + " удалён.");
            } else if (command == 4) {
                System.out.println("Добавление контактов завершенно.");
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
    }
}