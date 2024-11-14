public class LogickiOperarori {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        System.out.println((value1 == 1) && (value2 == 2));
        System.out.println((value1 == 1) || (value2 == 2));
    }
}

/**
 * &&	AND	(6 < 11 && 5 > 1)       true
 *          (6 < 5 && 5 > 1)        false
 *
 * ||   OR  (6 < 5 || 5 > 1)        true
 *
 * !    NOT !(6==6)                 false
 *          */