package lesson9.Homework;

import lesson12.User;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository3 {
    private User[] users;

    public UserRepository3(User[] users) {
        this.users = users;
    }


    public User save(User user) {
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

    public User[] getUsers() {
        return users;
    }


    private User findById(long id) {
        for (User user : users) {

            if (user != null && id == user.getId())


                return user;

        }
        return null;


    }


}
