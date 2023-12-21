public class Practice2 {
    public static int daysToWirhdraw(int N){
        int days = 0;

        while (N > 0) {
            for (int i = 1; i < N; i++) {
                if(N % i == 0 && N - i >= 0) {
                    N -=i;
                    days++;
                    break;
                }
            }
        }
        return days;
    }

    public static void main(String[] args) {
        int amount = 21;

        int daysNeeded = daysToWirhdraw(amount);
        System.out.println("Для снятия всех денег понадобится " + daysNeeded + " дней.");
    }
}
