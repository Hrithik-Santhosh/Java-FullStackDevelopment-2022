package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe 
{
	static final String Projectpath="D:\\Java FullStack 2022 batch\\JavaPhase1_Project\\CompanyLockers_Project\\LockedMeFiles";
	public static void main(String[] args) 
	{
	int ch;
	do
	{
		DisplayMenu();
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Choice");
		ch=Integer.parseInt(obj.nextLine());
		switch(ch)
			{
			case 1:DisplayFiles();
			break;
			case 2:AddFiles();
			break;
			case 3:DeleteFiles();
			break;
			case 4:SearchFiles();
			break;
			case 5:System.exit(0);
			break;
			default: System.out.println("Invalid Choice.");
			break;
		    }
	}
	while(ch>0);
	}
    public static void DisplayMenu()
    {
     System.out.println("*********************************************************************");
     System.out.println("Welcome to CompanyLockers : LockedMe.com");
     System.out.println("Developer Name: Hrithik S");
     System.out.println("*********************************************************************");
     System.out.println("\t1.Display all the files");
     System.out.println("\t2.Add Files to the existing directory");
     System.out.println("\t3.Delete Files from the existing directory");
     System.out.println("\t4.Search Files");
     System.out.println("\t5.Exit");
     System.out.println("*********************************************************************");
    }
    public static void DisplayFiles()
    {
    File[] listfiles = new File(Projectpath).listFiles();
    	if(listfiles.length==0)
    	{
    		System.out.println("No Files exist in the Directory");
    	}
    	else
    	{
    	for (var l:listfiles)
    	{
    		System.out.println(l.getName());
    	}
    	}
    }
    public static void AddFiles()
    {
    try
    {
    	Scanner obj = new Scanner (System.in);
    	String filename;
    	int linescount;
    	int i;
    	System.out.println("Enter the file name to be added to the existing directory");
    	filename=obj.nextLine();
    	System.out.println("Enter the number of line to b added to the file");
    	linescount=Integer.parseInt(obj.nextLine());
    	FileWriter fw = new FileWriter (Projectpath+"\\"+filename);
    	for (i=1;i<=linescount;i++)
    	{
    		System.out.println("Enter the file line content");
    		fw.write(obj.nextLine()+"\n");
    	}
    	System.out.println("File has been successfully created");
    	fw.close();
    }
    catch (Exception ex)
    {
    	System.out.println("An error occured please try again.");
    }
    }
    public static void DeleteFiles()
    {
    try
    {
    	Scanner obj= new Scanner(System.in);
    	String filename;
    	System.out.println("Enter the file name to be deleted:");
    	filename= obj.nextLine();
    	File fd = new File(Projectpath+"\\"+filename);
    	if (fd.exists())
    	{
    	fd.delete();
    	System.out.println("File successfully deleted.");
    	}
    	else
    	{
    		System.out.println("File does not exist");
    	}
    }
    catch (Exception ex)
    {
    	System.out.println("Error occured please try again.");
    }
    }
    public static void SearchFiles()
    {
    Scanner obj = new Scanner (System.in);
    try
	    {
    	String filename;
    	System.out.println("Enter the file name to be searched:");
    	filename= obj.nextLine();
    	File fd = new File(Projectpath+"\\"+filename);
    	if (fd.exists())
    	{
    	System.out.println("File is existing.");
    	}
    	else
    	{
    		System.out.println("File does not exist");
    	}
	    }
    catch (Exception Ex)
	    {
    	System.out.println("Error occured please try again.");
	    }
    }
}
