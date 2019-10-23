import java.util.Scanner;

public class Client {
    private DispenseChain c1;

    public Client() {
        c1 = new Dollar50Dispensor();
        DispenseChain c2 = new Dollar20Dispensor();
        DispenseChain c3 = new Dollar10Dispensor();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Client atmDispensor = new Client();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if ( amount % 10 != 0) {
                System.out.println("The amount has to be multiple of 10");
                return;
            }

            atmDispensor.c1.dispense(new Currency(amount));
        }

    }
}
