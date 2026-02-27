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
        if (this.mappaStudenti.containsKey(s.getMatricola())) {
            return false;
        }
        this.insiemeMatricole.add(s.getMatricola());
        this.listaStudenti.add(s);
        this.mappaStudenti.put(s.getMatricola(), s);
        return true;

    }

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

    public Studente cercaStudente(String matricola) {
        if (mappaStudenti.containsKey(matricola)) {
            return mappaStudenti.get(matricola);
        }
        return null;
    }

    public int numeroStudenti() {
        return this.listaStudenti.size();
    }

    public Collection<Studente> getTuttiStudenti() {
        return mappaStudenti.values();
    }

}
