/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.dao;

import com.sir2.commandeapi2.bean.Produit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface  ProduitDao extends JpaRepository<Produit, Long> {

    public List<Produit> findByCategorieLibelleCategorie(String libelleCategorie);
           public  Produit findByReferenceProduit (String referenceProduit);

}
