class parent {
    String name;
    int age;

    parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class chillld extends parent {
    int address;

    chillld(String name, int age, int i) {
        super(name, age); // Call parent class constructor
        this.address = i;
    }

    void show() {
        System.out.println("Address: " + address);
    }
}

public class superkey {
    public static void main(String[] args) {
        String name = "chitti"; // Provide a valid name
        int age = 12; // Provide a valid age

        parent p1 = new parent(name, age);
        p1.disp();

        chillld c1 = new chillld(name, age, 12); // Provide the third argument (address)
        c1.show();
    }
}