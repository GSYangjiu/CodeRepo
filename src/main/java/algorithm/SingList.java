package algorithm;

import java.util.Scanner;

/**
 * Created by Yang on 2018/2/26 0026.
 */
public class SingList {
    //尾插法
    public static Node endInsert(Node head, int data) {
        Node node = new Node(data);
        //首先判断头结点是否为空，为空将插入节点设置为头结点
        Node p = head;
        if (head == null) {
            node.next = head;
            head = node;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
        return head;
    }

    //头插法
    public static Node headInsert(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    //打印链表数据
    public static void display(Node head) {
        Node p = head;
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node head = null;
        System.out.println("请输入链表长度：");
        int N = scanner.nextInt();//输入链表长度
        System.out.println("请逐个输入链表元素：");
        while (N-- > 0) {
            int ele = scanner.nextInt();
            head = headInsert(head, ele);
        }

        display(head);
        scanner.close();
    }
}

//节点对象
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}