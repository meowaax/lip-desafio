package entities;

import java.util.ArrayList;

public class ServicoStreaming {
    ArrayList<Video> video = new ArrayList<Video>();
    ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    ArrayList<Acesso> acesso = new ArrayList<Acesso>();

    public void cadastrar_usuario(Usuario usu){
        usuario.add(usu);
    }

    public Usuario encontrar_usuario(int id){
        Usuario usu = null;
        if(usuario.size() > 0){
            for(Usuario u: usuario){
                if(u.getId() == id){
                    usu = u;
                }
            }
        }
        return usu;
    }

    public void cadastrar_video(Video vid){
        video.add(vid);
    }

    public Video encontrar_video(int id) {
        Video vid = null;
        if (video.size() > 0) {
            for (Video v : video) {
                if (v.getId() == id) {
                    vid = v;
                }
            }
        }
        return vid;
    }

    public void cadastrar_acesso(Acesso ace){
        acesso.add(ace);
    }

    public ArrayList<Video> getVideo() {
        return video;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public ArrayList<Acesso> getAcesso() {
        return acesso;
    }
}
