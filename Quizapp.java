import java.util.Scanner;

public class Quizapp {

    public static void main(String[] args) {
     Questions_answers questions = new Questions_answers();  
     Questions_answers answers = new Questions_answers();
     Scanner input = new Scanner(System.in) ;
     char ans;
     int correct = 0 , wrong = 0;
     questions.question1();
     ans = input.next().charAt(0);
     if (ans==answers.answer1) {
        correct++;
     }
     else wrong++;
     questions.question2();
     ans = input.next().charAt(0);
     if (ans==answers.answer2) {
        correct++;
        }
        else wrong++;
        questions.question3();
        ans = input.next().charAt(0);
        if (ans==answers.answer3) {
           correct++;
        }
        else wrong++;
        questions.question4();
        ans = input.next().charAt(0);
        if (ans==answers.answer4) {
           correct++;
        }
        else wrong++;
        questions.question5();
        ans = input.next().charAt(0);
        if (ans==answers.answer5) {
           correct++;
        }
        else wrong++;
        questions.question6();
        ans = input.next().charAt(0);
        if (ans==answers.answer6) {
           correct++;
        }
        else wrong++;
        questions.question7();
        ans = input.next().charAt(0);
        if (ans==answers.answer7) {
           correct++;
        }
        else wrong++;
        questions.question8();
        ans = input.next().charAt(0);
        if (ans==answers.answer8) {
           correct++;
        }
        else wrong++;
        questions.question9();
        ans = input.next().charAt(0);
        if (ans==answers.answer9) {
           correct++;
        }
        else wrong++;
        questions.question10();
        ans = input.next().charAt(0);
        if (ans==answers.answer10) {
           correct++;
        }
       else wrong++;
       
       double correct_double = correct;
       double percentage = (correct_double/10)*100;
      
       System.out.println("The total marks are : 100");
       System.out.println("Your marks are :+ correct*10");
       System.out.println("Total questions are :10");
       System.out.println("Your correct answers are :" + "correct + *\nyour wrong answers are : "+ wrong);
       System.out.println("Your Percentage is :" + percentage +"%");

    }
}
class Questions_answers{
    void question1(){
        System.out.println("1. Which planet is known as the Red Planet?\n" + //
                        "A) Venus\n" + //
                        "B) Mars\n" + //
                        "C) Jupiter\n" + //
                        "D) Saturn");
    }
    void question2(){
        System.out.println("2. What is the capital of France?\n" + //
                        "A) Berlin\n" + //
                        "B) Madrid\n" + //
                        "C) Paris\n" + //
                        "D) Rome");
    }
    void question3(){
        System.out.println("3. Who wrote the play \"Romeo and Juliet\"?\n" + //
                        "A) Charles Dickens\n" + //
                        "B) William Shakespeare\n" + //
                        "C) Mark Twain\n" + //
                        "D) Jane Austen");
    }
    void question4(){
        System.out.println("4. What is the largest ocean on Earth?\n" + //
                        "A) Atlantic Ocean\n" + //
                        "B) Indian Ocean\n" + //
                        "C) Southern Ocean\n" + //
                        "D) Pacific Ocean");
    }
    void question5(){
        System.out.println("5. What is the chemical symbol for water?\n" + //
                        "A) H2O\n" + //
                        "B) O2\n" + //
                        "C) CO2\n" + //
                        "D) NaCl");
    }
    void question6(){
        System.out.println("6. Which element has the atomic number 1?\n" + //
                        "A) Helium\n" + //
                        "B) Hydrogen\n" + //
                        "C) Lithium\n" + //
                        "D) Carbon");
    }
    void question7(){
        System.out.println("7. What is the fastest land animal?\n" + //
                        "A) Lion\n" + //
                        "B) Cheetah\n" + //
                        "C) Horse\n" + //
                        "D) Leopard");
    }
    void question8(){
        System.out.println("8. In which year did the Titanic sink?\n" + //
                        "A) 1912\n" + //
                        "B) 1920\n" + //
                        "C) 1905\n" + //
                        "D) 1898");
    }
    void question9(){
        System.out.println("9. Which country is the largest by area?\n" + //
                        "A) Canada\n" + //
                        "B) China\n" + //
                        "C) United States\n" + //
                        "D) Russia");
    }
    void question10(){
        System.out.println("10. Who painted the Mona Lisa?\n" + //
                        "A) Vincent van Gogh\n" + //
                        "B) Leonardo da Vinci\n" + //
                        "C) Pablo Picasso\n" + //
                        "D) Claude Monet");
    }

    //key
    char answer1 = 'B';
    char answer2 = 'C';
    char answer3 = 'B';
    char answer4 = 'D';
    char answer5 = 'B';
    char answer6 = 'B';
    char answer7 = 'B';
    char answer8 = 'B';
    char answer9 = 'D';
    char answer10 = 'A';
    
}