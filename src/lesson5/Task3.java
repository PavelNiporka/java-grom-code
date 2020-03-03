package lesson5;


/**
 * Created by Паша on 24.07.2017.
 */

// 1.Найти количество клиентов +
// 2.Снять деньги со счёта определенного клиента +
// 3.Сделать проверку счета+

// 4.Вернуть остаток денег, или -1 если денег не достаточно+


public class Task3 {
    public static void main(String[] args) {


        String[] names = {"Jack", "Ann", "Denis"};
        int[] balances = {100, 500, 8432,};
        withdraw(names, balances, "Ann", 300);

    }

    static int withdraw(String[] clients, int[] balances, String client, int amount) {
        if (balances[findClientIndexByName(clients, client)] < amount) {
            return -1;
        } else {
            if (balances[findClientIndexByName(clients, client)] >= amount) {
                balances[findClientIndexByName(clients, client)] -= amount;

            }
        }


        return balances[findClientIndexByName(clients, client)];

    }

    static int findClientIndexByName(String[] clients, String client) { // Найти количество клиентов

        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;

    }


}




