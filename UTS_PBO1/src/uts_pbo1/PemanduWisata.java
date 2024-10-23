/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo1;

/**
 *
 * @author MyBook Hype AMD
 */
class PemanduWisata extends Orang{
    
    private String idPemandu;
    private String spesialisasi;

    // Konstruktor
    public PemanduWisata(String nama, String kontak, String idPemandu, String spesialisasi) {
        super(nama, kontak);
        this.idPemandu = idPemandu;
        this.spesialisasi = spesialisasi;
    }

    // Getter dan Setter untuk enkapsulasi
    public String getIdPemandu() {
        return idPemandu;
    }

    public void setIdPemandu(String idPemandu) {
        this.idPemandu = idPemandu;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    // Override tampilkanInfo dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Pemandu: " + idPemandu);
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}

    
