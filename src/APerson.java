
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
        if (getFeature().equals("Другие")) {
            System.out.println(getName() + " остануться в " + ELocation.ПЕЩЕРЕ + ".");
        }
        else {
            System.out.println(getName() + " пойдет в " + ELocation.ОБРАТНЫЙПУТЬ + ".");
        }
    }

    @Override
    public void talk() {
        System.out.println("говорит. ");
    }

    @Override
    public void seeAbout() { System.out.print(name + " посмотрел. "); }

    @Override
    public void checkTruth(ACosmicThings planet1, ACosmicThings planet2) {
        if (Integer.parseInt(planet1.getFeature()) > Integer.parseInt(planet2.getFeature())){
            System.out.println("Все факты-правда.");
            System.out.println("Есть возможность " + EAbilities.ЧИТАТЬ + ", " + EAbilities.ПИСАТЬ + ", " + EAbilities.РИСОВАТЬ + ", " + EAbilities.ДЕЛАТЬДРУГИЕДЕЛА + ".");
        }
        else {
            System.out.println("Все факты-ложь.");
        }
    }


}
