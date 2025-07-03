package org.example;

public class Electronique extends Produit{
    private String marque;
    private int garantieMois;

    public Electronique(String id, String nom, double prix, int quantiteEnStock, String marque, int garantieMois) {
        super(id, nom, prix, quantiteEnStock);
        this.marque = marque;
        this.garantieMois = garantieMois;
    }

    @Override
    double calculerPrixApresRemise() {
        if(garantieMois>12){
            return (5*this.getPrix())/100;
        }
        return (15*this.getPrix())/100;
    }

    @Override
    public String toString() {
        return "Electronique{" +
                "marque='" + marque + '\'' +
                ", garantieMois=" + garantieMois +
                ", prix=" + calculerPrixApresRemise() +
                '}';
    }
}
