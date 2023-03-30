
public class Moon extends ACosmicThings {

    protected Moon(String name, int size) {
        super(name, size);
    }

    @Override
    public void conditionOfBrightness() {
        if (Integer.parseInt(getFeature()) > 50 ) {
            System.out.println(getName() + " светиться в " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " раз больше Земли.");
        }
        else {
            System.out.println(getName() + " светиться в " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " раз слабее Земли.");
        }
    }
}
