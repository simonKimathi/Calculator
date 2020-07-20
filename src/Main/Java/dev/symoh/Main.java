package dev.symoh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //create instances
        Scanner scanner=new Scanner(System.in);
        regularCalculator regularCalculator=new regularCalculator();
        binaryCalculator binaryCalculator=new binaryCalculator();
        scientificCalculator scientificCalculator=new scientificCalculator();
        //start a do-while loop to keep program running until user decides to exit
        System.out.println("welcome to binary and decimal calculator\n");
        int z; //store type of operation
        int n; // store number system
        int e=1; //controls exit to program
        while (e==1){
            //get the preferred operation
            do { //makes sure selected operation is available
                System.out.println("please enter the number of operation you want to do\n" +
                        "****************************************************\n" +
                        "1: addition\n" +
                        "2: subtraction\n" +
                        "3: multiplication\n" +
                        "4: division,\n" +
                        "5: Tan\n" +
                        "6: cos\n" +
                        "7: sin\n" +
                        "8: Factorial\n" +
                        "9: log\n" +
                        "10: square root\n" +
                        "____________________________________________");
                z=scanner.nextInt();
                if(z!=1 && z!=2 && z!=3 && z!=4 && z!=5 && z!=6 && z!=7 && z!=8 && z!=9 && z!=10){
                    System.out.println("invalid choice, try again"); //on wrong value give feedback
                }
            } while (z!=1 && z!=2 && z!=3 && z!=4 && z!=5 && z!=6 && z!=7 && z!=8 && z!=9 && z!=10); //makes sure selected operation is available

            //do calculations for binary and regular calculator
            if (z==1 || z==2 || z==3 || z==4) {
                //get the number system
                do {//makes sure selected number system is available
                    System.out.println("please enter the number of your preferred number system\n" +
                            "*******************************************************\n" +
                            "1: decimal number system(base10)\n" +
                            "2: binary number system(base2)\n" +
                            "____________________________________________");
                    n=scanner.nextInt();
                    if(n!=1 && n!=2){
                        System.out.println("invalid choice, try again");//on wrong value give feedback
                    }
                } while (n!=1 && n!=2);//makes sure selected number system is available
                //get the values for calculations for decimal number system
                if(n==1){
                    System.out.println("please enter the first value");
                    regularCalculator.setX(scanner.nextInt());
                    System.out.println("please enter the second value");
                    regularCalculator.setY(scanner.nextInt());
                }
                //get the values for calculations for binary number system
                else{
                    System.out.println("please enter the first value");
                    binaryCalculator.setX(scanner.nextInt());
                    System.out.println("please enter the second value");
                    binaryCalculator.setY(scanner.nextInt());
                }

                switch (z){
                    //calculate sum
                    case 1:
                        //sum for base10
                        if(n==1){
                            System.out.println("The answer is: " + regularCalculator.sum());
                        }
                        //sum for base2
                        else {
                            System.out.println("The answer is: " + binaryCalculator.sum());
                        }
                        break;
                    //calculate subtraction
                    case 2:
                        //subtract for base10
                        if(n==1){
                            System.out.println("The answer is: " + regularCalculator.subtract());
                        } //subtract for base2
                        else {
                            System.out.println("The answer is: " + binaryCalculator.subtract());
                        }
                        break;
                    //calculate multiplication
                    case 3:
                        //multiply for base10
                        if(n==1){
                            System.out.println("The answer is: " + regularCalculator.multiply());
                        } //multiply for base2
                        else {
                            System.out.println("The answer is: " + binaryCalculator.multiply());
                        }
                        break;
                    //calculate division
                    case 4:
                        //divide for base10
                        if(n==1){
                            System.out.println("The answer is: " + regularCalculator.divide());
                        } //divide for base2
                        else {
                            System.out.println("The answer is: " + binaryCalculator.divide());
                        }
                        break;
                }
            }

            //do calculations for scientific calculator
            else {
                System.out.println("enter the value");
                scientificCalculator.setX(scanner.nextDouble());
                switch (z){
                    case 5:
                        System.out.println("the tan is "+scientificCalculator.tan());
                        break;
                    case 6:
                        System.out.println("the cos is "+scientificCalculator.cos());
                        break;
                    case 7:
                        System.out.println("the sin is "+scientificCalculator.sin());
                        break;
                    case 8:
                        System.out.println("the factorial is "+scientificCalculator.factorial());
                        break;
                    case 9:
                        System.out.println("the log is "+scientificCalculator.log());
                        break;
                    case 10:
                        System.out.println("the square root is "+scientificCalculator.sq());
                        break;

                }
            }
            //prompt for user to exit
            System.out.println("enter 1 to do another calculation or 2 to exit");
            e=scanner.nextInt();


        }
        System.out.println(" Thank you for using this program");



    }
}
