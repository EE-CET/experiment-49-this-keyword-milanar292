import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value;   // using this to refer to instance variable
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        ThisDemo obj = new ThisDemo();
        obj.setValue(input);
        obj.display();
    }
}
