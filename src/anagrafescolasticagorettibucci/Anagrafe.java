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

    /**
     * Costruttore della classe anagrafe
     */
    private ArrayList<Studente> listaStudenti;
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

    /**
     * Metodo per aggiungere uno studente alla lista
     * @param s
     * @return 
     */
    public Anagrafe() {
        this.listaStudenti = new ArrayList<>();
        this.insiemeMatricole = new HashSet<String>();
        this.mappaStudenti = new HashMap<String, Studente>();
    }

    /**
     * Metodo per aggiungere uno studente alla lista
     * @param s
     * @return 
     */
    public boolean aggiungiStudente(Studente s) {
        if (this.mappaStudenti.containsKey(s.getMatricola())) {
            return false;
        }
        this.insiemeMatricole.add(s.getMatricola());
        this.listaStudenti.add(s);
        this.mappaStudenti.put(s.getMatricola(), s);
        return true;

    }

    /**
     * Metodo per eliminare uno studente dalla lista
     * @param matricola
     * @return 
     */
    public boolean eliminaStudente(String matricola) {
        if (this.mappaStudenti.containsKey(matricola)) {
            Studente s = this.mappaStudenti.get(matricola);
            this.mappaStudenti.remove(matricola);
            this.insiemeMatricole.remove(matricola);
            this.listaStudenti.remove(s);
            return true;
        }
        return false;

    }

    /**
     * Metodo per cercare uno studente nella lista.
     * @param matricola
     * @return 
     */
    public Studente cercaStudente(String matricola) {
        if (mappaStudenti.containsKey(matricola)) {
            return mappaStudenti.get(matricola);
        }
        return null;
    }

    /**
     * Registra la quantità di studenti contenuti nella lista
     * @return 
     */
    public int numeroStudenti() {
        return this.listaStudenti.size();
    }

    /**
     * Restituisce l'hashmap
     * @return 
     */
    public Collection<Studente> getTuttiStudenti() {
        return mappaStudenti.values();
    }

}
