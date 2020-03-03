package lesson30.task1;

/**
 * Created by Паша on 02.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1200, 4, 42323233);
        User user1 = new User(1001, "Denis", 1200, 40, "GMD", 111100, euBank);
        User user2 = new User(12,"Nik",1000,21,"IBM",500,euBank);
        BankSystem bankSystem = new UkrainianBankSystem();



        //  макс лимит на пополнение

        bankSystem.fund(user1,20001);
        System.out.println(user1.getBalance());


        // проверить можно ли снять
        // проверить лимит
        // снять деньги

         bankSystem.withdraw(user1, 150);
         System.out.println(user1.getBalance());

        // проверить можно ли снять
        // проверить лимит
        // проверяем на разность валют
        // снимаем деньги fromUser
        // проверяем макс лимит на пополнение
        // пополняем toUser

          bankSystem.transferMoney(user1,user2,200);
          System.out.println(user1.getBalance());



        //  проверяем  макс лимит  пополнение

         bankSystem.paySalary(user1,500);
         System.out.println(user1.getBalance());











    }


}
