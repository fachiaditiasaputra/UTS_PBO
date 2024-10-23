/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo1;

/**
 *
 * @author MyBook Hype AMD
 */
 class Klien extends Orang {
    
    private String idKlien;

    // Konstruktor
    public Klien(String nama, String kontak, String idKlien) {
        super(nama, kontak);
        this.idKlien = idKlien;
    }

    // Getter dan Setter untuk enkapsulasi
    public String getIdKlien() {
        return idKlien;
    }

    public void setIdKlien(String idKlien) {
        this.idKlien = idKlien;
    }

    // Override tampilkanInfo dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Klien: " + idKlien);
    }
}

    

