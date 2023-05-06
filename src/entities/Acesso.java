package entities;

import java.util.Date;

public class Acesso {
    Usuario usu;
    String titulo;
    Date data;

    public Acesso(Usuario usu, Video video) {
        ValidadorClassificacao val = new ValidadorClassificacao();
        int ano = usu.getAno();
        int classificacao = video.getClassificacao();
        if (val.validar(ano, classificacao) == true){
            this.usu = usu;
            this.titulo = video.getTitulo();
            this.data = new Date();
            System.out.println("----- ACESSO PERMITIDO -----");
        } else {
            System.out.println("----- ACESSO NEGADO -----");
        }

    }
}
