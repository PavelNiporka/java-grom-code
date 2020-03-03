package lesson27.homework;


import java.util.ArrayList;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository {

    private static ArrayList<User> users = new ArrayList<>();

    private static User findById(long id) throws Exception {
        int count = 0;
        for (User user : users) {
            if (user == null)
                throw new NullPointerException("Null was detected!");
            if (id == user.getId()) {
                return users.get(count);
            }
            count++;
        }
        return null;
    }

    public static User save(User user) throws Exception {
        if (user == null)
            throw new NullPointerException("Null was detected!");
        if (findById(user.getId()) != null)
            throw new Exception("User already saved");
        users.add(user);
        return user;
    }


    public static ArrayList getUsers() {
        return users;
    }

    public static User update(User user) throws Exception {
        if (user == null)
            throw new NullPointerException("Null was detected!");
        if (findById(user.getId()) == null)
            throw new Exception("User with ID " + user.getId() + " not found,and can't be update");
        users.set(users.indexOf(findById(user.getId())), user);
        return user;
    }

    public static void delete(long id) throws Exception {

        if (findById(id) == null)
            throw new Exception("User with ID " + id + " not found,and can't be deleted");
        users.remove(findById(id));

    }
}
