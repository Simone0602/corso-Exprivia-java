package util;

public class Fibonacci {

    public Long getRicorsivo(Long n) {
        if(n==0)
            return 1L;
        if(n.equals(1L))
            return 1L;
        return getRicorsivo(n-1) + getRicorsivo(n-2);
    }

    public void nonRicorsivo(){
        int count = 44, var1 = 1, var2 = 1, j = 0;
        for (int i = 2; i < count; ++i) {
            System.out.println("Fibonacci " + j + "->" + var1);
            int added_sum = var1 + var2;
            var1 = var2;
            var2 = added_sum;
            j++;
        }
    }

    public static void main(String[] args) {
        Timer t = new Timer();
        t.Run();
        Fibonacci f = new Fibonacci();
        final long LIMIT = 42L;
        for(long i = 0; i < LIMIT; i++){
            Long fibonacci = f.getRicorsivo(i);
            System.out.println("Fibonacci " + i + "->" + fibonacci);
        }
        t.Stop();
        System.out.println(t.CalcoloTempo());

        Timer tt = new Timer();
        tt.Run();

        f.nonRicorsivo();
        tt.Stop();
        System.out.println(tt.CalcoloTempo());
    }

}
