/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author Asus
 */
public abstract class Kendaraan {
    private String nomorKendaraan;
    private String jenisKendaraan;
    private int kapasitas;

    public Kendaraan(String nomorKendaraan, String jenisKendaraan, int kapasitas) {
        this.nomorKendaraan = nomorKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.kapasitas = kapasitas;
    }
    
    public abstract void tampilkanInfo();

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public void setNomorKendaraan(String nomorKendaraan) {
        this.nomorKendaraan = nomorKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

}
