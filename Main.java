import java.util.Scanner;
//Fahrezy A.D Romero Purba
//2100018485
//J
//TUGAS PBO E-Learning

public class Main {

    public static void main(String[] args)
    {
        int sepatu;

         Scanner input=new Scanner(System.in);


        int k=0;
        do {
            System.out.print("*");
            k++;
        }
        while(k<=42);
        System.out.println("\n*          Tugas Toko Sepatu         *");
        System.out.println("*******************************");
        System.out.print("Masukan banyak Merk Sepatu : ");
        sepatu=input.nextInt();

        String data[][]=new String[sepatu][4];
        System.out.println("Masukan Variasi Sepatu:");
        for (int i=0;i<sepatu;i++)
        {
            System.out.println("");
            System.out.println("Data ke-"+(i+1));
            for (int j=0;j<4;j++)
            {
                if (j==0)
                {
                    System.out.print("Merk Sepatu : ");
                }
                else if(j==1)
                {
                    System.out.print("Ukuran Sepatu : ");
                }
                else if(j==2)
                {
                    System.out.print("Warna Sepatu : ");
                }
                else
                {
                    System.out.print("Jumlah Sepatu : ");
                }
                data[i][j]=input.next();
            }
        }
//        batas
        System.out.println("----------------------");
        System.out.println("\ndata mahasiswa kelas ");
        System.out.println("----------------------");
        System.out.println("Merk Sepatu \t\t Ukuran Sepatu \t\t Warna Sepatu \t\t JUMLAH SEPATU \t");
        for(int i=0;i<sepatu;i++)
        {
            for (int j=0; j<4;j++)
            {
                System.out.print(data[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}