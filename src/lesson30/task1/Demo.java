package lesson30.task1;



/**
 * Created by Паша on 19.07.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1200, 4, 42323233);
        User user1 = new User(1001, "Denis", 1200, 40, "GMD", 111100, euBank);
        User user2 = new User(123,"Nik",1000,21,"IBM",500,euBank);
        UkrainianBankSystem bankSystem = new UkrainianBankSystem();



        //  макс лимит на пополнение

       // bankSystem.fund(user1,20001);
       // System.out.println(user1.getBalance());


        // проверить можно ли снять
        // проверить лимит
        // снять деньги

        //bankSystem.withdraw(user1, 150);
       // bankSystem.withdraw(user1, 10);
        bankSystem.paySalary(user1,600);
        System.out.println(bankSystem.getTransactions());

        // проверить можно ли снять
        // проверить лимит
        // проверяем на разность валют
        // снимаем деньги fromUser
        // проверяем макс лимит на пополнение
        // пополняем toUser

      //  bankSystem.transferMoney(user1,user2,200);
     //   System.out.println(user1.getBalance());



        //  проверяем  макс лимит  пополнение

     //   bankSystem.paySalary(user1);
       // System.out.println(user1.getBalance());


    }
}
