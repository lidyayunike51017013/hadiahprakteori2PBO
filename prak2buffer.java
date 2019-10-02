/**
 * @(#)prak2buffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.io.*;
public class prak2buffer {

    public static void main (String[] args) throws IOException {
    	String nama,alamat;
    	char tipe;
    	int bayar,kembalian,harga;
    	
    	InputStreamReader tg = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader (tg);
    	
    	System.out.print("Masukkan Nama Anda = ");
    	nama = br.readLine();
    	
    	System.out.print("Masukkan Tipe Pesawat Anda A-B = ");
    	tipe = (char)br.read();
    	
    	switch(tipe){
    	case'A' : {
    				harga = 5000000;
    				System.out.println("Harga pesawat tipe A senilai = Rp. " +harga);
    				System.out.println("Nominal yang anda bayarkan senilai = Rp. ");
    				bayar = Integer.parseInt(br.readLine());
    				kembalian = bayar-harga;
    				System.out.println("Kembalian anda adalah senilai Rp. "+kembalian);
    	break;
    	}
    	
    	case'B' : {
    				harga = 2000000;
    				System.out.println("Harga pesawat tipe B senilai = Rp. "+harga);
    				System.out.println("Nomimal yang anda bayarkan senilai = Rp. ");
    				bayar = Integer.parseInt (br.readLine());
    				kembalian = bayar-harga;
    				System.out.println("Kembalian anda adalah senilai Rp. "+kembalian);
    	break;
    	}
    	
    	case'C' : {
    				harga = 1000000;
    				System.out.println("Harga pesawat tipe C senilai = Rp. "+harga);
    				System.out.println("Nominal yang anda bayarkan senilai = Rp. ");
    				bayar = Integer.parseInt (br.readLine());
    				kembalian = bayar-harga;
    				System.out.println("Kembalian anda adalah senilai Rp. "+kembalian);
    	break;
    	}	
    	}
    	
    	System.out.println("Transaksi anda sudah selesai. Terima Kasih Untuk Kepercayaannya");
   
    }
    
    
}