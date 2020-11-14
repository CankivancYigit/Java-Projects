
public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökcen Havalimanina Hosgeldiniz...");
        String sartlar = "Yurtdisi Cikis Kuralları\n"
                + "Herhangi bir siyasi yasaginizin olmamasi gerekiyor.\n"
                + "15 TL harc bedelinizi tam olarak yatirmaniz gerekiyor.\n"
                + "Gideceginiz ülkeye vizenizin olmasi gerekiyor.\n";

        String mesaj = "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor...";

        while (true) {
            System.out.println("****************************");
            System.out.println(sartlar);
            System.out.println("****************************");
            

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.yurtDisiHarciKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }

            System.out.println("Vize kontrol ediliyor....");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }

            
            System.out.println("İslemleriniz tamam.Yurtdisina cikabilirsiniz.");
            break;
            
        }

    }
}

