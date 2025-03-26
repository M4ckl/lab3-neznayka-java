
public class Main {
    public static void main(String[] args) {

        APerson znajka = new APerson("Znayka", "Friend");
        APerson fuksia = new APerson("Fuchsia", "Friend");
        APerson seledochka = new APerson("Selyodochka", "Friend");
        APerson zvezdochkin = new APerson("Zvezdochkin", "Professor");
        APerson others = new APerson("Other", "Other");

        znajka.seeAbout();
        znajka.changeLocation();
        fuksia.changeLocation();
        seledochka.changeLocation();
        zvezdochkin.changeLocation();
        others.changeLocation();

        ACosmicThings earth = new Earth("Earth", 100);
        ACosmicThings moon = new Moon("Moon", 27);


        earth.lookLike();
        moon.lookLike();

        moon.conditionOfBrightness();

        znajka.checkTruth(earth, moon);
    }
}