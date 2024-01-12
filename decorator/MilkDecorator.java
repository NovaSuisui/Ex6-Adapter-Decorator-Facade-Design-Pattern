public class MilkDecorator extends Decorator {
    public MilkDecorator(Beverage component){
        super(component);
    }

    @Override
    public int getCost(){
        return super.getCost() + 3;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "milk ";
    }
}
