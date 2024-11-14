/**
 * =	dodeljuje vrednost sa desne strane promenljivoj sa leve	x = y	x = y
 * +=	uvećava vrednost promenljive x za vrednost y i novodobijenu vrednost dodeljuje promenljivoj x	x += y	x = x + y
 * -=	umanjuje vrednost promenljive x za vrednost y i novodobijenu vrednost dodeljuje promenljivoj x	x -= y	x = x - y
 * *=	množi vrednost promenljive x sa vrednošću y i novodobijenu vrednost dodeljuje promenljivoj x	x *= y	x = x * y
 * /=	deli vrednost promenljive x sa vrednošću y i novodobijenu vrednost dodeljuje promenljivoj x	x /= y	x = x / y
 * %=	računa ostatak deljanja vrednosti x vrednošću y i dobijeni rezultat dodeljuje promenljivoj x	x %= y	x = x % y
 */
public class OperatoriDodjeljivanja {
    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println(x);
    }
}
