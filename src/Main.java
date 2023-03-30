
public class Main {
    public static void main(String[] args) {

        APerson znajka = new APerson("Знайка", "Друг");
        APerson fuksia = new APerson("Фуксия", "Друг");
        APerson seledochka = new APerson("Селедочка", "Друг");
        APerson zvezdochkin = new APerson("Звездочкин", "Проффесор");
        APerson others = new APerson("Другие", "Другие");

        znajka.seeAbout();
        znajka.changeLocation();
        fuksia.changeLocation();
        seledochka.changeLocation();
        zvezdochkin.changeLocation();
        others.changeLocation();

        ACosmicThings earth = new Earth("Земля", 100);
        ACosmicThings moon = new Moon("Луна", 27);


        earth.lookLike();
        moon.lookLike();

        moon.conditionOfBrightness();

        znajka.checkTruth(earth, moon);
    }
}