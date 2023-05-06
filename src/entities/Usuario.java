package entities;

import java.util.Date;

public class Usuario {
    private String nome, email, senha;
    private int ano;
    private int id = 0;
    private Favoritos fav;

    public Usuario(String nome, String email, String senha, int ano) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ano = ano;
        this.id += 1;
    }

    public void adicionar(Video video){
        fav.adicionar(video);
    }

    public void remover(Video video){
        fav.remover(video);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public Favoritos getFav() {
        return fav;
    }
}
