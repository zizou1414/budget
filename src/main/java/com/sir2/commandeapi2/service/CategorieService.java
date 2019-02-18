/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir2.commandeapi2.service;

import com.sir2.commandeapi2.bean.Categorie;

/**
 *
 * @author PC
 */
public interface CategorieService {
        public Categorie findByLibelleCategorie(String libelleCategorie); 
        public int creerCategorie (Categorie categorie );
       // public void deleteCategorie (String libelleCategorie);

}
