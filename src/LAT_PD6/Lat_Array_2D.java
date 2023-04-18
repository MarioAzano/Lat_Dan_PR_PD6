package LAT_PD6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Lat_Array_2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Deklarasi 2 D
        String[][] ips= new String[3][4];
        //Karena Array bertipe string maka ada konversi data bertipe string ke intejer bagi sks,bobot,total,jumlah sks
        //hasil konversi pada variabel
        double sks,bobot,jsks,gt = 0,ip,tb,total;

        try {
            //Input data nim & nama
            System.out.print("Nim : ");
            String nim = br.readLine();
            System.out.print("Nama : ");
            String nama = br.readLine();
            //Input data mk(Jumlah Data MK >1)

            for (int i = 0; i <ips.length; i++) {
                System.out.print("Nama MK : ");
                ips[i][0] = br.readLine();
                System.out.print("SKS : ");
                ips[i][1] = br.readLine();
                //konversi tipe data dari ips[][](string) ke double
                sks = Double.parseDouble(ips[i][1]);
                System.out.print("Bobot : ");
                ips[i][2] = br.readLine();
                bobot = Double.parseDouble(ips[i][2]);

                //Memasukkan hitungan ips
                tb = sks * bobot;

                //total bobot per index
                //konversi dari numeric ke string --> String.valueof
                ips[i][3] = String.valueOf(tb);
                System.out.println("Total : " + ips[i][3]);

                //hitung grand total
                gt = gt +tb;
                System.out.println("-----------------------------------------------------------");
            }

            System.out.println("Grand Total Dari SKS * Bobot : " + gt );
            //Hitung IP
            System.out.print("Jumlah SKS Yang Diambil : ");
            jsks= Double.parseDouble(br.readLine());
            ip = gt / jsks;
            System.out.println("IP Anda PAda semester Ini Adalah :" + ip);

        }catch (Exception e){

        }
    }
}
