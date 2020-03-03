package lesson9.Homework;

import lesson12.User;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository4 {

    private User[] users;

    public UserRepository4(User[] users) {
        this.users = users;
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


    public User update(User user) {
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

    public void delete(long id) {
        int index = 0;

        for (User user : users) {

            if (user != null && id == user.getId())

                users[index] = null;


        }


    }


}
