package com.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // ****************************************************************
        // BAGIAN 1: DEMONSTRASI QUEUE (FIFO)
        // ****************************************************************
        // Queue digunakan untuk mengelola antrean pelanggan tiket.
        // Pelanggan yang datang pertama akan dilayani terlebih dahulu.
        // ****************************************************************

        // TODO 1: Inisialisasi Queue untuk antrean pelanggan tiket
        Queue<String> ticketQueue = new LinkedList<>();

        // TODO 2: Tambahkan pelanggan ke dalam Queue menggunakan add()
        // Tambahkan tiga pelanggan: Andi, Titan, Rapi
        ticketQueue.add("Andi");

        ticketQueue.add("Titan");

        ticketQueue.add("Rapi");

        // Menampilkan antrean awal
        System.out.println("Antrean Pelanggan Tiket Awal:");
        System.out.println(ticketQueue);

        // TODO 3: Layani pelanggan pertama menggunakan poll()
        // poll() mengembalikan elemen sekaligus menghapusnya dari Queue
        String servedCustomer = ticketQueue.poll();

        System.out.println("Melayani pelanggan: " + servedCustomer);

        // Menampilkan antrean setelah pelanggan pertama dilayani
        System.out.println("Antrean setelah pelayanan:");
        System.out.println(ticketQueue);

        // TODO 4: Lihat pelanggan berikutnya tanpa menghapusnya menggunakan peek()
        String nextCustomer = ticketQueue.peek();

        System.out.println("Pelanggan berikutnya yang akan dilayani: "
                + nextCustomer);

        // ****************************************************************
        // BAGIAN 2: DEMONSTRASI STACK (LIFO)
        // ****************************************************************
        // Stack digunakan untuk menyimpan riwayat transaksi tiket.
        // Transaksi yang terakhir ditambahkan akan menjadi transaksi
        // pertama yang dapat dibatalkan.
        // ****************************************************************

        // TODO 5: Inisialisasi Stack untuk riwayat transaksi tiket
        Stack<String> transactionHistory = new Stack<>();

        // TODO 6: Tambahkan transaksi ke dalam Stack menggunakan push()
        // Tambahkan tiga transaksi tiket
        transactionHistory.push("Ticket-Transaction-1");

        transactionHistory.push("Ticket-Transaction-2");

        transactionHistory.push("Ticket-Transaction-3");

        // Menampilkan riwayat transaksi tiket
        System.out.println();
        System.out.println("Riwayat Transaksi Tiket:");
        System.out.println(transactionHistory);

        // TODO 7: Batalkan transaksi terakhir menggunakan pop()
        String lastTransaction = transactionHistory.pop();

        System.out.println("Membatalkan transaksi terakhir: "
                + lastTransaction);

        // Menampilkan riwayat transaksi setelah pembatalan
        System.out.println("Riwayat Transaksi Tiket setelah pembatalan:");
        System.out.println(transactionHistory);

        // TODO 8: Lihat transaksi terakhir tanpa menghapusnya menggunakan peek()
        String topTransaction = transactionHistory.peek();

        System.out.println("Transaksi terakhir saat ini: "
                + topTransaction);

        // TODO 9: Periksa apakah riwayat transaksi kosong menggunakan isEmpty()
        if (transactionHistory.isEmpty()) {

            System.out.println("Tidak ada riwayat transaksi tiket.");

        } else {

            // TODO: Dapatkan jumlah transaksi menggunakan size()
            System.out.println(
                    "Riwayat transaksi tiket tidak kosong. Jumlah: "
                            + transactionHistory.size()
            );
        }
    }
}