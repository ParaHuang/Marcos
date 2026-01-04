public class Test9_String {
    public static void main(String[] args) {
        //int       ->  data type for integer number, there are also short,long
        // short,int,long they are all for defining integer number, bur their range is different

        //double    ->  data type for decimal number, there is also float

        //boolean   ->  data type to represent yes/no, values are true or false


        short x = 32767;       //short can only save 65536(2^16) numbers(-32768~-1, 0~32767)
        int y = 3276700;       //int can only save 2^32 numbers
        long z = 3276700;       //long can only save 2^64 numbers
       // 2*2*2*2 = 16    ->      2^4=16

        double a = 3.14;

        boolean b = false;

        //String = a lot of characters
        //character:   'a' 'b' 'w' '9' '7' '.' '@' '#' '~'
        String c = "Marcos";        //'M'  'a'  'r'  'c'  'o'  's'
    }
}
