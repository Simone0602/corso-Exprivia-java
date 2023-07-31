package Introduzione;

import java.util.Scanner;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {

        return ("Nome: " + getNome() + " " + "Cognome: " + getCognome() + " " + "Età: " + getEta());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = null;
        String cognome = null;
        int eta = 0;

        System.out.println("Inserisci il nome: ");
        nome = s.nextLine();

        System.out.println("Inserisci il cognome: ");
        cognome = s.nextLine();

        System.out.println("Inserisci l'età: ");
        do {
            eta = s.nextInt();
        }while(eta<0);

        Persona p = new Persona(nome, cognome, eta);


        System.out.println(p.toString());
    }
}
