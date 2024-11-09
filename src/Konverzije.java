public class Konverzije {

    //Automatska konverzija byte --> short

    public static void main(String[] args) {
        byte FirstBroj = 89;
        short broj = FirstBroj;
        System.out.println(FirstBroj);

        //Eksplicitna konverzija short --> byte

        short SecoudBroj = 127;
        byte DrugiBroj = (byte) SecoudBroj;
        System.out.println(DrugiBroj);
    }
}