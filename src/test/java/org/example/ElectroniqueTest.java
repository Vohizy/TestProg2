package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectroniqueTest {
    Produit electronique = new Electronique("24éLHJ","short",10000,23,"Lenovo",12);
    @Test
    void calculerPrixApresRemise() {
        assertEquals(1500, electronique.calculerPrixApresRemise() );
    }
}