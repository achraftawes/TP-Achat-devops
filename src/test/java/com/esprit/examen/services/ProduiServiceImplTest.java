package com.esprit.examen.services;


import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class ProduiServiceImplTest {
	 @Autowired
    IProduitService produitService;

    @Autowired
    ProduitRepository produitRepository;

    Produit p1 = new Produit(55L, "23688","produit1",50);
    Produit p2 = new Produit(66L, "5681","produit5",120);
    @Test
    @Order(1)
    public void testaddProdiut() {
        Produit produitAdded =  produitService.addProduit(p1);
        Assertions.assertEquals(produitAdded.getCodeProduit(), produitAdded.getCodeProduit());
    }
    
    

    @Test
    @Order(2)
    public void testRetrieveAllProduits() {
        List<Produit> listProduits = produitService.retrieveAllProduits();
        Assertions.assertEquals(listProduits.size(), listProduits.size());
    }}

  
