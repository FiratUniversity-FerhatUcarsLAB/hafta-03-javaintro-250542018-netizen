public class AlanCevre {
    public static void main(String[] args) {
      
        int a,b,c;
        a=3;
        b=4;
        c=5;
        int s=(a+b+c)/2;
        int alan=s*(s-a)*(s-b)*(s-c);
        System.out.println("Üçgenin Alanı: "+Math.sqrt(alan));


    }
}
