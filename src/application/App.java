package application;

import entities.*;

public class App {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ServicoStreaming s = new ServicoStreaming();
        Video s1 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 16);
        s.cadastrar_video(s1);
        Video s2 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 18);
        s.cadastrar_video(s2);
        Video s3 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 10);
        s.cadastrar_video(s3);
        Video f1 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 14);
        s.cadastrar_video(f1);
        Video f2 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 12);
        s.cadastrar_video(f2);
        Video f3 = new Video("ABCD", "Lee Jung", "jklskdskdla", "sdjskdjskdjs",
                "ajsdhsjdgjdgsjgjsdsjs", 2018, 0);
        s.cadastrar_video(f3);

        sistema.sistem();


    }
}
