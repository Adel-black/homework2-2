public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int bonus = 0;
        int sumAmount = 700;

        if (sumAmount > 1000) {
            bonus = sumAmount/100;
        }
        customerAccount = customerAccount + sumAmount + bonus;
        System.out.println("На вашем счету: " + customerAccount);
        System.out.println("Всего бонусов: " + bonus);
    }
}