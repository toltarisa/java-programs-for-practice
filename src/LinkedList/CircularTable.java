package LinkedList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * - Yuvarlak masa etrafında 1..N adet kişi vardır.
 * - Herkesin elinde 1..N arasında birbirinden farklı sayılar vardır.
 * - 1.kişiden başlanır, 1.kişinin elindeki sayı kadar gidilir ve o sayıdaki sandalyede oturan kişiden
 *   masadan ayrılması istenir
 * - Masayı terk eden kişinin elindeki rakam kadar tekrar gidilir masayı terk etmesi istenir.
 * - Kişinin elindeki sayı tek sayı ise saat yönünde, değilse saat yönünün tersinde hareket edilir.
 * - masa_in.txt dosyasındaki ilk satırdaki tam sayı masadaki kişi sayısını belirtir.
 * - Sonraki satırda, birinci kişinin elindeki sayı vardır, sonraki satırda ise ikinci kişinin elindeki
 *   sayı vardır

 * - masa_out.txt dosyasında ise sırayla hangi kişilerin masayı terk ettiğini yazıyoruz
 */
public class CircularTable {

    private static final String OUTPUT_FILE = "C:\\Users\\isa\\Desktop\\Projects\\Java\\JavaProgramsForPractice\\src\\LinkedList\\masa_out.txt";
    private static final String INPUT_FILE = "C:\\Users\\isa\\Desktop\\Projects\\Java\\JavaProgramsForPractice\\src\\LinkedList\\masa_in.txt";

    static class Node {
        int data;
        int index;
        Node prev;
        Node next;

        Node(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }

    private static Node head;


    /**
     * Bağlı listeye düğüm ekleme işlemi yapar
     *
     * @param value Düğümün içerisinde tutulan değer
     * @param index Düğümün sırası
     */
    static void addNode(int value, int index) {
        if (head == null) {
            Node new_node = new Node(value, index);
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }

        Node last = head.prev;

        Node new_node = new Node(value, index);
        new_node.next = head;
        head.prev = new_node;
        new_node.prev = last;
        last.next = new_node;
    }

    /**
     * masa_in.txt dosyasından verileri okur. Ilk değer masadaki eleman sayısını belirtir.
     *
     * @return      Sayı listesi
     */
    private static List<Integer> readTxtFile() {
        List<Integer> numberList = new ArrayList<>();
        File file = new File(INPUT_FILE);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (sc != null) {
            while (sc.hasNextLine()) {
                numberList.add(Integer.parseInt(sc.nextLine()));
            }
        }

        return numberList;
    }

    /**
     * Parametre olarak gelen sayıyı masa_out.txt dosyasına yazar
     *
     * @param data  Masadan ayrılan oyuncunun numarası
     */
    private static void writeToFile(int data) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File(OUTPUT_FILE), true)
            );
            bw.write(String.valueOf(data));
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = readTxtFile();

        for (int i = 1; i <= numbers.get(0); i++)
            addNode(numbers.get(i), i);

        Node temp;
        temp = head;

        writeToFile(temp.index);

        /* Düğümün sonuna gelene kadar döngüye gir, düğümün sonuna gelince döngüden çık */

        while (temp.next != head) {

            int step = temp.data;
            if (step % 2 == 0) {
                int j;
                for (j = 1; j <= step; j++) {
                    temp = temp.prev;
                }
            } else {
                int i;
                for (i = 1; i <= step; i++)
                    temp = temp.next;
            }

            writeToFile(temp.index);

            /* Masadan ayrılan kişiyi düğümden çıkar */

            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
    }
}