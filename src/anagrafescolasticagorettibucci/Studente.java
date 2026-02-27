/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolasticagorettibucci;

/**
 *
 * @author goretti.leonardo
 */
public class Studente {

    String nome, cognome, matricola;

    /**
     * Costruttore di Studente
     * @param nome
     * @param cognome
     * @param matricola 
     */
    public Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    /**
     * Get di nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set di nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Get di cognome
     * @return 
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Set di cognome
     * @param cognome 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Get di cognome
     * @return 
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Set di matricola
     * @param matricola 
     */
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    /**
     * Ritorna i dati dello studente
     * @return 
     */
    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + '}';
    }

}
