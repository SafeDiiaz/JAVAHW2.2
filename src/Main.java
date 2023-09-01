public class Main {public static void main(String[] args) {

    int balance = 1000;
    int amount = balance;
    if (amount <1000){amount = 0;}
    int bonuses = amount / 100;
    int sumbalance = balance + bonuses;

    System.out.println("Ваш баланс " + sumbalance + ", вам начислено " + bonuses + " бонусов");
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
}
}
