public class Main {
    public static void main(String[] args) {

        int a = 250;
        int replenishment = 1000;
        boolean isReplenishment = true;
        int bonus;
        if (isReplenishment) {
            bonus = 12;
        } else{
            bonus = 0;
            System.out.println(a + replenishment + bonus);
        }
    }
}