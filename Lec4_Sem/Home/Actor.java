package Lec4_Sem.Home;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}