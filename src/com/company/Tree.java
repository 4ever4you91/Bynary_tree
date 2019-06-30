package com.company;

public class Tree {
    void insert(int key, double inform){
        Node current = Main_node.main;
        Node node = new Node();
        if (Main_node.main == null){
            Main_node.main = node;
            Main_node.main.inform = inform;
            Main_node.main.key = key;
        }
        else {
            while((current.leftchild != null && current.rightchild != null) || (current.rightchild == null && current.key > key && current.leftchild != null) || (current.leftchild == null && current.key < key && current.rightchild != null) ) {
                if (current.key > key)
                    current = current.leftchild;
                else
                    current = current.rightchild;
                }
                if (current.key > key){
                    current.leftchild = node;
                }

                else {
                    current.rightchild = node;
                }
                node.inform = inform;
                node.key = key;

        }

    }
    Node search( int key) {
        Node current;
        if (Main_node.main != null) {
            current = Main_node.main;
            while (current.key != key) {
                if (current == null)
                    return null;
                if (current.key > key)
                    current = current.leftchild;
                else current = current.rightchild;


            }
            return current;
        }
        else
            return null;
    }
}
