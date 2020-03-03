package lesson15.homework;




/**
 * Created by Паша on 02.04.2018.
 */
public class UserRepository {

    private User[] users = new User[10];


    public User findById(long id) {
        for (User user : users) {

            if (user != null && id == user.getId())


                return user;

        }
        return null;


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

            if (user != null && user.equals(findById(user.getId())))

                users[index] = null;


        }


    }


}
