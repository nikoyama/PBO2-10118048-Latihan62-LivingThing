/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan62.livingthing;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan sesuatu dengan konsep abstrak
 */
public class PBO210118048Latihan62LivingThing {

    public static void main(String[] args) {
        
        Human human = new Human();
        
        human.setNama("Niko Yama");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }

}
