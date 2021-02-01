package org.elle.gestioncompte.entitis;

public class Credit {
    private double solde;
    public Credit(){
        solde = 0.0;
    }
    public Credit(double x){
        solde = x;
    }
    public double getSolde(){
        return solde;
    }
    public void crediter(double x){
        solde += x;
    }
    public void debiter(double x){
        solde -= x;
    }
    public void afficher(){
        System.out.println(getSolde() + "DH");
    }
    public void virerVers(Credit cb, double mt){
        cb.crediter(mt);
        debiter(mt);
    }
}
