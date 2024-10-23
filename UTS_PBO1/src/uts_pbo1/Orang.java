/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo1;

/**
 *
 * @author MyBook Hype AMD
 */
public class Orang {
 
    private String nama;
    private String kontak;

    // Konstruktor
    public Orang(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    // Getter dan Setter untuk enkapsulasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    // Method untuk menampilkan informasi orang
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kontak: " + kontak);
    }
}

