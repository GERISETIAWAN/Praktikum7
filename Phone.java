public class Phone implements IPhone {
    public String merk;
    public int volume;
    
    @Override
    public void powerOn() {
        System.out.println("Handphone dinyalakan... ");
    }
    
    @Override
    public void powerOff() {
        System.out.println("Handphone dimatikan... ");
    }
}