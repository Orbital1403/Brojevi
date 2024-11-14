public class LogickiOperarori {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        System.out.println((value1 == 1) && (value2 == 2));
        System.out.println((value1 == 1) || (value2 == 2));
    }
}

/**
 * &&	AND	(6 < 11 && 5 > 1)       true        - Operator AND zahteva ispunjenje svih navedenih uslova kako bi proizveo vrednost true. U protivnom, proizvodi vrednost false.
 *          (6 < 5 && 5 > 1)        false
 *
 * ||   OR  (6 < 5 || 5 > 1)        true        - Operator OR zahteva ispunjenje samo jednog od uslova kako bi kao svoju finalnu vrednost proizveo true
 *
 * !    NOT !(6==6)                 false       - Operator NOT je operator negacije, koji true vrednost pretvara u false, a false u true,
 *          */