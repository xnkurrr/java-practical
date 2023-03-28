//multilevel inheritance

// Title: 3.2. Write a program to create a class country with a method print() to print the name of the country. Create a class state which inherits country and has a method disp() to print the name of the state. Create a class city which inherits state and has a method show() to print the name of the city. Create an object of city and call the methods print(), disp() and show().

class country {
  String country;

  void print(String country) {
    this.country = country;
    System.out.println(country);
  }
}

class state extends country {
  String state = new String();

  void disp(String state) {
    this.state = state;
    System.out.println(state);
  }
}

class city extends state {
  String city;

  void show(String city) {
    this.city = city;
    System.out.println(city);
  }
}

class Main extends city {
  public static void main(String[] args) {
    Main m = new Main();
    m.print("india");
    m.disp("gujarat");
    m.show("rajkot");

  }
}

// output
// india
// gujarat
// rajkot
