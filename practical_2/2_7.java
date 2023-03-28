//this program is to demonstrate the use of abstract class.


abstract class demo
  {
    abstract void show();
    void disp(){
      System.out.println("disp function");
    }
  }
class Main extends demo{
  public void show(){
    System.out.println("show function");
  }
  public static void main(String[] args) {
  Main m= new Main();
  m.show();
  m.disp();
  }
}

//output
// show function
// disp function
