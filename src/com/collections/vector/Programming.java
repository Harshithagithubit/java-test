package com.collections.vector;
import java.io.File;
import java.io.IOException;


public class Programming {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f3=new File("./sample.txt");
		if(!f3.exists()) {
			f3.createNewFile();
			f3.delete();
		}

	}

}
