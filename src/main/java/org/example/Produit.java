package org.example;

abstract class Produit {
    private String id;
    private String nom;
    private double prix;
    private int quantiteEnStock;

    public Produit(String id, String nom, double prix, int quantiteEnStock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    abstract double calculerPrixApresRemise();

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantiteEnStock=" + quantiteEnStock +
                '}';
    }
}
