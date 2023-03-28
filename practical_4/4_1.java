//this program is to show the use of try and catch block

class Main {
    public static void main(String[] args) {
      try{
        int a = 15/0;
      }
      catch(ArithmeticException e){
      System.out.println(e);
      }
    }
  }

  // output
    // java.lang.ArithmeticException: / by zero
