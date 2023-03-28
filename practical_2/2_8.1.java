// Title: Overloading

class Main {
    void result()
    {
      System.out.println("no argument func.");
    }
    void result(int a)
    {
      System.out.println("1 argument func.");
    }
    int result(int a,int b)
    {
      return a+b;
    }
    public static void main(String[] args) {
      Main m= new Main();
      m.result();
      m.result(2);
      
      System.out.println(m.result(15,19));
      
    }
  }

  //output  
    // no argument func.
    // 1 argument func.
    // 34
    