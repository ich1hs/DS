import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // Panggilan masuk = enqueue
    static void masuk(Queue<Integer> q, int nomor) {
        q.offer(nomor);
        System.out.println("  Masuk  " + nomor);
    }

    // Layani pelanggan = dequeue (mengembalikan nomor yang dilayani, null jika kosong)
    static Integer layani(Queue<Integer> q) {
        if (q.isEmpty()) {
            System.out.println("  Layani -> antrean kosong");
            return null;
        }
        int dilayani = q.poll();
        System.out.println("  Layani -> " + dilayani);
        return dilayani;
    }

    static void tampil(String nama, Queue<Integer> q) {
        System.out.print("  Sisa " + nama + ": ");
        if (q.isEmpty()) {
            System.out.print("(kosong)");
        }
        for (int nomor : q) {
            System.out.print(nomor + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Queue<Integer> cc1 = new LinkedList<>();
        Queue<Integer> cc2 = new LinkedList<>();
        Queue<Integer> cc3 = new LinkedList<>();

        System.out.println("=== Antrean CC1 ===");
        masuk(cc1, 11001);
        masuk(cc1, 11011);
        layani(cc1);
        masuk(cc1, 11123);
        masuk(cc1, 11015);
        layani(cc1);
        masuk(cc1, 11331);
        tampil("CC1", cc1);

        System.out.println("=== Antrean CC2 ===");
        masuk(cc2, 11011);
        layani(cc2);
        masuk(cc2, 11321);
        masuk(cc2, 11250);
        masuk(cc2, 11890);
        masuk(cc2, 11765);
        layani(cc2);
        tampil("CC2", cc2);

        System.out.println("=== Antrean CC3 ===");
        masuk(cc3, 11543);
        masuk(cc3, 11632);
        layani(cc3);
        layani(cc3);
        masuk(cc3, 11387);
        masuk(cc3, 11289);
        layani(cc3);
        tampil("CC3", cc3);
    }
}