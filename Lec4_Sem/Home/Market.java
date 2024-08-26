package Lec4_Sem.Home;

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {
    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " went into the market");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " left the market");
    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " in the queue");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " took the order");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " made an order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " left the queue");
        actorsQueue.poll();
    }
}