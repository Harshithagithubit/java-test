package com.java;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //File f=new File("D:\\TestFiles\\resume.txt"); //fileinstancewheretocreate by passing location pc-myspace-folder-.txtfile
      //System.out.println( f.createNewFile()); //compileexception comes hndle -->fileiscreatedempty
     
     /* System.out.println(f.delete()); //if filedeleted true returns
      System.out.println( f.createNewFile());*/
       //System.out.println(f.exists()); //if fileexists true ifexists
       
       /*if(f.exists()) 
    	   f.delete();
       System.out.println(f.createNewFile());*/
      // System.out.println(f.isHidden());  //     to check isfile hidden-->hidfile ndcheck
      /* System.out.println(f.canWrite());  //      canwewritedata--> readonlyfile set
       f.setWritable(true);                       //readonlymode=false,writemode=true
       System.out.println(f.canWrite());*/        //writingpermissions there.
		/*File f=new File("./resume.txt");         //currentdirectory
		if(f.exists()) 
	    	   f.delete();
	     System.out.println(f.createNewFile()); */    //file is creted in project folder-->refresh javafolder
		//File f=new File("./Resouces/Test");         //create folderreources ung fileinstance
		//System.out.println(f.mkdirs());       //lasty mentioned folder creates,mkdirs-c:/resumes/english/short/-to create allfolders
		/*if(f.exists())                        ///folderdeletion nd verify
	    	   f.delete();
	       System.out.println(f.exists()); */            //resoucesremoved without mkdirmute then use dirs
		File f=new File("D:\\TestFiles");  //folder files needtobeprint onconsole
		//for(String filename:f.list());  //stringarray returns
		//System.out.println(Arrays.toString(f.list()));
		//System.out.println(Arrays.toString(f.listFiles())); //original path of directory
		//System.out.println(f.getName()); //get filename nd
		System.out.println(f.getAbsolutePath());  //atruntime
		System.out.println(f.getParent());  //to create another file in the same location
		File f1=new File(f.getParent()+"/resume2.docx");
		f1.createNewFile();
		
		
		
		
	 	
	}

}
