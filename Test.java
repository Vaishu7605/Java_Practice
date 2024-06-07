
class Demo {

    int a = 10;
    String b = "Vaishu";

    void Show() {
        System.out.println(a + " " + b);
    }
}

class Test {

    public static void main(String[] args) {
        Demo r = new Demo();
        r.Show();
    }
}
