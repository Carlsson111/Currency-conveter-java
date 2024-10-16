package se.lexicon;

public class Converter {
    public static void main(String[] args) {
        public static void Sek_to_other(double amt) {
            System.out.println("1 Sek = " + 0.1 + " Dollar");
            System.out.println();

            System.out.println(amt+" Sek = " + (amt*0.1) + " Dollar");
            System.out.println();

            System.out.println("1 Sek = " + 0.09 + " Euro");
            System.out.println();
            System.out.println(amt+" Sek = " + (amt*0.09) + " Euro");
            System.out.println();

        }
    }
    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 9.96 + " Sek");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*9.96) + " Sek");
        System.out.println();

        System.out.println("1 Dollar= " + 0.91 + " Euro");
        System.out.println();

        System.out.println(amt+" Dollar = " + (amt*0.91) + " Euro");
    }



    public static void Euro_to_other(double amt){
        System.out.println("1 Euro = " + 10.98 + " Sek");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*10.98) + " Sek");
        System.out.println();

        System.out.println("1 Euro = " + 1.1+ " Dollar");
        System.out.println();

        System.out.println(amt+" Euro = " + (amt*1.1)+ " Dollar");
    }

}
