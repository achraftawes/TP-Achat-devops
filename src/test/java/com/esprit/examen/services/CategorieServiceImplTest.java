package com.esprit.examen.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class CategorieServiceImplTest {
	 @Autowired
    ICategorieProduitService categorieService;

    @Autowired
    CategorieProduitRepository categorieRepository;

    CategorieProduit p1 = new CategorieProduit(55L, "2365","produit1");
    CategorieProduit p2 = new CategorieProduit(66L, "5681","produit5");
    @Test
    @Order(1)
    public void testaddCategorieProduit() {
        CategorieProduit categorieAdded =  categorieService.addCategorieProduit(p1);
        Assertions.assertEquals(categorieAdded.getIdCategorieProduit(), categorieAdded.getIdCategorieProduit());
    }

    @Test
    @Order(2)
    public void testRetrieveCategorieProduit() {
        List<CategorieProduit> listCategories = categorieService.retrieveAllCategorieProduits();
        Assertions.assertEquals(listCategories.size(), listCategories.size());
    }

	


}
