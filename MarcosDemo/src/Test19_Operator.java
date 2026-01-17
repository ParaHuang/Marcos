public class Test19_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 23;
        System.out.println(a<b && b<=c);        //a<b:true      b<=c:true       ->      true && true    ->  true
        System.out.println(c%2>0 && b%2!=0);    //c%2>0:true    b%2!=0:false    ->      true && false   ->  false
        System.out.println(b%2==0 || b/2==0);   //b%2==0:true   b/2==0:false    ->      true || false   ->  true

        System.out.println(a + b > c && a * 2 < c);     //a+b>c:false       a*2<c:true      ->  false && true   ->  false
        System.out.println(c % a == 0 || b % a == 0);   //c%a==0:false      b%a==0:false    ->  false || false  ->  false
        System.out.println(a == b && c > a + b);        //a==b:false        c>a+b:true      ->  false && true   ->  false

        System.out.println(b / a + c % a);              //b/a:1     c%a:3   1+3->4
        System.out.println(a < b && b < c && c > 20);   //a<b:true  b<c:true    c>20:true   ->  true && true && true    ->  true
        System.out.println(c % 2 == 0 && b % 2 == 0 || a % 2 == 0);
        //c % 2 == 0 : false
        //b % 2 == 0 : true
        //a % 2 == 0 :true
        //false && true || true ->  false || true   ->  true
        //priority:     &&  >  ||

        System.out.println(true || true && false);  //true&&false:false     true||false:true
        System.out.println((true || true) && false); //false

        System.out.println(1+2*3);      //7
        System.out.println((1+2)*3);    //9
    }
}
