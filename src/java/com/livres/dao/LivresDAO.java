/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livres.dao;

import com.livres.model.Livre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author usager
 */
public class LivresDAO extends DAO<Livre>{

    @Override
    public boolean create(Livre x) {
        String req = "INSERT INTO BOOK commentaire (`ISBN` , `AUTHOR` , `TITLE`, `NB_PAGES`, `EDITION`, `YEAR`, `LANGUAGE`, `DESCRIPTION`, `KEYWORDS`) "+
			     "VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = null;
		try
		{
			stm = connexion.getInstance().prepareStatement(req);
                        stm.setString(1,x.getISBN());
                        stm.setString(2,x.getAuthor() );
                        stm.setString(3,x.getTitle());
                        stm.setInt(4, x.getNB_Pages());
                        stm.setString(5,x.getEdition());
                        stm.setInt(6,x.getYear());
                        stm.setString(7,x.getLanguage());
                        stm.setString(8,x.getDescription());
                        stm.setString(9,x.getKeywords());
			int n = stm.executeUpdate();
			if (n>0)
			{
				stm.close();
				return true;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
				stm.close();
			}
                        catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
    }

    @Override
    public Livre read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Livre read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Livre x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Livre x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Livre> findAll() {
        List<Livre> liste = new LinkedList<>();

        try
        {
            Statement stm = connexion.getInstance().createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM book");
            while(r.next()){
                Livre L = new Livre();
                L.setISBN(r.getString("ISBN"));
                L.setAuthor(r.getString("AUTHOR"));
                L.setTitle(r.getString("TITLE"));
                L.setNB_Pages(Integer.parseInt(r.getString("NB_PAGES")));
                L.setEdition(r.getString("EDITION"));
                L.setYear(Integer.parseInt(r.getString("YEAR")));
                L.setLanguage(r.getString("LANGUAGE"));
                L.setDescription(r.getString("DESCRIPTION"));
                L.setKeywords(r.getString("KEYWORDS"));
                liste.add(L);
            }
            r.close();
            stm.close();
        }
        catch(SQLException exp)
        {

        }
        return liste;
    }


}
