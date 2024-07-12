package com.example.hesapmakinesi;

public class Hesapla {
    private int gelen1,gelen2,sonuc;

    public Hesapla(int gelen2, int gelen1) {
        this.gelen2 = gelen2;
        this.gelen1 = gelen1;
        this.sonuc =sonuc;
    }
    public int toplam(){

        return gelen1 + gelen2;
    }
    public int fark (){
        if (gelen1<gelen2){
            sonuc= gelen2-gelen1;
        }
        if (gelen1>gelen2)
        {
            sonuc =gelen1-gelen2;
        }
        return sonuc;

    }
    public int carp(){
        return gelen1*gelen2;
    }
    public int bolme(){
        return gelen2 / gelen1;
    }
}
