public class Main {
    public static void main(String[] args) {

        int amount = 4800;
        int remainder = 300;

        int bonus;
        if (amount > 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }

        int all = (amount + remainder + bonus);
        System.out.println((bonus) + " Бонусный рублей");
        System.out.println((all) + " Итоговый счет");
    }

}