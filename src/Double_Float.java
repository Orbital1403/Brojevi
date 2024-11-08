public class Double_Float {
    // 1. Preciznost
    //double ima veću preciznost od float.
    //double koristi 64 bita za pohranu broja, što omogućava veću preciznost i širinu opsega vrednosti.
    //float koristi 32 bita, što znači manju preciznost i manji opseg vrednosti.
    //2. Veličina (memorija)
    //double zauzima više memorije od float.
    //double zauzima 8 bajtova (64 bita).
    //float zauzima 4 bajta (32 bita).


        public static void main(String[] args) {
            double broj1 = 10;
            double broj2 = 4;

            // Deljenje sa decimalnim rezultatom
            double rezultat = broj1 / broj2;
            System.out.println("Rezultat deljenja sa decimalama: " + rezultat); // Rezultat je 2.5
        }
    }

