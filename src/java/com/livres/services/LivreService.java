/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.services;

import com.livres.dao.LivresDAO;
import com.livres.model.Livre;
import java.util.List;

/**
 *
 * @author usager
 */
public class LivreService {
    
    LivresDAO dao;
    
    public void setDao(LivresDAO dao) {
        this.dao = dao;
    }
    
    public List<Livre> listeDeLivre()
    {
        List<Livre> ListeLivre = dao.findAll();
        return ListeLivre; 
    }
    
    public boolean ajouterLivre(String isbn, String author, String title, int nb_pages,String edition, int year, String language, String description, String keywords)
    {
        Livre livre = new Livre();
        
        livre.setISBN(isbn);
        livre.setAuthor(author);
        livre.setTitle(title);
        livre.setNB_Pages(nb_pages);
        livre.setEdition(edition);
        livre.setYear(year);
        livre.setLanguage(language);
        livre.setDescription(description);
        livre.setKeywords(keywords);
        
        dao.create(livre);
        
        if(dao.create(livre) == true){
            return true;
        }
        
        return false;
    }
    
}
