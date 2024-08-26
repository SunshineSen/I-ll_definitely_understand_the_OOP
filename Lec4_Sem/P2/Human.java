package Lec4_Sem.P2;

public class Human extends Actor{

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // TODO Auto-generated method stub throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        // TODO Auto-generated method stub throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
        return super.isTakeOrder;
    }

}
