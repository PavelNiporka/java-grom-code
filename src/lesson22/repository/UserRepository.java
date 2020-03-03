package lesson22.repository;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository {

    private static User[] users = new User[10];

    public static User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }

    public static User save(User user) {
        if (user != null && findById(user.getId()) != null)
            return null;
        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        return null;
    }

    public static User[] getUsers() {
        return users;
    }

    public static User update(User user) {
        if (user == null)
            return null;
        int index = 0;
        for (User us : users) {
            if (us != null && us.equals(findById(user.getId()))) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        return null;
    }

    public static void delete(long id) {
        int index = 0;
        for (User user : users) {
            if (user != null && id == user.getId())
                users[index] = null;
        }
    }
}
