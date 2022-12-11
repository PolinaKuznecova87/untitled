package ru.netology.bonus;
public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        long amount = 1_000;
        boolean registered = true;

        long expected = 30;

        long actual = service.calculate(amount, registered);
        System.out.println("1. " + expected + " == ? == " + actual);

        amount = 1_000_000;
        registered = true;

        expected = 500;

        actual = service.calculate(amount, registered);
        System.out.println("2. " + expected + " == ? == " + actual);


        amount = 1_000;
        registered = false;

        expected = 10;
        actual = service.calculate(amount, registered);
        System.out.println("3. " + expected + " == ? == " + actual);


        amount = 1_000_000;
        registered = false;

        expected = 500;

        actual = service.calculate(amount, registered);
        System.out.println("4. " + expected + " == ? == " + actual);

    }
}
