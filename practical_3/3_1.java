// this program is to show the use of inheritance, single level inheritance.

class vehical {
  void type() {
    System.out.println("vehicle type is 4 wheeler");
  }
}

class Main extends vehical {
  void carType() {
    System.out.println("luxury");
    ;
  }

  public static void main(String[] args) {
    Main c = new Main();
    c.type();
    c.carType();
  }
}

// output
// vehicle type is 4 wheeler
// luxury
