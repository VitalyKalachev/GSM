public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int replenishment = 1000;
        int bonus = 12;
        if (replenishment >= 1000) {
            System.out.println(balance + replenishment + bonus);
        } else {
            System.out.println(balance + replenishment);
        }
    }
}