package lesson13;

/**
 * Created by Паша on 07.11.2017.
 */
public class UserRepository {


    public User[] users = new User[10];


    private User findById(long id) {
        for (User user : users) {

            if (user != null && id == user.getId());


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
        User curUser = findById(user.getId());
        if (curUser == null)

            return null;


        int index = 0;

        long curUserId = curUser.getId();
        for (User us : users) {

            if (us != null && us.getId() == curUserId) {

                users[index] = user;
                break;

            }
            index++;

        }
        return user;


    }

    public void delete(long id) {
        int index = 0;

        for (User user : users) {

            if (user != null && id == user.getId())

                users[index] = null;


        }


    }

    public User[] getUsers() {
        return users;
    }
}
