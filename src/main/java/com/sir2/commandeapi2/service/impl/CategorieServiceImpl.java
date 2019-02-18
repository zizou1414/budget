/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.service.impl;

import com.sir2.commandeapi2.bean.Categorie;
import com.sir2.commandeapi2.bean.Produit;
import com.sir2.commandeapi2.dao.CategorieDao;
import com.sir2.commandeapi2.dao.ProduitDao;
import com.sir2.commandeapi2.service.CategorieService;
import com.sir2.commandeapi2.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private CategorieDao categorieDao;

    public ProduitService getProduitService() {
        return produitService;
    }

    public void setProduitService(ProduitService produitService) {
        this.produitService = produitService;
    }
@Autowired
private ProduitService produitService ;
    public CategorieDao getCategorieDao() {
        return categorieDao;
    }

    public void setCategorieDao(CategorieDao categorieDao) {
        this.categorieDao = categorieDao;
    }
    
    @Override
    public Categorie findByLibelleCategorie(String libelleCategorie) {
        return categorieDao.findByLibelleCategorie(libelleCategorie);
    }

    @Override
    public int creerCategorie(Categorie categorie) {
       
        Categorie cat = findByLibelleCategorie(categorie.getLibelleCategorie());
        if (cat != null){
            return -1;
        }else{
            cat = new Categorie();
            cat.setLibelleCategorie(categorie.getLibelleCategorie());
            categorieDao.save(cat);
            for (Produit produit : categorie.getProduits()){
               produit.setCategorie(cat);
               produitService.creerProduit(produit);
            }
            return 1;
        }
    }

    @Override
    public void deleteCategorie(String libelleCategorie) {
        Liste<Produit> produits =
    }
    
}
