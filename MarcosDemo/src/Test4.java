public class Test4 {
    public static void main(String[] args) {
        //int type can represent 2^32 numbers
        //half of those are positive(0~2147483647), half is negative(-2147483648~-1)
        //limit of int is     -2147483648 ~  2147483647
        //what's the maximum positive int number?    2147483647
        //what's the minimun negative int number?    -2147483648
        int a = -2147483648;
        long b = 92389283298379l;       //l  is telling java  to take this number as long,not as int
        double c = 3.14;

    }
}
//when we run java, steps are
//1.we write code
//2.java compiler translate java file into class file(byte file,computer only understand binary)
//3.run this class file


//decimalismo           binário
//0                     0
//1                     1
//2                     10
//3                     11
//4                     100
//5                     101
//6