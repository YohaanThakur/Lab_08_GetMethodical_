import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid integer! Not: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!done);
        return retValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0;
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid number! Not: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!done);
        return retValue;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("Number is out of range!");
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter an integer! Not: " + trash);
            }
            pipe.nextLine();
        } while (!done);
        return retValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0;
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("Value is out of range!");
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a number! Not: " + trash);
            }
            pipe.nextLine();
        } while (!done);
        return retValue;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
        } while (!response.equals("Y") && !response.equals("N"));
        return response.equals("Y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response;
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
        } while (!response.matches(regEx));
        return response;
    }

    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int padding = (WIDTH - msg.length() - 6) / 2;
        System.out.println("*".repeat(WIDTH));
        System.out.print("***" + " ".repeat(padding) + msg + " ".repeat(WIDTH - msg.length() - padding - 6) + "***\n");
        System.out.println("*".repeat(WIDTH));
    }
}


