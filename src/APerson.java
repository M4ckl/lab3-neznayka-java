
public class APerson implements IMove, IGetters, ICheckTruth {
    public String name;
    public String status;

    public APerson(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return status;
    }

    @Override
    public void changeLocation() {
        if (getFeature().equals("Other")) {
            System.out.println(getName() + " will remain in " + ELocation.CAVE+ ".");
        }
        else {
            System.out.println(getName() + " will go to " + ELocation.RETURNJOURNEY + ".");
        }
    }

    @Override
    public void talk() {
        System.out.println("says. ");
    }

    @Override
    public void seeAbout() { System.out.print(name + " looked at it. "); }

    @Override
    public void checkTruth(ACosmicThings planet1, ACosmicThings planet2) {
        if (Integer.parseInt(planet1.getFeature()) > Integer.parseInt(planet2.getFeature())){
            System.out.println("All the facts are true.");
            System.out.println("There is a possibility to " + EAbilities.READ + ", " + EAbilities.WRITE + ", " + EAbilities.DRAW + ", " + EAbilities.D0OTHERTHINGS + ".");
        }
        else {
            System.out.println("All the facts are lies.");
        }
    }


}
