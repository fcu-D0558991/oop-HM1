package com.exercise;

public class exe1 {

		//String strTmp=new String("it");
		//strTmp=strTmp.replaceAll("it","her");
	    public static void main(String[] args) {
	    	String lyriccs="Let it go!Let it go!Cannot hold it back anymore";
	    	String s=lyriccs.replaceAll("it","\"her\"");
	    	String t=s.replaceAll("Cannot","can't");
	    	System.out.println(t);
	    }
}