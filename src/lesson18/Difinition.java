package lesson18;

public class Difinition {


    private void notifyUser(String[] usersEmails) {

        for (String email : usersEmails) {
            //обработка ошибки
            try {
                //send mail to user - error
                System.out.println("Email" + email + " was send");
                //updateStatus
            } catch (Exception e) {
                //how should i handle exception
                System.out.println("Email" + email + " was not send");
            } finally {
            }
            //    }  catch (type2 e){
        }
    }
}



