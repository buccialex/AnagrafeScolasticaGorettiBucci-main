/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolasticagorettibucci;

import java.util.*;

/**
 *
 * @author goretti.leonardo
 */
public class Anagrafe {

    private ArrayList<Studente> listaStudenti;
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

    public Anagrafe() {
        this.listaStudenti = new ArrayList<>();
        this.insiemeMatricole = new HashSet<String>();
        this.mappaStudenti = new HashMap<String, Studente>();
    }

    public boolean aggiungiStudente(Studente s) {
        if(this.insiemeMatricole.contains(s.getMatricola())){
            return false;
        }
        this.insiemeMatricole.add(s.getMatricola());
        this.listaStudenti.add(s);
        this.mappaStudenti.put(s.getMatricola(), s);

    }

    public boolean eliminaStudente(String matricola) {
        if(this.mappaStudenti.containsValue(matricola)){
            this.mappaStudenti.remove(matricola);
            this.insiemeMatricole.remove(matricola);
            this.listaStudenti.remove();
        }
    }

    public Studente cercaStudente(String matricola) {
        
    }
    
    

    public int numeroStudenti() {
        return this.listaStudenti.size();
    }

}
