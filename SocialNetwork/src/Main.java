import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * Created by Student07 on 14.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.getAge();
        user.getNsme();

        UserFriend friend = new UserFriend();

        friend.getPhone();
        friend.getEmail();
        friend.getNsme();
        friend.getAge();
    }
}
