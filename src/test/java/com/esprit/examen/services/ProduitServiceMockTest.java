package com.esprit.examen.services;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;


import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.CategorieProduitRepository;

public class ProduitServiceMockTest {

	 @Mock
	    CategorieProduitRepository produitRepository;

	   @InjectMocks
	   CategorieProduitServiceImpl produitService;

	    CategorieProduit p1 = new CategorieProduit(55L, "2365","produit1");
	    CategorieProduit p2 = new CategorieProduit(66L, "5681","produit5");


	    List<CategorieProduit> listcategories = new ArrayList<CategorieProduit>() {
	        {
	            add(p1);
	            add(new CategorieProduit(90L, "9687","produit2"));
	            add(new CategorieProduit(46L, "4503","produit3"));
	        }
	    };



	    @Test
	    public void testRetrieveProduit() {

	        Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(p1));
	        CategorieProduit produit1 = produitService.retrieveCategorieProduit(55L);
	        assertNotNull(produit1);
	        System.out.println("1");
	        assertEquals(produit1.getIdCategorieProduit(),55L);
	   }

	    @Test
	    public void testretrieveAllProduits() {
	        Mockito.when(produitRepository.findAll()).thenReturn(listcategories);
	        List<CategorieProduit> listproduit3 = produitService.retrieveAllCategorieProduits();
	        assertEquals(3, listproduit3.size());
	        //assertEquals(produit1.getIdProduit(),55L);
	        System.out.println("2555");
	    }
	    @Test
	    public void testaddProduit(){
	        Mockito.when(produitRepository.save(p1)).thenReturn(p1);
	        CategorieProduit categorieProduit1 = produitService.addCategorieProduit(p1);
	        //assertNotNull(produit1);
	        Mockito.verify(produitRepository, times(1)).save(Mockito.any(CategorieProduit.class));
	        System.out.println("3");
	    }

	   



	}
