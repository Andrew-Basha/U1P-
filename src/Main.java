import java.util.Scanner; //Importing scanner class
public class Main {
    public static void main(String[] args) {
        Scanner ask = new Scanner (System.in);
        System.out.print("Enter your Bill($): ");
        double bill = ask.nextDouble();
        ask.nextLine();
        System.out.print("Tip Percent: ");
        final double TIPPERCENT = ask.nextDouble();
        ask.nextLine();
        System.out.print("Number of People: ");
        final int NUMPERSON = ask.nextInt();
        ask.nextLine();
        double tip = TIPPERCENT * bill;
        tip = Math.round(tip);
        tip /= 100;
        bill += tip;
        double tipPerPerson = tip / NUMPERSON;
        double billPerPerson = bill/ NUMPERSON;
        tip = Math.round(tip * 100);
        bill = Math.round(bill * 100);
        tip /= 100;
        bill /= 100;
        tipPerPerson = Math.round(tipPerPerson * 100);
        billPerPerson = Math.round(billPerPerson * 100);
        tipPerPerson /= 100;
        billPerPerson /= 100;
        System.out.println(tip);
        System.out.println(bill);
        System.out.println(tipPerPerson);
        System.out.println(billPerPerson);

        // test for mod
        //System.out.println(1 % 0.1);
        //System.out.println(1.1 % 0.1);
        //System.out.println(1.05 % 0.1);
    }
}