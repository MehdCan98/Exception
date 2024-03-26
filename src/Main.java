public class Main {
    public static void main(String[] args) {


        try {
            int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(dizi[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz İndex değeri yazıldı");
        }

    }
}