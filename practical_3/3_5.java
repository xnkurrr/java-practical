//this program is to demonstrate the use of interface in java

interface shape {
    public void area();

    public void radius();
}

class circle implements shape {
    public void area() {
        System.out.println("area method");
    }

    public void radius() {
        System.out.println("radius method");
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.area();
        c.radius();
    }
}

// output
// area method
// radius method
