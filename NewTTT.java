/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Yousef
 */
public class NewTTT {
    
    
    static String[][]table = new String[3][3];
    static int countX;
    static int countO; 
    
    
    public static void checkDiagonalRightToLeft(){

      if((table[0][2]=="X" && table[1][1]=="X") && table[2][0]=="X"){
       countX=3;
   }
      if((table[0][2]=="O" && table[1][1]=="O") && table[2][0]=="O"){
       countO=3;
   }
        
   }
    
    public static void checkDiagonalLeftToRight(){
      if((table[0][0]=="X" && table[1][1]=="X") && table[2][2]=="X"){
       countX=3;
   }
       if((table[0][0]=="O" && table[1][1]=="O") && table[2][2]=="O"){
       countO=3;
   }
        
   }
  
  
   public static void checkVertical(){
     for(int i=0; i<table.length;i++){
    for(int j=0;j<table[0].length;j++){
   if((table[0][j]=="X" && table[1][j]=="X") && table[2][j]=="X"){
       countX=3;
   }
   if((table[0][j]=="O" && table[1][j]=="O") && table[2][j]=="O"){ 
       countO=3;
    }
   
    }
     }
   }

   public static void checkHorizontal(){
   for(int i=0; i<table.length;i++){
   for(int j=0;j<table[0].length;j++){
   if((table[i][0]=="X" && table[i][1]=="X") &&table[i][2]=="X"){
       countX=3;
   }
   if((table[i][0]=="O" && table[i][1]=="O") && table[i][2]=="O"){ 
       countO=3;
    }
 
    }
     }
   } 
    
    public static void main(String[] args) {
    System.out.println("Welcome to TicTacToe Game");
    System.out.println("Please enter a row number and a column number on separate lines to insert your input (row first)");
    System.out.println("Note: Table size is 3 x 3");
    while(countX<3 && countO<3){
    System.out.println("Player 1's turn, you're 'X'");
    Scanner scan = new Scanner(System.in);
   boolean isNumeric = false;
    int entry20 = 0;
    int entry1 = 0;
    int entry30 = 0;
    int entry2 = 0; 
  
   while(!isNumeric){
       try{
         
    entry20 = scan.nextInt();
    entry1 = entry20-1;
    entry30 = scan.nextInt();
    entry2 = entry30-1;
    scan.nextLine();
    isNumeric = true;
    
       }
       catch(InputMismatchException e){
       
       System.out.println("Invalid character found. Please enter numeric values only!");
       scan.nextLine();
           
       }
   }
    
     
     while((entry1 > 2 || entry1 <0) || (entry2 > 2 || entry2<0) ){
     System.out.println("Please enter a value within the range");
     int entry3 = scan.nextInt();
     entry1 = entry3-1;
     int entry4 = scan.nextInt();
     entry2 = entry4-1;
     
  }
     
     while(table[entry1][entry2]=="X" || table[entry1][entry2]=="O"){
     System.out.println("Field is already occupied as " + table[entry1][entry2] + "'");  
     int entry5 = scan.nextInt();
     entry1 = entry5-1;
     int entry6 = scan.nextInt();
     entry2 = entry6-1;
     while((entry1 > 2 || entry1 <0) || (entry2 > 2 || entry2<0) ){
     System.out.println("Please enter a value within the range");
     int entry3 = scan.nextInt();
     entry1 = entry3-1;
     int entry4 = scan.nextInt();
     entry2 = entry4-1;
     }
    }
    table[entry1][entry2]="X";
    
     checkDiagonalRightToLeft();  
     checkDiagonalLeftToRight();
     checkVertical();   
     checkHorizontal();
    
    for(int i=0; i<table.length;i++){
    for(int j=0;j<table[0].length;j++){
    if(table[i][j]==null){
        table[i][j]= "-";
        
    }
    System.out.print(table[i][j] + " ");
    }
    System.out.println();
    }
     
    if(countX==3){
    scan.close();
    break;
    }
    System.out.println("Player 2's turn, you're 'O'");
    
    boolean isNumeric2 = false;
    
    int entry40 = 0;
    int entry7 = 0;
    int entry50 = 0;
    int entry8 = 0;
    
    while(!isNumeric2){
    try{
    entry40 = scan.nextInt();
    entry7 = entry40-1;
    entry50 = scan.nextInt();
    entry8 = entry50-1;
   scan.nextLine();
   isNumeric2 = true;
   
    } catch(InputMismatchException e) {
        System.out.println("Invalid character found. Please enter numeric values only!");
     scan.nextLine();
  }
    
 }
    
    while((entry7 > 2 || entry7<0 ) || (entry8 > 2 || entry8<0 )){
     System.out.println("Please enter a value within the range");
     int entry9 = scan.nextInt();
     entry7 = entry9-1;
     int entry10 = scan.nextInt();
     entry8 = entry10-1;
     }
    
    while(table[entry7][entry8]=="X" || table[entry7][entry8]=="O"){                 
        System.out.println("Field is already occupied as '" + table[entry7][entry8] + "'");
     int entry11 = scan.nextInt();
     entry7 = entry11-1;
     int entry12 = scan.nextInt();
     entry8 = entry12-1;
     while((entry7 > 2 || entry7<0 ) || (entry8 > 2 || entry8<0 )){
     System.out.println("Please enter a value within the range");
     int entry9 = scan.nextInt();
     entry7 = entry9-1;
     int entry10 = scan.nextInt();
     entry8 = entry10-1;
     }
     
    }
    
    
    
     table[entry7][entry8]="O";
     checkDiagonalRightToLeft();  
     checkDiagonalLeftToRight();
     checkVertical();
     checkHorizontal();
    
      for(int i=0; i<table.length;i++){
    for(int j=0;j<table[0].length;j++){
    if(table[i][j]==null){
        table[i][j]= "-";
        
    }
    System.out.print(table[i][j] + " ");
    }
    System.out.println();
    }
     
    }
    
    System.out.println("You Win ");
    System.out.println("");
    
   
  }
}
