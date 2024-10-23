/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo1;

/**
 *
 * @author MyBook Hype AMD
 */
public class Tur {
    
    private String idTur;
    private String tujuan;
    private double harga;

    // Konstruktor
    public Tur(String idTur, String tujuan, double harga) {
        this.idTur = idTur;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    // Getter dan Setter untuk enkapsulasi
    public String getIdTur() {
        return idTur;
    }

    public void setIdTur(String idTur) {
        this.idTur = idTur;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan informasi tur
    public void tampilkanInfo() {
        System.out.println("ID Tur: " + idTur);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga: Rp" + harga);
    }
}


