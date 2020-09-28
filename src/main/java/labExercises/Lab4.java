package labExercises;

import extraClasses.ScannerWrapper;

public class Lab4 {

    public void setScannerWrapper(ScannerWrapper scannerWrapper) {
        this.scannerWrapper = scannerWrapper;
    }

    ScannerWrapper scannerWrapper = new ScannerWrapper();


    public void executeProof() {

        System.out.println("Enter a valid bank acount number");
        ScannerWrapper input = new ScannerWrapper();
        String bankNumber = input.read();
        //System.out.prinln(bankNumber.length());
        algorithm(bankNumber);

    }

    public static void algorithm(String nr) {
        int sum = 0;
        int pos = 0;
        for (int index = 9; index > 0; index--) {
            sum += index * Integer.parseInt(nr.charAt(pos++) + "");
            System.out.println(sum);
        }
        if (sum % 11 == 0) {
            System.out.println("Bank account number is valid");
        } else {
            throw new IllegalArgumentException();
        }
    }
}
