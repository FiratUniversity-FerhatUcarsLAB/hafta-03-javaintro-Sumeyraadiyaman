public class HesapOzeti {
    public static void main(String[] args) {
        System.out.println("--------------- HESAP ÖZETİ ----------------");
        System.out.println("Ürün Adı" + "          " + "Adet" + "          " + "Birim Fiyat");
        System.out.println("Elma" + "              " + "  3 " + "          " + "    15.50  ");
        double toplam_a = 3 * 15.50;
        System.out.println(toplam_a);
        System.out.println("Ekmek" + "             " + "  2 " + "          " + "    10.00  ");
        double toplam_b = 2 * 10.00;
        System.out.println(toplam_b);
        System.out.println("Süt" + "               " + "  1 " + "          " + "    32.50  ");
        double toplam_c = 1 * 32.50;
        System.out.println(toplam_c);
        System.out.println("Çikolata" + "          " + "  5 " + "          " + "     8.25  ");
        double toplam_d = 5 * 8.25;
        System.out.println(toplam_d);
        System.out.println("------------------------------------------- -");
        System.out.println(toplam_a +  toplam_b + toplam_c + toplam_d);
    }
}
