public class Main {
    public static void main(String[] args) {

        int account = 100;
        int put = 1100;
        int one = 100;
        int bonus = put / one;
        if (put > 1000) {
            System.out.println("Количество бонусных рублей:" + bonus);
            System.out.println("Итоговый счёт:" + (bonus + account + put));
        } else {
            System.out.println("Количество бонусных рублей:0");
            System.out.println("Итоговый счёт:" + (account + put));
        }
    }
}
