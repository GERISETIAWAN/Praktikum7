public class MainProgram {
    public static void main(String[] args) {
        Manusia geri = new Manusia("mediatek", 80);

        geri.merk = "Samsung S22";
        geri.powerOn();
        geri.run();
        geri.powerOff();
    }
}