package DataStructures.Tree;

import javax.swing.*;

public class TreeNode {

    int nodeValue;
    TreeNode right;
    TreeNode left;
     // This is the constructer of the class TreeNode

    TreeNode(int element, TreeNode root){
        nodeValue = element;
        right=null;
        left=null;
    }

}
