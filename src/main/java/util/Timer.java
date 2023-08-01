package util;


public class Timer {

    private long timer1 = 0;

    private long timer2 = 0;

    public void Run(){
        timer1 = System.currentTimeMillis();
    }

    public void Stop(){
        timer2 = System.currentTimeMillis();
    }

    /*
        Calcolo del tempo trascorso tra il timer1 e il timer 2
     */
    public long CalcoloTempo(){
        return (timer2 - timer1);
    }

    public static void main(String[] args) {
        Timer t = new Timer();

        t.Run();
        for(int i = 0;i<10000;i++){
            System.out.println("Ciao");
        }
        t.Stop();
        System.out.println(t.CalcoloTempo());

    }

}
