import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Hasil konversi ke desimal: " + decimal);
    }
}

// Konversi dari Biner ke Desimal:
//Program ini mengonversi bilangan biner ke desimal.
// Pengguna diminta untuk memasukkan bilangan biner,
// dan program kemudian menggunakan metode Integer.parseInt() dengan dasar 2
// untuk mengonversinya menjadi bilangan desimal.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Hasil konversi ke biner: " + binary);
    }
}

//Program ini mengonversi bilangan desimal ke biner.
// Pengguna diminta untuk memasukkan bilangan desimal,
// dan program menggunakan metode Integer.toBinaryString()
// untuk mengonversinya menjadi bilangan biner.




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal);
        System.out.println("Hasil konversi ke heksadesimal: " + hex);
    }
}

//Program ini mengonversi bilangan biner ke heksadesimal.
// Pertama-tama, bilangan biner dikonversi ke desimal seperti yang dilakukan dalam program konversi biner ke desimal.
// Setelah itu, desimal dikonversi menjadi heksadesimal dengan menggunakan metode Integer.toHexString().




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan heksadesimal: ");
        String hex = scanner.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Hasil konversi ke biner: " + binary);
    }
}

//Program ini mengonversi bilangan heksadesimal ke biner.
// Pengguna diminta untuk memasukkan bilangan heksadesimal,
// dan program mengonversinya menjadi desimal dengan dasar 16 menggunakan Integer.parseInt().
// Kemudian, desimal dikonversi menjadi biner.




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = scanner.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.println("Hasil konversi ke heksadesimal: " + hex);
    }
}

// Program ini mengonversi bilangan desimal ke heksadesimal.
// Pengguna diminta untuk memasukkan bilangan desimal,
// dan program menggunakan metode Integer.toHexString() untuk mengonversinya menjadi bilangan heksadesimal.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan heksadesimal: ");
        String hex = scanner.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Hasil konversi ke desimal: " + decimal);
    }
}


//Program ini mengonversi bilangan heksadesimal ke desimal.
// Pengguna diminta untuk memasukkan bilangan heksadesimal,
// dan program menggunakan metode Integer.parseInt() dengan dasar 16 untuk mengonversinya menjadi bilangan desimal.