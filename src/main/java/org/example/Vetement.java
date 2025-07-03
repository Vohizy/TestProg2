package org.example;

public class Vetement extends Produit{
    private String materiel;
    private Enum<Taille> tailleEnum;

    public Vetement(String id, String nom, double prix, int quantiteEnStock, String materiel, Enum<Taille> tailleEnum) {
        super(id, nom, prix, quantiteEnStock);
        this.materiel = materiel;
        this.tailleEnum = tailleEnum;
    }

    @Override
    double calculerPrixApresRemise() {
        if(this.materiel=="Coton"){
            return (20*this.getPrix())/100;
        }
        return (10*this.getPrix())/100;
    }
}
