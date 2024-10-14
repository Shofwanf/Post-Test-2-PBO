/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author Asus
 */
public class Bus extends Kendaraan {
    public Bus(String nomorKendaraan, int kapasitas) {
        super(nomorKendaraan, "Bus", kapasitas);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nomor Kendaraan: " + getNomorKendaraan());
        System.out.println("Jenis Kendaraan: " + getJenisKendaraan());
        System.out.println("Kapasitas: " + getKapasitas());
    }
}
