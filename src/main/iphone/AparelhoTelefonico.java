package main.iphone;

public class AparelhoTelefonico {

    private Long idAparelho;
    private String modelo;
    private NavegadorInternet navegadorInternet;

    public Long getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Long idAparelho) {
        this.idAparelho = idAparelho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }
}
