package lesson13;

import java.util.Arrays;

/**
 * Created by Паша on 07.11.2017.
 */
public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
       // System.out.println(Arrays.deepToString(userRepository.getUsers()));
        User user = new User(123, "Ann", "123qwe");
      //  userRepository.save(user);
      //  System.out.println(Arrays.deepToString(userRepository.getUsers()));
      //  userRepository.save(user);
     //   System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //сохранение юзера+
        //сохранение того же юзера+
        //когда нет места в массиве+
        //когда сохраняем null+
       // int n = 2;
      /*  while (n > 0) {
            User user1 = new User(n, "Ann", "123qwe");
           // userRepository.save(user1);
            System.out.println(userRepository.save(user1));
            n--;

        }
        */
     //   System.out.println(Arrays.deepToString(userRepository.getUsers()));

    //    userRepository.save(null);

        // test update
    //    user = new User(123,"Ann","23qw");
     //   userRepository.update(user);
      //  System.out.println(Arrays.deepToString(userRepository.getUsers()));



        //обновление юзера+
        //когда нет юзера на обновление+
        //когда обновляем null+
     //   user = new User(122,"Ann","23qw");
      //  System.out.println(userRepository.update(user));
    //    System.out.println(Arrays.deepToString(userRepository.getUsers()));


        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //удаляет юзера
       // user = new User(12,"Ann","2fwe");
        userRepository.delete(123);

        System.out.println(Arrays.toString(userRepository.getUsers()));




    }

}
