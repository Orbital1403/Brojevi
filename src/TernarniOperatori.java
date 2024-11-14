public class TernarniOperatori {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Koristimo ternarni operator da odredimo veći broj
        int max = (a > b) ? a : b;

        // Štampamo rezultat
        System.out.println("Veći broj je: " + max);
    }
}

//Objašnjenje
 /*
 Uslov (a > b): Proverava da li je a veće od b.
 Vrednost ako je uslov true: Ako je a veće, dodeljuje se vrednost a.
 Vrednost ako je uslov false: Ako a nije veće, dodeljuje se vrednost b.
 U ovom slučaju, pošto je 10 manje od 20, izraz (a > b) će biti false, pa će max dobiti vrednost 20. Kada se ispiše, rezultat će biti: 20
 */