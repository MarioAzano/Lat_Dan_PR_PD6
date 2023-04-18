import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PR_Array_2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] pj= new String[5][4];
        int gt=0, kw,harga,total,kembali,bayar;

        try {
            System.out.print("Nama Pelanggan : ");
            String nama = br.readLine();

            for (int i = 0; i <pj.length ; i++) {
                System.out.print("Masukkan Nama Barang : ");
                pj[i][0] = br.readLine();
                System.out.print("Masukkan Kuantitas Barang : ");
                pj[i][1] = br.readLine();
                kw=Integer.parseInt(pj[i][1]);
                System.out.print("Masukkan Harga Barang: ");
                pj[i][2] = br.readLine();
                harga=Integer.parseInt(pj[i][2]);
                total = harga * kw;
                pj[i][3] = String.valueOf(total);
                System.out.println("Total : " + total );
                gt = gt +total;
                System.out.println("-----------------------------------------------------------");

            }
            System.out.println("Grand Total : " + gt);
            System.out.print("Uang Yang Dibayarkan : ");
            bayar = Integer.parseInt(br.readLine());
            kembali = bayar - gt ;
            System.out.println("Kembaliannya Sebesar :  " +kembali );
        }catch (Exception e){

        }
    }
}
