
public class Table{
public static void main(String[] args) 
{ 
  int row, column;
  System.out.println("Multiplication Table \n");
  row = 1; // Initialization.
  do {
     column = 1;
     do{
       int x = row * column;
       System.out.printf("%4d", + x);
       column = column + 1;
      }while(column <= 10);
    System.out.println("\n");
    row = row + 1;
  } while(row <= 10);
 }
}
