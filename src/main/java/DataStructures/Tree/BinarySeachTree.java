package DataStructures.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

public class BinarySeachTree {

    private static TreeNode insert(int element, TreeNode root){

        // The new object of Treenode is created only when it is null.

        if(root==null){
            return new TreeNode(element, root);
        }

        // Here the elements which are less than root value are assigned to the left side of the node.

        if(element<root.nodeValue){
            root.left = insert(element, root.left);

        }

        // Here the elements which are greater than root value are assigned to the right side of the node.

        else {
            root.right = insert(element, root.right);

        }

        return root;

    }

    public static void inorder(TreeNode root){

        if(root!=null){
            inorder(root.left);
            System.out.print(root.nodeValue + " ");
            inorder(root.right);


        }

    }


    public static void main(String[] args){

       int[] array = {12,2,38,4,5,78,324};

       TreeNode root = null;

       for(int n:array){
          root = insert(n, root);
       }
        inorder(root);
    }

}
