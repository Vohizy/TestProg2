package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Magasin {
    private String nom;
    private List<Produit> inventaire;

    public Magasin(String nom, List<Produit> inventaire) {
        this.nom = nom;
        this.inventaire = inventaire;
    }

    public void ajouterProduit(Produit p){
        inventaire.add(p);
    }
    public void supprimerProduit(String id){
        Produit produitList = (Produit) inventaire.stream().filter(produit -> produit.getId().equals(id));
        inventaire.remove(produitList);
    }
    public List<Produit> rechercherParNom(String nom){
        return inventaire.stream()
                .filter(produit -> produit.getNom().equalsIgnoreCase(nom))
                .collect(Collectors.toList());
    }

    public void afficherProduitsAvecRemise(){
        inventaire.forEach(produit -> {
            double remise = produit.calculerPrixApresRemise();
            double prixFinal = produit.getPrix() - remise;
            System.out.println(produit.getNom() + " - Prix : " + produit.getPrix() + " → Après remise : " + prixFinal);
        });
    }

}
