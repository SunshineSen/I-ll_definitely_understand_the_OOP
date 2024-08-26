package Lec4_Sem.Home;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}