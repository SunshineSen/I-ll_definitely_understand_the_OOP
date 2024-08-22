package Lec2_sem.P3;

public class BottleWater extends Product{

    private int volume;

    public BottleWater(String name, int price) {
        super(name, price);
    }

    public BottleWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
