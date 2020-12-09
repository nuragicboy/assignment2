////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import java.util.List;
import java.time.LocalTime;
import it.unipd.tos.model.User;

public class Order {
    private User utente;
    private List<MenuItem> articoli;
    private LocalTime orario;
    private double prezzo;

    public Order(List<MenuItem> articoli, User utente, LocalTime orario, double prezzo) {
        if (articoli == null) {
            throw new IllegalArgumentException("Lista non valida");
        }
        if (articoli.isEmpty()) {
            throw new IllegalArgumentException("Lista vuota");
        }
        if (utente == null) {
            throw new IllegalArgumentException("User non valido");
        }
        if (orario == null) {
            throw new IllegalArgumentException("Orario non valido");
        }
        if (prezzo <= 0) {
            throw new IllegalArgumentException("prezzo non valido");
        }
        this.articoli = articoli;
        this.utente = utente;
        this.orario = orario;
        this.prezzo = prezzo;
    }

    public LocalTime getOrario() {
        return orario;
    }

    public User getUtente() {
        return utente;
    }

    public List<MenuItem> getArticoli() {
        return articoli;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo=prezzo;
    }

    public double getPrezzo(){
        return prezzo;
    }
}