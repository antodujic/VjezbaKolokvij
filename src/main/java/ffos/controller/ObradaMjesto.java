/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Mjesto;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaMjesto extends Obrada<Mjesto> {

    public void setPodaci(String naziv){
        if(entitet == null){
            entitet = new Mjesto();
        }
        entitet.setNaziv(naziv);
    }
    
    @Override
    public void kontrolaCreate() throws Exception {
      
    }
    
    @Override
    public void kontrolaUpdate() throws Exception {
       
    }
    
    @Override
    public void kontrolaDelete() throws Exception {
        
    }
    
    @Override
    public List<Mjesto> read() {
       return session.createQuery("from Mjesto", Mjesto.class).list();
    }
    
    @Override
    public void setNew() {
      entitet = new Mjesto();
    }
    
    
    
}
