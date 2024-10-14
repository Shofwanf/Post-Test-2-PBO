/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistem;

import transportasi.Kendaraan;
/**
 *
 * @author Asus
 */
public interface CRUDKendaraan {
    void tambahKendaraan(Kendaraan k);
    void hapusKendaraan(String nomorKendaraan);
    Kendaraan cariKendaraan(String nomorKendaraan);
    void tampilkanSemuaKendaraan();
}
