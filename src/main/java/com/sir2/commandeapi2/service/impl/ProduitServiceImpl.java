/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.service.impl;

import com.sir2.commandeapi2.bean.Produit;
import com.sir2.commandeapi2.dao.ProduitDao;
import com.sir2.commandeapi2.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
 private ProduitDao produitDao ;
    
    @Override
    public List<Produit> findByCategorieLibelleCategorie(String libelleCategorie) {
         return produitDao.findByCategorieLibelleCategorie(libelleCategorie);
    }

    @Override
    public int creerProduit(Produit produit) {
        Produit p = findByReferenceProduit(produit.getReferenceProduit());
        if(p != null ){
            return -1;
        }else {
            p = new Produit();
            p.setReferenceProduit(produit.getReferenceProduit());
            p.setCategorie(produit.getCategorie());
            produitDao.save(p);
        return 1;        
        }
    }          
    public ProduitDao getProduitDao() {
        return produitDao;
    }

    public void setProduitDao(ProduitDao produitDao) {
        this.produitDao = produitDao;
    }

    @Override
    public Produit findByReferenceProduit(String referenceProduit) {
        return produitDao.findByReferenceProduit(referenceProduit);
    }
    
    
}
