public class SugarDecorator extends Decorator {
    public SugarDecorator(Beverage component){
        super(component);
    }

    @Override
    public int getCost(){
        return super.getCost() + 1;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "sugar ";
    }
}
