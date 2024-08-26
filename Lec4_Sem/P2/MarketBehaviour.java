package Lec4_Sem.P2;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actorList);
    void update();

}
