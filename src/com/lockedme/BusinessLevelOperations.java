package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BusinessLevelOperations implements  FileInterface {
	
	
	
	
	final String dirPath = "/Users/kavita/Desktop/lockedme-part1";
	Scanner sc= new Scanner(System.in);
	
	String filename;
	
	
	@Override
		public void showAllFiles() {
		File[] files=new File(dirPath).listFiles();
		
		List <String> retrieve=new ArrayList<String>();
		
			for(File file : files) {
				if(file.isFile()) {
					
					retrieve.add(file.getName());
			
				}
			}
			
			Collections.sort(retrieve);
				
			for(int i=0;i<retrieve.size();i++) {
				System.out.println(retrieve.get(i));
			}

	
			
	}

@Override
	public void addFile() {

		System.out.println("enter the file that you want to add. It will be added to dir = " + dirPath);
		
		filename=sc.nextLine();
		
		File file= new File(dirPath + "/" + filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println(filename+" file is created");
				
			}else 
				System.out.println("The file "+filename+" already exists");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void deleteFile() {
		
		System.out.println("Enter the file name you want to delete. It will be deleted from dir =" + dirPath);
		
		filename=sc.nextLine();
		File file= new File(dirPath + "/" + filename);
		
			if(file.delete()) {
				System.out.println(filename + " has been deleted");
			}else
				System.out.println("File not found");
			
		
	
		
	}
@Override
	public void searchFile() {
	
	System.out.println("Enter the file name you want to Search. It will be searched from dir =" + dirPath);
	
	filename=sc.nextLine();
	
	File[] files=new File(dirPath).listFiles();
	
	int flag=0;
	for(File file:files) {
			  if((file.getName().equals(filename))){
			  
			  System.out.println(filename+" file is found!");
			   flag=1;
		  }
		  }
	if(flag==0) {
		
		System.out.println("file not found");
	}
	
	
  }
	
}


	

