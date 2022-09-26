public class Campeonato {

    Jogo[] jogos;
    Time times[];

    public Campeonato(Jogo[] jogos, Time[] times) {
        this.jogos = jogos;
        this.times = times;
    }

    public void campeonato(){
        jogosCampeonato();
        //Vencedores
        Integer vencedorJogo01 = jogos[0].vencedor;
        Integer vencedorJogo02 = jogos[1].vencedor;
        Integer vencedorJogo03 = jogos[2].vencedor;
        Integer vencedorJogo04 = jogos[3].vencedor;
        Integer vencedorJogo05 = jogos[4].vencedor;
        Integer vencedorJogo06 = jogos[5].vencedor;

        potuacaoCampeaonato(vencedorJogo01,times[0],times[1]);
        potuacaoCampeaonato(vencedorJogo02,times[0],times[2]);
        potuacaoCampeaonato(vencedorJogo03,times[0],times[3]);
        potuacaoCampeaonato(vencedorJogo04,times[1],times[2]);
        potuacaoCampeaonato(vencedorJogo05,times[1],times[3]);
        potuacaoCampeaonato(vencedorJogo06,times[2],times[3]);
    }

    public String classificacao(){
        campeonato();
        String primeiro = "";
        String segundo = " ";
        String terceiro = " ";
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        int terceiroMaior = Integer.MIN_VALUE;

        for (Time time:times) {
            if(time.getPotuacao() > maior) {
                maior = time.getPotuacao();
                primeiro = "O primeiro lugar é : " + time.getNomeDoTime();
            }
        }
        for (Time time:times) {
            if(maior > time.getPotuacao()  && time.getPotuacao() > segundoMaior) {
                segundoMaior = time.getPotuacao();
                segundo = "O Segundo lugar é : " + time.getNomeDoTime();
            }
        }
        for (Time time:times) {
            if(segundoMaior > time.getPotuacao()  && time.getPotuacao() > terceiroMaior) {
                terceiroMaior = time.getPotuacao();
                terceiro = "O Terceiro lugar é : " + time.getNomeDoTime();
            }
        }
        return primeiro + " \n" + segundo + " \n" + terceiro;
    }

    public void jogosCampeonato(){
        //Jogos do campeonato
        for (Jogo jogo:jogos) {
            jogo.timeVencedor();
        }

    }
    public void potuacaoCampeaonato(Integer resultado, Time timeA, Time timeB){

        if(resultado == 1){
            timeA.somarPotuacao(3);
        } else if (resultado == 2){
            timeB.somarPotuacao(3);
        } else if (resultado == 0){
            timeA.somarPotuacao(1);
            timeB.somarPotuacao(1);
        } else{
            System.out.println("pontuação invalida!");
        }
    }
}
