public class MainProgram {
    public static void main(String[] args) {
        Manusia geri = new Manusia("mediatek", 80);

        geri.merk = "Foco F2pro";
        geri.powerOn();
        geri.run();
        geri.powerOff();
    }
}