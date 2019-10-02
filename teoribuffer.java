/**
 * @(#)teoribuffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.io.*;
public class teoribuffer {

    public static void main (String[] args) throws IOException {
    	String nama;
    	int ntugas1, ntugas2, ntugas3, nMid, nFinal;
    	double nRataTugas, nAkhir;
    	
    	InputStreamReader tg = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(tg);
    	
    	System.out.print("Masukkan Nama Mahasiswa : ");
    	nama = br.readLine();
    	System.out.print("Masukkan Nilai Tugas-1 = ");
    	ntugas1 = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan Nilai Tugas-2 = ");
    	ntugas2 = Integer.parseInt (br.readLine());
    	System.out.print("Masukkan Nilai Tugas-3 = ");
    	ntugas3 = Integer.parseInt (br.readLine());
    	System.out.print("Masukkan Nilai MID = ");
    	nMid = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan Nilai Final = ");
    	nFinal = Integer.parseInt(br.readLine());
    	
    	System.out.println();
    	nRataTugas= (ntugas1 + ntugas2 + ntugas3) / 3;
    	nAkhir= (nRataTugas * 0.3) + (nMid * 0.3) + (nFinal * 0.4);
    	System.out.println("Nilai Akhir Mahasiswa = " +nAkhir);
    	System.out.println("Nama Mahasiswa = " +nama);
    	
    	char grade;
    	if (nAkhir >= 80)
    			grade = 'A';
    			
    	else if (nAkhir <= 79 || nAkhir >= 60)
    			grade = 'B'; 
    			
    	else if (nAkhir <= 59 || nAkhir >= 50)
    			grade = 'C';
    		
    	else if (nAkhir <= 49 || nAkhir >= 40)
    			grade = 'D';
    			
    	else
    			grade = 'E';
    				System.out.println("Huruf Nilai Yang Didapatkan Berdasarkan Nilai Akhir Mahasiswa = " +grade);
    				
    	
    	
    }
    
    
}
    	
	    	
 