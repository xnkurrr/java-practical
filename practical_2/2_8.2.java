// Title: Method Overriding

class car {
    void color() {
      System.out.println("color is black.");
    }
  }
  
  class toyota extends car {
    void color() {
      System.out.println("toyota");
    }
  
    public static void main(String[] ankur) {
      toyota t = new toyota();
      t.color();
    }
  }

  //output
    // toyota
    