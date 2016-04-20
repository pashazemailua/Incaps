/**
 * Created by Pavel on 20.04.2016.
 */
public class Multiplicator {
    public static int mul(int x, int y){
        int accum = 0;
        for (int i=1; i<=y; i++) {
            accum = add (accum, x);   // accum = accum + x;
        }
        return accum;
    }

    private static int add(int x, int y){  //для  суммирования двух чисел
        return x+y;
    }
}
