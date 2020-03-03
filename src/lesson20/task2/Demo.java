package lesson20.task2;


import java.util.Arrays;
import java.util.Date;

/**
 * Created by Паша on 09.06.2018.
 */
public class Demo {

    public static void main(String[] args) throws Exception {

        Transaction[] transactions = new Transaction[10];

       // Controller controller = new Controller();


        transactions[0] = new Transaction(9, "Kiev", 10, "income", TransactionType.INCOME, new Date(3, 3, 3));
        transactions[1] = new Transaction(94, "Odessa", 15, "Outcome", TransactionType.OUTCOME, new Date(3, 3, 3));
        transactions[2] = new Transaction(33, "Kiev", 5, "income", TransactionType.INCOME, new Date());
        transactions[3] = new Transaction(335, "Kiev", 25, "Outcome", TransactionType.OUTCOME, new Date());
        transactions[4] = new Transaction(111, "Kiev", 10, "income", TransactionType.INCOME, new Date());
        transactions[5] = new Transaction(54, "Kiev", 10, "Outcome", TransactionType.OUTCOME, new Date());
        transactions[6] = new Transaction(26, "Kiev", 2, "income", TransactionType.INCOME, new Date());
        transactions[7] = new Transaction(453, "Odessa", 10, "Outcome", TransactionType.OUTCOME, new Date());
        //transactions[8] = new Transaction(2131, "Kiev", 4, "income", TransactionType.INCOME, new Date());
        //    transactions[9] = new Transaction(211, "Kiev", 4, "income", TransactionType.INCOME, new Date());


        for (Transaction tr : transactions) {
            try {
                System.out.println(Controller.save(tr));
            } catch (Exception e) {

                System.out.println(e.getMessage());

            }


        }


        Transaction tr1 = new Transaction(129, "Kiev", 3, "income", TransactionType.INCOME, new Date(3, 5, 6));
        Transaction tr2 = new Transaction(12, "Odessa", 3, "outcome", TransactionType.OUTCOME, new Date(3, 5, 6));
        Transaction tr3 = null;
        try

        {
            Controller.save(tr1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Controller.save(tr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {

            Controller.transactionList("Kiev");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // System.out.println(controller.save(transaction1));
        //  controller.save(tr2);
        // controller.save(transaction2);
        // controller.save(transaction3);
        // controller.save(transaction4);
        //   controller.save(transaction5);
        //  controller.save(transaction6);
        //  Transaction[] transactions1 = {transaction1, transaction2, transaction3,transaction4};

        //   System.out.println(Arrays.toString(transactions1));


        //  controller.transactionList();





    }

}
