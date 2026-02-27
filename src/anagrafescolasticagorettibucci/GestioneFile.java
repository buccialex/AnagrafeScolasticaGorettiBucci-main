/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolasticagorettibucci;

import java.io.*;
import java.util.*;

public class GestioneFile {

    private FileWriter fw = null;
    private PrintWriter pw = null;

    public ArrayList<Studente> caricaDaFile(String nomeFile) {
        ArrayList<Studente> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parti = linea.split(",");
                if (parti.length == 3) {
                    String nome = parti[0].trim();
                    String cognome = parti[1].trim();
                    String matricola = parti[2].trim();
                    lista.add(new Studente(nome, cognome, matricola));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + nomeFile);
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
        return lista;
    }

    public void salvaSuFile(String nomeFile, Collection<Studente> studenti) {
        try {
            fw = new FileWriter(nomeFile);
            pw = new PrintWriter(fw);
            for (Studente s : studenti) {
                pw.println(s.getNome() + "," + s.getCognome() + "," + s.getMatricola());
            }
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Errore durante la chiusura del file: " + e.getMessage());
            }
        }
    }
}
