public class main {
    public static void main(String[] args) {

        int k = 100;
        int p = 1100;
        int r = 100;
        int bonus = p/r;
        if (p>1000) {
            System.out.println("Количество бонусных рублей:" + bonus);
            System.out.println("Итоговый счёт:" + (bonus+k+p));
        }else {
            System.out.println("Количество бонусных рублей:0");
            System.out.println("Итоговый счёт:" + (k+p));
        }
    }
}
