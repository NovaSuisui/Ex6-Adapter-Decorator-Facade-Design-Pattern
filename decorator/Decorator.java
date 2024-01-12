public class Decorator implements Beverage {
    private Beverage component;

    public Decorator(Beverage component){
        this.component = component;
    }

    @Override
    public int getCost(){
        return component.getCost();
    }

    @Override
    public String getDescription(){
        return component.getDescription();
    }
}
