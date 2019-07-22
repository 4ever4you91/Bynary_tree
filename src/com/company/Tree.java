package com.company;

public class Tree {
    Tree anytree = new Tree();
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
    void delete(int key){
        Node parent;
        if (Main_node.main != null){
            parent = Main_node.main;
             while(parent.leftchild.key!=key || parent.rightchild.key!=key){
                 if (parent.key < key)
                 parent = parent.rightchild;
                 else parent = parent.leftchild;
        }
             if (parent.rightchild.leftchild == null && parent.rightchild.rightchild == null || parent.leftchild.rightchild == null && parent.leftchild.leftchild == null){
                 if(parent.leftchild.key == key){
                     parent.leftchild = null;
                 }
                 if (parent.rightchild.key == key){
                     parent.rightchild = null;
                 }
             }
             if (parent.rightchild.rightchild == null || parent.rightchild.leftchild == null && parent.rightchild.key == key){
                 if (parent.rightchild.rightchild != null)
                     parent.rightchild = parent.rightchild.rightchild;
                 if (parent.rightchild.leftchild != null)
                     parent.rightchild = parent.rightchild.leftchild;

             }

             if (parent.leftchild.rightchild == null || parent.leftchild.leftchild == null && parent.leftchild.key == key){
                 if (parent.leftchild.rightchild != null)
                     parent.leftchild = parent.leftchild.rightchild;
                 if (parent.leftchild.leftchild != null)
                     parent.leftchild = parent.leftchild.leftchild;
             }

             }



    }
        else System.out.println("Not possible");



}
