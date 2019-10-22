/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan49.biayaemaskawin;

/**
 * @author
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deskripsi Program  : Program untuk menghtung harga emas kawin konsep orientasi objek
 */
public class Emas {
    
    private double mahar;
    private double harga;

    public double getMahar() {
        return mahar;
    }

    public void setMahar(double mahar) {
        this.mahar = mahar;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double hitungHarga(double emas, double harga) {
        return emas * harga;
    }
}
