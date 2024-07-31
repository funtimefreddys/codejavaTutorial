import java.util.Scanner;
public class TestGrade {
    public static void main(String[] args){
int score; 
Scanner in = new Scanner(System.in);
System.out.print("Enter your score : ");
score = in.nextInt(); 
if (score < 50){
    System.out.println("Your grsde is F .");
} else if(score < 60){
    System.out.println("Your grsde is D .");
} else if(score < 70){
    System.out.println("Your grsde is C .");
} else if(score < 80){
    System.out.println("Your grsde is B .");
} else if(score < 100){  
    System.out.println("Your grsde is A .");
}else{
    System.out.println("Invalid score."); 
 
}


}
    
}
