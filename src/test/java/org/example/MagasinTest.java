package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MagasinTest {

    Magasin inventaire = new Magasin("HEI",new ArrayList<>());
    Produit vetement = new Vetement("24éLHJ","short",10000,23,"Coton",Taille.XL);

    @Test
    void ajouterProduit() {
        inventaire.ajouterProduit(vetement);
        List<Produit> vetementList = new ArrayList<>();
        vetementList.add(vetement);
        assertEquals(vetementList,inventaire.rechercherParNom("short"));

    }

    @Test
    void rechercherParNom() {
        inventaire.ajouterProduit(vetement);

        List<Produit> resultats = inventaire.rechercherParNom("short");

        assertEquals(1, resultats.size());
        assertEquals("short", resultats.get(0).getNom());

    }
}