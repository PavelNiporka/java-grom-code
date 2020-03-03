package lesson27.homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Паша on 16.07.2018.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        User user1 = new User(2, "Pasha", "321we");
        User user2 = new User(4, "Vasia", "ew123");
        User user3 = new User(5, "Vaa", "ew123");

//        ArrayList<User> arrayList = new ArrayList<>();
        //  UserRepository.save(user1);
        System.out.println(UserRepository.save(user1));
        UserRepository.delete(2);
        System.out.println(UserRepository.getUsers());
        UserRepository.save(user2);
        UserRepository.save(user1);
        System.out.println(UserRepository.getUsers());
       // UserRepository.delete(4);
        UserRepository.delete(3);
        System.out.println(UserRepository.getUsers());

    }


}
