interface I{
    void m();
}

public class Lambda1 {
    public static void main(String[] args) {
        I i = new I(){
            public void m(){
                System.out.println("I::m()");
            }
        };
        i.m(); //i::m()

        // Java 8 - Lambda Expression
        I lambda = ()->{
            System.out.println("Lambda version 1");
        };
        I lambda1 = ()-> System.out.println("Lambda version 2");

        lambda.m();
        lambda1.m();
    }
}