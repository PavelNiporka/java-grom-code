package lesson5;

import java.util.Arrays;

/**
 * Created by Паша on 30.04.2017.
 */
public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100,1500, 8432, -99, 12000, -54, 200};

        System.out.println(Arrays.toString(findClientsByBalance(names, balances, 100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));
        depositMoney(names, balances, "Ann", 0);
        System.out.println(Arrays.toString(balances));

    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        // String[] results = new String[clients.length];
        // 1.находим коли-во результатов
        // 2.создаем массив с длинной результатов
        // 3.записываем результаты

        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;

        }
        String[] results = new String[count];
        System.out.println(Arrays.toString(results));

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
                System.out.print(resIndex);
            }
            index++;
            System.out.print(index);

        }

        return results;
    }

    static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }
        String[] result = new String[count];
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                result[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return result;
    }

    static void depositMoney(String[] clients, int[] balances, String client, int money) {
        //1.Найти клиента в базе (в нашем случае в массивах)
        //2. Считаем сумму пополнения с учетом комиссии
        //3. обновляет баланс (полняем)
        // int clientIndex =  findClientIndexByName(clients,client);
        //   int moneyToDeposit = calculateDepositAmountAfterCommission(money);

        balances[findClientIndexByName(clients, client)] += calculateDepositAmountAfterCommission(money);
    }

    static int findClientIndexByName(String[] clients, String client) {

        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;

    }

    static int calculateDepositAmountAfterCommission(int money) {

        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);

    }


}
