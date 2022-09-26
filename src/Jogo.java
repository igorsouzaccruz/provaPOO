public class Jogo {
    Integer dataDoJogo;
    Time time01;
    Time time02;
    Integer placarTime01;
    Integer placarTime02;
    Integer vencedor;

    public Jogo(Time time01, Time time02, Integer placarTime01, Integer placarTime02) {
        this.time01 = time01;
        this.time02 = time02;
        this.placarTime01 = placarTime01;
        this.placarTime02 = placarTime02;
    }

    public void timeVencedor(){
        if(this.placarTime01 > this.placarTime02 ){
            this.vencedor = 1;
            System.out.println("O time um é o vencedor");
        } else if (this.placarTime01 < this.placarTime02) {
            this.vencedor = 2;
            System.out.println("O time dois é o vencedor");
        } else {
            this.vencedor = 0;
            System.out.println("Empate");
        }
    }

    public String resultadoDoJogo(){
        timeVencedor();
        return time01.getNomeDoTime() + " " + this.placarTime01 + " x " +
                this.placarTime02 + " " + time02.getNomeDoTime() + " - " + this.vencedor;
    }
}
