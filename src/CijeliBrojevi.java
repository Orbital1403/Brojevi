public class CijeliBrojevi {

    //byte, short, int, i long

        public static void main(String[] args) {
            int broj1 = 10; // deklaracija i inicijalizacija varijable
            int broj2 = -5; // negativni broj
            int zbroj = broj1 + broj2; // zbrajanje
            System.out.println("Zbir brojeva je: " + zbroj);

            byte maliBroj = (byte) 129;
            System.out.println("Vrijednost byte varijable je: " + maliBroj);
            short srednjiBroj = 128;
            System.out.println("Vrijednost short varijable je:" + srednjiBroj);
            long dugiBroj = 99999999999L;
            System.out.println("Vrijednost long varijable je:" + dugiBroj);
        }
    }

// byte - 8 bitova = 1 byte - (od  -128 do 127) - Koristi se kada je potrebno raditi s malim cijelim brojevima i u situacijama gdje je memorija ograničena, poput ugradbenih sistema
// short - 16 bita (-32,768 do 32,767) - Koristi se kada su potrebni malo veći cijeli brojevi nego što ih može pohraniti byte, ali kada i dalje želimo smanjiti potrošnju memorije u odnosu na int tip
// int – 32 bita za celobrojne vrednosti koje se uklapaju u interval od -2,147,483,648 do 2,147,483,647.
// long – 64 bita za celobrojne vrednosti koje su veće od onih koje može da stane u int. Interval za long je od -9,223,372,036,854,775,808 do 9,223,372,036,854,775,807.