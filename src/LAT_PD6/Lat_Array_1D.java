package LAT_PD6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Lat_Array_1D {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //Deklarasi Array 1D


        String[] nmk=new String[3];
        int[] sks = new int[3];
        int[] bobot = new int[3];

        //input
        // .length MENGUlANG SEBANYAK PANJANG ARRAY
        for (int i = 0; i <nmk.length; i++) {
            System.out.print("Nama MK : ");
            nmk[i] = br.readLine();
            System.out.print("SKS : ");
            sks[i] = Integer.parseInt(br.readLine());

        }//Output
        for (int j = 0; j <nmk.length ; j++) {
            System.out.println("Nama MK Adalah : " + nmk[j]);
            System.out.println("Besar SKS Adalah : " + sks[j]);
        }
        }
}
