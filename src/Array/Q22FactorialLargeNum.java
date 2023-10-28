package Array;

import java.util.Scanner;
//
//public class Q22FactorialLargeNum {
////    static class Node{
////        int data ;
////        Node prev ;
////        Node(int node){
////            this.data = node;
////            this.prev = null;
////        }
////    }
//static class Node {
//    public int value;
//    public Node next;
//
//    public Node(int value) {
//        this.value = value;
//        this.next = null;
//    }
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t =  sc.nextInt();;
////        while (t-->0){
////            int n = sc.nextInt() ;
////            Node tail = new Node(1);
////            for (int i = 2; i <= n ; i++) {
////                multiply(tail,i);
////                print(tail);
////                System.out.println();
////            }
//        int n = 100;
//        Node result = new Node(1);
//        result = factorial(n, 0, result);
//
//        System.out.print(n + "! = ");
//        while (result != null) {
//            System.out.print(result.value);
//            result = result.next;
//        }
//        }
//    }
//
//
//    public static Node factorial(int n, int carry, Node current) {
//        if (n == 0 && carry == 0) {
//            return current;
//        }
//
//        int factorial = carry + (n == 0 ? 1 : n) * current.value;
//        carry = factorial / 10;
//        factorial = factorial % 10;
//
//        Node next = new Node(factorial);
//        next.next = current;
//
//        return factorial(n - 1, carry, next);
//    }
//
//    public static void main(String[] args) {
//        int n = 100;
//        Node result = new Node(1);
//        result = factorial(n, 0, result);
//
//        System.out.print(n + "! = ");
//        while (result != null) {
//            System.out.print(result.value);
//            result = result.next;
//        }
//    }
////    private static void multiply(Node tail, int n) {
////        Node temp = tail,prevNode = tail;
////        int carry = 0;
////        while (temp != null){
////            int data = temp.data*n+carry;
////            temp.data = data%10;
////            carry = data/10;
////            prevNode = temp;
////             temp = temp.prev;
////        }
////        while (carry != 0 ){
////            prevNode.prev = new Node((int) (carry%10 ));
////            carry/=10;
////            prevNode = prevNode.prev;
////        }
////    }
////
////    private static void print(Node tail) {
////        //tail recursion
////        if (tail==null)return;
////        print(tail.prev);
////        System.out.println(tail.data);
////    }
//}

 class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Q22FactorialLargeNum {
    public static Node factorial(int n, int carry, Node current) {
        if (n == 0 && carry == 0) {
            return current;
        }

        int factorial = carry + (n == 0 ? 1 : n) * current.value;
        carry = factorial / 10;
        factorial = factorial % 10;

        Node next = new Node(factorial);
        next.next = current;

        return factorial(n - 1, carry, next);
    }

    public static void main(String[] args) {
        int n = 1;
        Node result = new Node(1);
        result = factorial(n, 0, result);

        System.out.print(n + "! = ");
        while (result != null) {
            System.out.print(result.value);
            result = result.next;

        }
    }
}


