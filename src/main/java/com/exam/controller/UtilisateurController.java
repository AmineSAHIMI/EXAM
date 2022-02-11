package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.exam.entities.Utilisateur;
import com.exam.service.UtilisateurService;

import java.util.List;
import java.util.Optional;
 


@RestController
@RequestMapping(value = "/api/Users")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Page<Utilisateur> getAllUtilisateur( Pageable pageable ){
        return utilisateurService.getAllUtilisateurs( pageable );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    Optional<Utilisateur> getUtilisateur(@PathVariable("id") Long id) throws Exception {
        Optional<Utilisateur> Utilisateur = utilisateurService.getUtilisateur(id);
        return Utilisateur;
    }
    
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createUtilisateur(@RequestBody Utilisateur utilisateur) {
    	utilisateurService.createUtilisateur(utilisateur);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur Utilisateur) {
        utilisateurService.updateUtilisateur(Utilisateur);
    }

    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUtilisateur(@PathVariable("id") Long id) {
        utilisateurService.deleteUtilisateur(id);
    }
}
