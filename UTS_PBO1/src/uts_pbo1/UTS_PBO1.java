/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uts_pbo1;

/**
 *
 * @author MyBook Hype AMD
 */
public class UTS_PBO1 {

    public static void main(String[] args) {
     
        // Membuat objek PemanduWisata
        PemanduWisata pemandu1 = new PemanduWisata("Fachi", "081234567890", "PW001", "Sejarah");
        pemandu1.tampilkanInfo();
        System.out.println();

        // Membuat objek Tur
        Tur tur1 = new Tur("T001", "Derawan Island", 1500000);
        tur1.tampilkanInfo();
        System.out.println();

        // Membuat objek Klien
        Klien klien1 = new Klien("Juliana", "089876543210", "KL001");
        klien1.tampilkanInfo();
        System.out.println();
    }
}

