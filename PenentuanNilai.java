public class PenentuanNilai {

    public static void main(String[] args) {
        int nilai;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        nilai = sc.nextInt();
        
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        
        if (nilai >= 0 && nilai <= 25) {
            System.out.println("nilai E");
        } else if (nilai >= 26 && nilai <= 50) {
            System.out.println("nilai C");
        } else if (nilai >= 51 && nilai <= 75) {
            System.out.println("nilai B");
        } else if (nilai >= 76 && nilai <= 100) {
            System.out.println("nilai A");
        } else {
            System.out.println("Mohon masukkan nilai dari 0-100");
        }
    }
    
}
