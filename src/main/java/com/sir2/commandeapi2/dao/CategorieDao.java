/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.dao;

import com.sir2.commandeapi2.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface CategorieDao  extends JpaRepository<Categorie, Long>{
    public Categorie findByLibelleCategorie(String libelleCategorie); 
    
    
}
