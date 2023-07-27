public class Sid {
    public int simpleMultiplication(int n) {
        if(n%2 == 0) n = n*8;
        else n = n*9;

        return n;
    }
}