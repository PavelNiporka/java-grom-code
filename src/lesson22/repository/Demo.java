package lesson22.repository;

import java.util.Arrays;

/**
 * Created by Паша on 02.07.2018.
 */
public class Demo {
    public static void main(String[] args) {
        User user1 = new User(1001, "Vsia", "7ytyyrt");
        UserRepository.save(user1);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));


        User user2 = new User(100, "Pasha", "453fff");
        UserRepository.save(user2);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        User user3 = new User(1001, "Misha", "y765t");
        UserRepository.update(user3);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        //  UserRepository = new UserRepository();
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));


    }


}
