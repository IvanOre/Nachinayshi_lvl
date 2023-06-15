package ENUM_Perechisleniya;

/**
 * Каждое название это объект класса ENUM Season
 */
public enum Season {
    SUMMER(33),WINTER(-28),AUTUMN(3),SPRING(10);

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
