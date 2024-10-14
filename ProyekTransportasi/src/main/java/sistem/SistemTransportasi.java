/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.util.*;
import transportasi.*;


/**
 *
 * @author Asus
 */
public class SistemTransportasi implements CRUDKendaraan {
    private final ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static int totalKendaraan = 0;

    public SistemTransportasi() {
    }

    public void inisialisasiKendaraanAwal() {
        Bus bus = new Bus("KT1122BS", 40);
        Taksi taksi = new Taksi("KT2233TK", 4);

        tambahKendaraan(bus);
        tambahKendaraan(taksi);
    } 
   
    
    @Override
    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
        totalKendaraan++;
    }

    @Override
    public void hapusKendaraan(String nomorKendaraan) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNomorKendaraan().equals(nomorKendaraan)) {
                daftarKendaraan.remove(k);
                totalKendaraan--;
                System.out.println("Kendaraan dengan nomor " + nomorKendaraan + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kendaraan tidak ditemukan.");
    }

    @Override
    public Kendaraan cariKendaraan(String nomorKendaraan) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNomorKendaraan().equals(nomorKendaraan)) {
                return k;
            }
        }
        return null;
    }

    @Override
    public void tampilkanSemuaKendaraan() {
        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanInfo();
            System.out.println("--------------------");
        }
    }

    public static int getTotalKendaraan() {
        return totalKendaraan;
    }
}