
public class Moon extends ACosmicThings {

    protected Moon(String name, int size) {
        super(name, size);
    }

    @Override
    public void conditionOfBrightness() {
        if (Integer.parseInt(getFeature()) > 50 ) {
            System.out.println(getName() + " glow " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " times the size of the Earth.");
        }
        else {
            System.out.println(getName() + " glow " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " times smaller than the Earth.");
        }
    }
}
