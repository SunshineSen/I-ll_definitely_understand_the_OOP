package Lec4_Sem.P2;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
