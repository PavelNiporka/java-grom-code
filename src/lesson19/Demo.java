package lesson19;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args)throws Exception {

        Controller controller = new Controller();
        File file1 = new File(1, "test4", "txt", 3);
        File file2 = new File(8, "test2", "rar", 31);
        File file3 = new File(3, "test1", "txt", 7);
        File file4 = new File(5, "test4", "txt", 10);
        File file5 = new File(5, "test12", "txt", 12);


        File[] files1 = {file1, file2, file5,null};
        File[] files2 = {null, null, null, file5};
        File[] files3 = {file2, file5, null, file4};
        File[] files4 = {file1, file4, file2};

        String[] formatSupported = {"txt", "rar"};


        Storage storage1 = new Storage(12, files1, formatSupported, "USA", 90);
        Storage storage2 = new Storage(14, files2, formatSupported, "Chine", 200);
        Storage storage3 = new Storage(1, files3, formatSupported, "Malaysia", 200);
        Storage storage4 = new Storage(5, files4, formatSupported, "Canada", 455);
        Storage storage5 = null;


         // controller.put(storage1, file4);
       // System.out.println(controller.put(storage3, file3));


         //controller.delete(storage1,file4);

       //  controller.transferAll(storage1, storage2);
          // controller.transferFile(storage1,storage2,2);


    }
}
