import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько у вас осталось зачётов :");
        int money = scanner.nextInt();
        try {
            int remains = isEnough(money);
            System.out.println("Всё отлично! \nУ Вас осталось " + remains);
        } catch (MoneyException e) {
            System.out.println("Вы не можете пройти на следующий курс. Вы не доздали предметы ");
            e.printStackTrace();
        }

    }

    private static int isEnough(int money) throws MoneyException {
        if (money < 1) {
            throw new MoneyException("К сожалению, Вам не хватает " + (1 - money) + " зачётов");
        }
        return money - 1;
    }
}