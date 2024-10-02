import java.util.Scanner;
public class IT24100623lab7Q1{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
int count=0;
double totalmarks=0;
String grade ;
while(count<4){ 
   System.out.print("Enter marks for subject"+" "+(count+1)+":");
   double marks = input.nextDouble();

totalmarks=totalmarks+marks;
count++;
}
double average=totalmarks/4;

System.out.println("The Average is"+average);
if(average >= 75){
     grade="Distinction";
}else if(average >= 50){
     grade="Credit";
}else{
     grade="Fail";
}

 System.out.print("The grade of the student is:"+grade);
  }
}