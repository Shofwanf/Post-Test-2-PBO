/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import sistem.SistemTransportasi;
import transportasi.Bus;
import transportasi.Taksi;
import java.util.*;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        SistemTransportasi sistem = new SistemTransportasi();
        Scanner scanner = new Scanner(System.in);
       
        sistem.inisialisasiKendaraanAwal();
        
        while (true) {
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Cari Kendaraan");
            System.out.println("4. Tampilkan Semua Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor kendaraan: ");
                    String nomor = scanner.nextLine();
                    System.out.print("Masukkan jenis kendaraan (1. Bus, 2. Taksi): ");
                    int jenis = scanner.nextInt();
                    System.out.print("Masukkan kapasitas: ");
                    int kapasitas = scanner.nextInt();
                    if (jenis == 1) {
                        sistem.tambahKendaraan(new Bus(nomor, kapasitas));
                    } else {
                        sistem.tambahKendaraan(new Taksi(nomor, kapasitas));
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor kendaraan yang akan dihapus: ");
                    nomor = scanner.nextLine();
                    sistem.hapusKendaraan(nomor);
                    break;
                case 3:
                    System.out.print("Masukkan nomor kendaraan yang dicari: ");
                    nomor = scanner.nextLine();
                    if (sistem.cariKendaraan(nomor) != null) {
                        sistem.cariKendaraan(nomor).tampilkanInfo();
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;
                case 4:
                    sistem.tampilkanSemuaKendaraan();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Total kendaraan saat ini: " + SistemTransportasi.getTotalKendaraan());
        }
    }
}