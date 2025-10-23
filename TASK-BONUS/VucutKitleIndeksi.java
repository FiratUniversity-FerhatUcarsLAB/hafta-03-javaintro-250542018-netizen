 public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen kilonuzu girin (kg): ");
        double kilo = scanner.nextDouble();
        
        System.out.print("Lütfen boyunuzu metre cinsinden girin (örn: 1.75): ");
        double boy = scanner.nextDouble();
        
        double bmi = kilo / (boy * boy);
        
        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f\n", bmi);
        
        scanner.close();
    }
