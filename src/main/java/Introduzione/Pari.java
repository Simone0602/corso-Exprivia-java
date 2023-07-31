package Introduzione;

public class Pari {
    private int numero;

    public Pari() {}

    public boolean isPari(){
        return (this.numero % 2 == 0);
    }

    public boolean isDispari(){
        return isPari();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        Pari n = new Pari();
        n.setNumero(5);
        if(n.isPari())
            System.out.println("E' pari");
        else
            System.out.println("E' dispari");
    }
}
