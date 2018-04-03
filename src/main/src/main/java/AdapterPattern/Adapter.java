package AdapterPattern;

/**
 * 这里就是适配器
 */
public class Adapter implements LowVoltageCharger{

    HighVoltageCharger highVoltageCharger;

    public Adapter(HighVoltageCharger highVoltageCharger){
        this.highVoltageCharger = highVoltageCharger;
    }

    @Override
    public void charging(int battery) {
        highVoltageCharger.charging(battery);
    }
}
