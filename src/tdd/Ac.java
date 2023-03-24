package tdd;

public class Ac {
    private boolean isOn;
    private int temperature = 16;


    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
    if(temperature<30) temperature = temperature+1;
    }
}
