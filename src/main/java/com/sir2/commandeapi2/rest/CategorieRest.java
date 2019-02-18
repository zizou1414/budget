/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.rest;

import com.sir2.commandeapi2.bean.Categorie;
import com.sir2.commandeapi2.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 * 
 */
@RestController()
@RequestMapping({"/commande-api-2/categories"})
public class CategorieRest {
    @Autowired
    
    private CategorieService categorieService ;

    public Categorie findByLibelleCategorie(String libelleCategorie) {
        return categorieService.findByLibelleCategorie(libelleCategorie);
    }
    @PostMapping("/")
    public int creerCategorie(@RequestBody Categorie categorie) {
        return categorieService.creerCategorie(categorie);
    }

    public void deleteCategorie(String libelleCategorie) {
        categorieService.deleteCategorie(libelleCategorie);
    }
    
    

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    
    
}
