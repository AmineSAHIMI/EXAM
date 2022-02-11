package com.exam.repositories;
  
import org.springframework.data.repository.PagingAndSortingRepository;
import com.exam.entities.Utilisateur;

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {
		 
	    
}
