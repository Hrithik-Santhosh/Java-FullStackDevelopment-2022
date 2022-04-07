package mypackage;

import java.util.Scanner;

public class quizapplication 
{

	public static void main(String[] args) 
	{
    String name;
    int ans, score=0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter your name : ");
    name = obj.nextLine();
    System.out.println("***********************************************");
    System.out.println("Hello "+name+", Welcome to the Quiz Challenge");
    System.out.println("***********************************************");
    System.out.println("Q1: Who is the author of the book Harry Potter");
    System.out.println("1.Agatha Christie  2.JK Rowling  3.Leo Tolstoy  4.Stephen King");
    System.out.println("Enter your choice: ");
    ans = obj.nextInt();
    if (ans==2)
    score=score+20;
    System.out.println("Q2: Which team has won most number of IPL Titles");
    System.out.println("1.Mumbai Indians  2.Rajasthan Royals  3.Royal Challengers Bangalore  4.Delhi Capitals");
    System.out.println("Enter your choice: ");
    ans = obj.nextInt();
    if (ans==1)
    score=score+20;
    System.out.println("Q3: Which is also known as Liquid Gold");
    System.out.println("1.Mercury  2.Water  3.Petroleum  4.Oil");
    System.out.println("Enter your choice: ");
    ans = obj.nextInt();
    if (ans==3)
    score=score+20;
    System.out.println("Q4: The device used for measuring the altitude is");
    System.out.println("1.Altimeter  2.Ammeter  3.Galvanometer  4.Audiometer");
    System.out.println("Enter your choice: ");
    ans = obj.nextInt();
    if (ans==1)
    score=score+20;
    System.out.println("Q5: Which state in India is the largest exporter of coffee");
    System.out.println("1.Kerala  2.Tamil nadu  3.Andra Pradesh  4.Karnataka");
    System.out.println("Enter your choice: ");
    ans = obj.nextInt();
    if (ans==4)
    score=score+20;
    if(score>=60)
    System.out.println("Congrats!!!! "+name+", you have aced the quiz with score of "+score);
    else
    System.out.println("Sorry, Better Luck next time "+name+", you scored "+score);

	}

}
