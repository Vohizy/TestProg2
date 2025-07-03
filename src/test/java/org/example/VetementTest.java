package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetementTest {
    Produit vetement = new Vetement("24éLHJ","short",10000,23,"Coton",Taille.XL);
    @Test
    void calculerPrixApresRemise() {
        assertEquals(2000, vetement.calculerPrixApresRemise());
    }
}