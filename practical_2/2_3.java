//NOTE: THIS CODE IS BIT COMPLICATED THAN THE ONE IN LAB MAUNAL.

public class MyClass {
    static int count = 0;
    int id;

    public MyClass() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println("obj1 id: " + obj1.getId());
        System.out.println("obj2 id: " + obj2.getId());
        System.out.println("obj3 id: " + obj3.getId());

        System.out.println("Total objects created: " + MyClass.getCount());
    }
}


//output

// obj1 id: 1
// obj2 id: 2
// obj3 id: 3
// Total objects created: 3