package AdapterPattern;

public class Test {
    public static void main(String[] args){
        Mobile mobilePhone = new Mobile();

        //使用低电压插口直接充电
        LowVoltageCharger lowVoltageCharger = new LowVoltageCharger() {
            @Override
            public void charging(int battery) {
                battery += 1;
            }
        };
        mobilePhone.charging(lowVoltageCharger);

        //使用适配器来让高电压插口也能为手机充电
        HighVoltageCharger highVoltageCharger = new HighVoltageCharger(){
            @Override
            public void charging(int battery) {
                battery += 100;
            }
        };

        //高电压 如果不用适配器直接报错
//        mobilePhone.charging(highVoltageCharger);
        Adapter adapter = new Adapter(highVoltageCharger);
        //通过适配器充电
        mobilePhone.charging(adapter);
    }
}
