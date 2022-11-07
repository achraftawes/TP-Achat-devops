package com.esprit.examen.repositories;


//import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Client;


@Repository
 //jpaRepository  pagingandsortingrepository deux interfaces plus generale que crud repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	
	//Client findByDateNaissanceGreaterThan(Date dateN);
	
	
	
	/*@Query("SELECT c FROM Client c WHERE c.dateNaissance  BETWEEN :dateNaissnce1 AND :dateNaissnce2 ")
	List<Client> retrieveClientsByDateNaissance(@Param("dateNaissnce1")Date dateNaiss1 ,@Param("dateNaissnce2")Date dateNaiss2 );*/

}
