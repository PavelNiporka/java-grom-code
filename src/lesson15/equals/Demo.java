package src.lesson15.equals;

/**
 * Created by Паша on 28.11.2017.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File(111, "home/documents/test", "txt");

        File file2 = new File(111, "home/documents/image", "jpg");

        File file3 = new File(111, "home/documents/test", "txt");
        File someFile = file1;

        System.out.println(file1.equals(file2));
        System.out.println(file1.hashCode());
        System.out.println(file3.hashCode());
        System.out.println(file1.equals(file3));

        System.out.println(file1 == file3);

        System.out.println(file1 == someFile);


        User user = new User(1001);
        System.out.println(file1.equals(user));
        //user1 == user2;
        //user1.getId() == user2.getId();


    }


}
