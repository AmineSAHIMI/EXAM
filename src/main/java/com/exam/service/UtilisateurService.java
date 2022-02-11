package com.exam.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.exam.entities.Utilisateur;
import com.exam.repositories.UtilisateurRepository;


@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;
  

    public UtilisateurService() {}

    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Optional<Utilisateur>  getUtilisateur(long id) {
        return utilisateurRepository.findById(id);
    }

    public void updateUtilisateur(Utilisateur utilisateur) {
    	utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateur(Long id) {
    	utilisateurRepository.deleteById(id);
    }

    public Page<Utilisateur> getAllUtilisateurs( Pageable pageable ) {
        return utilisateurRepository.findAll(pageable);
    }
    
}
