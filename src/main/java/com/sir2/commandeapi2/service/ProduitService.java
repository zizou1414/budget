/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.service;

import com.sir2.commandeapi2.bean.Produit;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ProduitService {
        public List<Produit> findByCategorieLibelleCategorie(String libelleCategorie);
        public int creerProduit (Produit produit );
       public  Produit findByReferenceProduit (String referenceProduit);
}
