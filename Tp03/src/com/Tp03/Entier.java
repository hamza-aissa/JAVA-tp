package com.Tp03;

public class Entier {
		
	
	public static int factoriel(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
	}
	public static int absolu(int x) {
		if (x > 0) {
			return x;
		}else if(x<0) {
			return x * -1;
		}
		return x;
	}
    public static void comparer(int e1,int e2) {
        if (e1 >e2) {
            System.out.println(e1 + ">" + e2);
        } else if (e1 < e2) {
            System.out.println(e1 + "<" +e2);
        } else {
            System.out.println(e1 + " = " + e2);
        }
    }
    public static boolean premier (int x) {
    	if(x == 1) {
    		return(false);
    	}
    	for(int i =2;i<x;i++) {
    		if (x%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
    
}

