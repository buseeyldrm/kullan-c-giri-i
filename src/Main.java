import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        String adi = klavye.nextLine();
        System.out.print("Şifrenizi girin: ");
        String sifre = klavye.nextLine();

        if (adi.equals("java123") && sifre.equals("patika")){
            System.out.println("giriş başarılı.");
        }
        else {
            System.out.println("kullanıcı adi veya şifreniz yalnış.");
            System.out.print("şifrenizi sıfırlamak ister misiniz?: ");
            String cevap=klavye.nextLine();

            if (cevap.equals("hayır")){
                System.out.println("sistemden çıkış yapılıyor.");
            } else if (cevap.equals("evet")) {

                System.out.print("yeni şifre: ");
                String yeniSifre= klavye.nextLine();

                if (yeniSifre.equals("patika") || yeniSifre.equals(sifre)){
                    System.out.println("yeni şifre eski şifrenle aynı ve yanlış girdiğiniz şifre ile aynı olmaz.");

                }
                else {
                    System.out.println("yeni şifre oluşturuldu.");
                }


                }
            else {
                System.out.println("geçersiz işlem girdiniz.");

            }
        }


    }}