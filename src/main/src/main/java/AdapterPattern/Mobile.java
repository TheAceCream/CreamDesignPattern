package AdapterPattern;

public class Mobile {
    int battery = 0;
    public void charging(LowVoltageCharger charger){
        charger.charging(battery);
    }
}
