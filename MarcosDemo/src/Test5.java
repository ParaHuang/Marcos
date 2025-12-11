public class Test5 {
    public static void main(String[] args) {
        int age = 90;
        double height = 1.67;
        //when you want to print some normal content, you need ""    (""   quotation,quote)
        System.out.println("whatever content you want");
        //when you want to print the value of a variable,you need to write variable name directly, NO ""
        System.out.println(age);
        //print a line of content
        System.out.println("this is a new line");

        //print with format
        System.out.printf("my age is %d\n",age);
        System.out.printf("my height is %f\n",height);
        System.out.printf("my height is %.2f",height);

        //      \n   new line
    }
}
