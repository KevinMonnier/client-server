package com.emn.metier;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LCS {

	
	public static String lcs(String str1, String str2) {
	        int M = str1.length();
	        int N = str2.length();
	        String lcs = "";
	        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
	        int[][] opt = new int[M+1][N+1];

	        // compute length of LCS and all subproblems via dynamic programming
	        for (int i = M-1; i >= 0; i--) {
	            for (int j = N-1; j >= 0; j--) {
	                if (str1.charAt(i) == str2.charAt(j))
	                    opt[i][j] = opt[i+1][j+1] + 1;
	                else 
	                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
	            }
	        }

	        // recover LCS itself and print it to standard output
	        int i = 0, j = 0;
	        while(i < M && j < N) {
	            if (str1.charAt(i) == str2.charAt(j)) {
	                lcs+=str1.charAt(i);
	                i++;
	                j++;
	            }
	            else if (opt[i+1][j] >= opt[i][j+1]) i++;
	            else                                 j++;
	        }
	        return lcs;
	}
	
	public static void diff(int lineFile, String str1, String str2){
		String subseq = lcs(str1, str2);
    	if(!subseq.equals(str1) || !subseq.equals(str2)) {
    		System.out.println("Difference found line " + lineFile + ":");
    		System.out.println("< " + str1);
    		System.out.println("---");
    		System.out.println("> " + str2);
    	}
    	
	}
	
	public static void diffFiles(String fileName1, String fileName2){
		try{

			FileInputStream fstream1 = new FileInputStream(fileName1);
			DataInputStream in1 = new DataInputStream(fstream1);
			BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
			FileInputStream fstream2 = new FileInputStream(fileName2);
			DataInputStream in2 = new DataInputStream(fstream2);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
			String strLine1;
			String strLine2;
			int i = 1;
			strLine1 = br1.readLine();
			strLine2 = br2.readLine();
			while ((strLine1 != null) || (strLine2 != null))   {
		        if(strLine1 == null) {
		        	strLine1 = "";
		        }
		        if(strLine2 == null) {
		        	strLine2 = "";
		        }
				diff(i, strLine1, strLine2);
				strLine1 = br1.readLine();
				strLine2 = br2.readLine();
		        i++;
			}
			in1.close();
			in2.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		diffFiles("files/file1.txt", "files/file2.txt");
	}
		
}