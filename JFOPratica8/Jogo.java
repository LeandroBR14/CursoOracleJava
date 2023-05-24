package JFOPratica8;

public class Jogo {
    private int placarTime1;
    private int placarTime2;
    private double temperatura;
    private int ID;
    private Equipe time1;
    private Equipe time2;

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }
    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }
    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getTemperatura() {
        return temperatura;
    }

    public void setTime1(Equipe time1) {
        this.time1 = time1;
    }
    public Equipe getTime1() {
        return time1;
    }

    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }
    public Equipe getTime2() {
        return time2;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }





}
