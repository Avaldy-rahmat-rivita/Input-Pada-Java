import java.util.Scanner;

public class ScannerPengeluaranPerminggu {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        String a = sc.next(); int a1 = sc.nextInt();
        String b = sc.next(); int b1 = sc.nextInt();
        String c = sc.next(); int c1 = sc.nextInt();

        int jumlah = (a1 + b1 + c1) * 7;
        String total = "Total = (" + a + " + " + b + " + " + c + ") x seminggu = " + "Rp" + jumlah;

        System.out.println(total);
    }
}
