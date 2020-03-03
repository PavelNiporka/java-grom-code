package lesson19;
// 1.Файлы считаються одинаковыми если у них равные ID и имя
// 2.Storage может хранить файлы только поддерживаемого формата
// 3.Учитывайте максимальный размер хранилища
// 4.В одном хранилище не могут храниться файлы с одинаковыми ID,но могут храниться файлы с одинаковыми именами
// 5.Имя файла не может быть больше 10 символов,файл с таким именем не может быть создан
// 6.

public class Controller {

    public File put(Storage storage, File file) throws Exception {


        validate(storage,file);


        for (File fileInStorage : storage.getFiles()) {
            if (fileInStorage == null) {
                fileInStorage = file;
                return file;
            }
        }


        throw new Exception("There are no empty cells in storage " + storage.getId() + " for file " + file.getId());
    }


    public File delete(Storage storage, File file) throws Exception {


        checkId(storage, file.getId());
        for (File fileInStorage : storage.getFiles()) {
            if (fileInStorage != null && fileInStorage.getId() == file.getId())
                fileInStorage = null;
            return fileInStorage;

        }
        throw new Exception("In storage " + storage.getId() + " file with ID " + file.getId() + " not found");

    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {

        for (File filesFrom : storageFrom.getFiles()) {

            if (filesFrom != null)

                put(storageTo, filesFrom);

        }

    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {


        put(storageTo, checkId(storageFrom, id));


    }

    // Storage может хранить файлы только поддерживаемого формата

    private boolean checkFormat(Storage storage, File file) {
        for (String format : storage.getFormatsSupported()) {
            if (file != null && file.getFormat().equals(format))
                return true;
        }
        return false;
    }

    //Файлы считаються одинаковыми если у них равные ID и имя
    // В одном хранилище не могут храниться файлы с одинаковыми ID,но могут храниться файлы с одинаковыми именами

    private File checkId(Storage storage, long id) throws Exception {

        for (File file : storage.getFiles()) {
            if (file != null && file.getId() == id)
                return file;
        }
        throw new Exception("In storage " + storage.getId() + " file with ID " + id + " not found");

    }


    // Учитывайте максимальный размер хранилища

    private boolean maxStorageSize(Storage storage, File file) {

        if (storage.getStorageSize() - sumSizeFiles(storage) < file.getSize()) {
            return false;
        }
        return true;

    }
    // Сумма всех файлов в хранилище

    private long sumSizeFiles(Storage storage) {
        long sum = 0;
        for (File file : storage.getFiles()) {
            if (file != null)
                sum += file.getSize();
        }

        return sum;
    }


    //проверяем входящие файлы по ID
    private boolean checkIncomeFileById(Storage storage, File file) {

        for (File StorageFiles : storage.getFiles()) {
            if (StorageFiles != null && StorageFiles.getId() == file.getId()) {
                return true;

            }
        }
        return false;
    }


    private void validate(Storage storage, File file) throws Exception {
        if (storage.getFiles() == null || file == null)
            throw new NullPointerException("Null file data is detected");
        if (!checkFormat(storage, file))
            throw new Exception("The storage " + storage.getId() + " has another format");
        if (!maxStorageSize(storage, file))
            throw new Exception("No free space in the  storage " + storage.getId());
        //  if (checkIncomeFileById(storage, file))
        //      throw new Exception("File with ID " + file.getId() + " already in storage " + storage.getId());

    }

}