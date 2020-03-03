package lesson11.biginterfaceexemple;

/**
 * Created by Паша on 25.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test", "C:/user/home", "txt", 11);
        File file2 = new File("test", "C:/user/home", "txt", 11);
        File file3 = new File("test", "C:/user/home", "txt", 11);
        //File file4 = new File("test", "C:/user/home", "txt", 11);
        File file5 = new File("test", "C:/user/home", "txt", 11);

        File[] files = new File[]{file1, file2, file3, null, file5};
        Storage storage = new Storage(files);
        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();
        read(storage, fileReader);
        read(storage, simpleReader);
        // readFileReader(storage, fileReader);
        //  readFileSimpleReader(storage, simpleReader);


    }

    private static void read(Storage storage, Readable readable) {
        System.out.println("method is starting");
        readable.readFilesFromStorage(storage);

    }

      /* private static void readFileReader(Storage storage, Readable readable) {
           System.out.println("method is starting");
          readable.readFilesFromStorage(storage);
       }

    private static void readFileSimpleReader(Storage storage, Readable readable) {
           System.out.println("method is starting");
           readable.readFilesFromStorage(storage);

       }

*/
}
