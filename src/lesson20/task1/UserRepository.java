package lesson20.task1;

import lesson20.task1.exception.BadRequestException;
import lesson20.task1.exception.InternalServerException;
import lesson20.task1.exception.UserNotFoundException;

/**
 * Created by Паша on 11.09.2017.
 */
public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User findById(long id) throws UserNotFoundException {
        for (User user : users) {

            if (user != null && id == user.getId())


                return user;

        }
        throw new UserNotFoundException("User with id: " + id + " not found");


    }


    public User save(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't save null user");


        try {
            if (findById(user.getId()) != null)

                throw new BadRequestException("User with id: " + user.getId() + " already exist");

        } catch (UserNotFoundException e) {
            System.out.println("User with id: " + user.getId() + " not found. Will be saved");
        }
        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServerException("Not enough space to save user with id: " + user.getId());


    }

    public User[] getUsers() {
        return users;
    }


    public User update(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't save null user");

        findById(user.getId());


        int index = 0;

        for (User us : users) {

            if (us != null && us.getId() == user.getId()) {

                users[index] = user;

                return users[index];

            }
            index++;

        }
        throw new InternalServerException("Unexpected error");


    }

    public void delete(long id) throws Exception {

        findById(id);

        int index = 0;

        for (User user : users) {

            if (user.getId() == id) {

                users[index] = null;
                break;

            }
            index++;

        }

    }
}
