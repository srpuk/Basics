package com.core.general;

import java.util.BitSet;

public class BitSetExample {

	public static void main(String[] args) {
		

		BitSet bitset=new BitSet();
		bitset.set(1, true);
		bitset.set(3, false);
		bitset.set(4, true);
		
		System.out.println("biteset is"+bitset);
		
		BitSet bitset2=new BitSet();
		bitset2.set(1, true);
		bitset2.set(3, false);
		bitset2.set(4, false);
		
		bitset.and(bitset2); //AND operation
		System.out.println("AND is"+ bitset);
	}
	
	

}
