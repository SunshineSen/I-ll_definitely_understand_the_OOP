package Lec4_Sem.Home;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}