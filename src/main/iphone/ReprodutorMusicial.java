package main.iphone;

import java.util.List;

public class ReprodutorMusicial {

    private Long idReprodutor;
    private String reprodutor;
    private List<Long> playList;
    private Long idMusicaAtual;
    private double volume;

    public Long getIdReprodutor() {
        return idReprodutor;
    }

    public void setIdReprodutor(Long idReprodutor) {
        this.idReprodutor = idReprodutor;
    }

    public String getReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(String reprodutor) {
        this.reprodutor = reprodutor;
    }

    public List<Long> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Long> playList) {
        this.playList = playList;
    }

    public Long getIdMusicaAtual() {
        return idMusicaAtual;
    }

    public void setIdMusicaAtual(Long idMusicaAtual) {
        this.idMusicaAtual = idMusicaAtual;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
