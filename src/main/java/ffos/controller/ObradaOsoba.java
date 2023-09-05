/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Mjesto;
import ffos.model.Osoba;
import ffos.model.Sport;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaOsoba extends Obrada<Osoba>{
    
    public void setPodaci(String ime, String prezime, String oib, Mjesto  mjesto, Sport sport){
            if(entitet == null){
            entitet = new Osoba();
        }
        entitet.setIme(ime);
        entitet.setPrezime(prezime);
        entitet.setOib(oib);
        entitet.setMjesto(mjesto);
        entitet.setSport(sport);
         
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
    public List<Osoba> read() {
        return session.createQuery("from Osoba", Osoba.class).list();
    }

    @Override
    public void setNew() {
        entitet = new Osoba();
    }
    
}
