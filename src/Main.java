public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int replenishment = 1000;
        int bonus;
        if (replenishment >= 1000) {
            System.out.println((balance + replenishment) / 100);
            bonus = 12;
            System.out.println(balance + replenishment + bonus);
        } else {
            System.out.println(balance + replenishment);
            bonus = 0;
        }
    }
}