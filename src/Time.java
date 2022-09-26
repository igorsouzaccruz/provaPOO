public class Time {
    private String nomeDoTime;
    private String tecnicoDoTime;
    private String corDoTime;
    private Integer potuacao = 0;

    public Time(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }

    public void setNomeDoTime(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public String getTecnicoDoTime() {
        return tecnicoDoTime;
    }

    public void setTecnicoDoTime(String tecnicoDoTime) {
        this.tecnicoDoTime = tecnicoDoTime;
    }

    public String getCorDoTime() {
        return corDoTime;
    }

    public void setCorDoTime(String corDoTime) {
        this.corDoTime = corDoTime;
    }

    public Integer getPotuacao() {
        return potuacao;
    }

    public void setPotuacao(Integer potuacao) {
        this.potuacao = potuacao;
    }

    public void somarPotuacao(Integer valor){
        this.potuacao += valor;
    }
}
