// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        return  temperature1 > 100 && temperature2 < 100;
    }
    public static void main(String[] args) {
        int temperature1 = 105;
        int temperature2 = 95;

        boolean isDeviceOK = isDeviceWorking(temperature1, temperature2);
        System.out.println("Приббор работает корректно: " + isDeviceOK);


    }
}