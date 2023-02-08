public class Insan {
    private Banka banka;
    String isim;

    private double paraTL;
    private double paraUSD;


    public Insan(Banka banka,String isim){
        paraTL=0;
        paraUSD=0;
        this.banka=banka;
        this.isim=isim;

    }
    public void calis(){
        paraTL += 200;
        banka.setTL(banka.getTL()-20);
    }
    public void yurtDisindaCalis(){
        paraUSD += 100;
    }
    public void harca(){
        paraTL -= 20;
    }
    public void yurtDisindaHarca(){
        paraUSD -= 5;
    }



}
