package lesson9.Homework;

import lesson12.User;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository2 {


    private User[] users;

    public UserRepository2(User[] users) {
        this.users = users;
    }


    public User getUserByName(String Name) {
        for (User user : users) {
            if (user != null && Name.equals(user.getName())) {
                return user;
            }


        }
        return null;


    }

    public User getUserById(long id) {
        for (User user : users) {

            if (user != null && id == user.getId())


                return user;

        }
        return null;


    }

    public User[] getUsers() {
        return users;
    }

    public User getUserBySessionId(String getSessionId) {
        for (User user : users) {
            if (user != null) {
                return user;
            }
        }
        return null;
    }


}


