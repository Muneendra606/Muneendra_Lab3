package com.muneendra.treesum.main;

import com.muneendra.treesum.service.FindSumPair;
import com.muneendra.treesum.service.Node;

public class Driver {

	public static void main(String[] args) {
		
		Node root= null;
		
		FindSumPair findsumpair= new FindSumPair();
		root= findsumpair.insert(root,40);
		root= findsumpair.insert(root,20);
		root= findsumpair.insert(root,60);
		root= findsumpair.insert(root,10);
		root= findsumpair.insert(root,30);
		root= findsumpair.insert(root,50);
		root= findsumpair.insert(root,70);
		
		int sum= 130;
		findsumpair.findPairWithGivenSum (root, sum);

	}

}
