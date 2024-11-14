public class Print {
    public static void main(String[] args) {
        /**
         * println
         * print
         * printf
         */

        int x = (int)5.5;
        double y = 10.12222222;
        System.out.print(x);
        System.out.print(y);
        System.out.printf("The value of variable x is %d", x);
        System.out.printf("%.4f", y);

        /**
         * %d – označava mesto na kome je potrebno umetnuti celobrojnu vrednost neke promenljive;
         * %n – označava prelazak u novi red, baš kao i sekvenca karaktera \n;
         * %.4f – označava mesto na kome je potrebno da se pojavi broj sa decimalnim delom; .4 označava da je broj potrebno zaokružiti na četiri decimale.
         */
    }
}
