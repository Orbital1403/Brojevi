public class Inkrement_Dekrement {
    public static void main(String[] args){
       int x = 10;
       int y = x++;
       int a = 10;
       int b = ++a;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
//x++ (post-increment): Kada napišeš y = x++, prvo se vrijednost x dodjeljuje varijabli y, a tek nakon toga se x povećava za 1
//++x (pre-increment): Kada napišeš y = ++x, prvo se x povećava za 1, a zatim se nova vrijednost dodjeljuje varijabli y