package entities;

import java.util.ArrayList;

public class Favoritos {
    private ArrayList<Video> fav = new ArrayList<Video>();

    public void adicionar(Video video){
        fav.add(video);
    }

    public void remover(Video video){
        int i = fav.indexOf(video);
        fav.remove(i);
    }

    public void imprimir(){
        for(Video lista: fav){
            System.out.println("----- FAVORITOS: -----");
            System.out.println("1- " + lista);
        }
    }
}
