package com.assignment2.training;

public class Splitting {
	public static void main(String []args){
		   String strMain = "StringtoBeSplitted, string break at";
		    String[] arrSplit = strMain.split(", ");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		      System.out.println(arrSplit[i]);
		    }
		  }
		}

