import java.util.Scanner;

public class ParaBozma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bozdurulacak para miktarını (TL) girin: ");
        int tutar = input.nextInt();
        int yüz=tutar/100;
        int yüzdenKalan=tutar%100;
        int elli=yüzdenKalan/50;
        int ellidenKalan=yüzdenKalan%50;
        int yirmi=ellidenKalan/20;
        int yirmidenKalan=ellidenKalan%20;
        int bes=yirmidenKalan/5;
        int besdenKalan=yirmidenKalan%5;
        int iki=besdenKalan/2;
        int ikidenKalan=besdenKalan%2;
        System.out.println(yüz+"X100 + "+elli+"X50 +"+yirmi+"X20 + "+bes+"X5 + "+iki+"X2 + "+ikidenKalan+"X1");
    }
}
