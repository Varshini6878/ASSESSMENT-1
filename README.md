# ASSESSMENT-1
                                                                  SECTION A

1.Explain  JRE, JVM and JDK with examples

Ans: JRE – JAVA RUNTIME ENVIRONMENT, it includes the necessary libraries and components to run the java program but it does  not include compilers.

JVM -JAVA VIRTUAL MACHINE ,it is an essential component of java platform it is a part of JRE that interprets and executes java bytecode.


JDK – JAVA DEVELOPMENT KIT used for developing java applications conatins everything needed to compile ,debug and run the java program including the compiler.


2. Explain all the primitive data types in java

a.Byte
*Primitive Datatype
*Stores 8 bit integer
*Value ranges from -127 to 127
*Used whem you whant to save memory ,especially large arrays.

b.Int
*Represent 32 bit data type
*Commonly used in numeric calculations.


C.Long
*It is used  to store large interger values  than int
*Stores 64 bit integer


D.Float
*Represent number with decimal point


E.Boolean 
*Stores “true” or “false”
*Stores “0” or “1”


F.String
*Stores text  
*Surrounded by “” quotes.








Eg:public class Main{
          public static void main(String [] args) {
                     int myNum = 34;
                     float myFloat = 3.44f;
                     char myLetter = ‘L’;
                     boolean myBool = true;
                     String myText  = “Hello”;
         
       System.out.println(myNum);
       System.out.println(myFloat);
       System.out.println(myLetter);
       System.out.println(myBool);
       System.out.println(myText);

OUTPUT:
34
3.44F
“L”
true
Hello.


3.What are control structures ? Show eg using else andif – else

Answer : Control Structures direct the flow of execution in a program

Eg:  if
    public class main {
              public static void main(String [] args) {
                         int  time = 11;
                        int    y =12;
      if (time <  y)  {
             System .out.println(“ Good morning”);
       }else if  ( x==y) {
              System.out.println(“If x and y are equal”);
      } else {
           System.out.println(“Good afternoon”);



4.What is class and a object ? Expalin with real life analogy
    
Ans Class : It is like a blueprint of an object
        Object : It is an instance of class 
 
A blueprint is used to create a car , with that blueprint many cars and be created and modified
                    


                                                                SECTION -B

1.
int a = 5;
int b = 10;
System.out.println(++a + b++);

Answer  :  In this above code  two integers 5 and 10 are used , pre – increment is introduced and the number a become 6 and post increment is introduced  number first changes and then increments to 11  Output is 16



2.
boolean x=true;
boolean y =false;
System.out.println( x && y || x);


Answer : In this above code  two boolean true and false are used ,  true && false gives false ,false || true gives true. Output is true



3.
for (int i = 1; i <= 2; i++) {
for (int j= 1; j <=i; j++) {
System.out.println(j);
}
System.out.println();

Answer:In this above code if i = 1,j=1 
              i = 1 , j= 1,2  Output is 1 ,12
