////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class User {
    String nome, cognome, username;
    int eta;

    public User(String nome, String cognome, String username, int eta) {
        if(nome == null) {
            throw new IllegalArgumentException("Nome non valido");
        }

        if(cognome == null) {
            throw new IllegalArgumentException("Cognome non valido");
        }

        if(username == null) {
            throw new IllegalArgumentException("Nickname nullo");
        }

        if(eta < 0) {
            throw new IllegalArgumentException("Data non valida");
        }

        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.eta = eta;
    }

    public String getUsername(){return username;}

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }
}