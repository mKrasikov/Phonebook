public class UserFriend extends User {
    private String phone;
    private String email;

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

/*
Теория:
1) private, public, protected, default (нет модификатора)
    - особенности модификаторов относительно пакетов.
2) Создать иерарзию классов геометрических фигур (2D).
    Shape(2D) - в этом классе поля и методы для всех фигур.
    MulitiAngle - класс многоукольников - родитель всех фигур с углами1.
    Circle
    .
    .
    .
 */