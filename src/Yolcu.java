
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatirdiginiz harc miktari :");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasaginiz var mi?(evet ya da hayır) :");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {

            this.siyasiYasak = true;
        } else {

            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu?(evet ya da hayır) :");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {

            this.vizeDurumu = true;
        } else {

            this.vizeDurumu = false;
        }

    }

    @Override
    public boolean yurtDisiHarciKontrol() {

        if (this.harc < 15) {
            System.out.println("Lütfen harcinizi tam yatiriniz...");
            return false;
        } else {

            return true;
        }

    }

    @Override
    public boolean siyasiYasakKontrol() {

        if (this.siyasiYasak == true) {

            System.out.println("Siyasi yasaginiz var.Yurtdisina cikamazsiniz...");
            return false;
        } else {

            System.out.println("Siyasi yasaiginiz bulunmuyor...");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tamam..");
            return true;
        }else{
        
            System.out.println("Vizeniz gideceginiz ülkeye bulunmamaktadir..");
        return false;
        }
        
    }

}

