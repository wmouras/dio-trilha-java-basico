package main.iphone;

public class NavegadorInternet {

    private Long idNavegador;
    private String Url;
    private String ip;
    private String noNavegador;
    private ReprodutorMusicial reprodutorMusicial;
    public Long getIdNavegador() {
        return idNavegador;
    }

    public void setIdNavegador(Long idNavegador) {
        this.idNavegador = idNavegador;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNoNavegador() {
        return noNavegador;
    }

    public void setNoNavegador(String noNavegador) {
        this.noNavegador = noNavegador;
    }

    public ReprodutorMusicial getReprodutorMusicial() {
        return reprodutorMusicial;
    }

    public void setReprodutorMusicial(ReprodutorMusicial reprodutorMusicial) {
        this.reprodutorMusicial = reprodutorMusicial;
    }

}
