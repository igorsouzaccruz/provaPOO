public class Main {
    public static void main(String[] args) {
        Time[] times = new Time[4];
        times[0] = new Time("Vasco");
        times[1] = new Time("Ceará");
        times[2] = new Time("Fortaleza");
        times[3] = new Time("Sobral");

        Jogo[] jogos = new Jogo[6];
        jogos[0] = new Jogo(times[0],times[1],1,1);
        jogos[1] = new Jogo(times[0],times[2],1,1);
        jogos[2] = new Jogo(times[0],times[3],1,1);
        jogos[3] = new Jogo(times[1],times[2],1,2);
        jogos[4] = new Jogo(times[1],times[3],1,1);
        jogos[5] = new Jogo(times[2],times[3],1,3);

        Campeonato campeonato = new Campeonato(jogos, times);
        System.out.println(campeonato.classificacao());


    }
}