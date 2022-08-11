public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int sumAmount = 1_010;

        if (sumAmount > 1_000) {
            System.out.println("Итоговый счёт: " + (customerAccount + sumAmount) + ", Количество бонусов: " + (sumAmount / 100));
        }
    }
}