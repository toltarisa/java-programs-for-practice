package LinkedList;

public class LinkedList {
    Node head;

    public static class Node {
        Integer data;
        Node next;
        
        public Node (Integer data) {
            this.data = data;
        }
    }

    /* LinkedList içerisine yeni bir node ekler */
    public static void insert(LinkedList list, Integer data) {

        /* Parametre olarak gelen yeni veri ile yeni bir node olustur */
        Node newNode = new Node(data);
        newNode.next = null;

        /* Eğer Linked list boş ise gelen veriyi listenin head elemanı yap*/

        if(list.head == null) {
            list.head = newNode;
        }else {
            /* List bos değilse son elemana ulaşana kadar listeyi dön */

            Node lastNode = list.head;

            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }

            /* Yeni olusturulan yeni node'u listenin sonuna yerlestir */
            lastNode.next = newNode;
        }
    }

    /* Verilen LinkedList'i console'a yazdırır */
    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data+" ");

            currentNode = currentNode.next;
        }
    }

    /* Verilen key değeri ile Verilen LinkedList üzerinde silme yapar */

    public static void deleteNodeByKey(LinkedList list, Integer key) {
        Node currentNode = list.head,prev = null;

        /* Eğer head node'un kendisi silinecek key değerini tutuyorsa */

        if(currentNode != null && currentNode.data.equals(key)) {
            // Head değeri değiştirilir
            list.head = currentNode.next;

            System.out.println(key+" bulundu ve silindi");

        }

        /* Eğer key değeri başka bir node içerisinde ise Listeyi traverse etmemiz gerekiyor */

        while(currentNode != null && !currentNode.data.equals(key)) {
            prev = currentNode;
            currentNode  = currentNode.next;
        }

        if(currentNode != null) {

            if(prev != null)
                prev.next = currentNode.next;

            System.out.println(key+" bulundu ve silindi");
        }

        if(currentNode == null) {
            System.out.println(key+" not found !");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);

        deleteNodeByKey(list, 6);

        insert(list, 8);

        printList(list);
    }
}
