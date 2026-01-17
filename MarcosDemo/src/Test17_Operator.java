public class Test17_Operator {
    public static void main(String[] args) {
        //&& : and
        //what does "you and me go to school,to get table back" mean?
        //A.you go to school
        //B.I go to school
        //C.neither of us go to school
        //D.both of us go to school         ✅

//                      you go to school                      I go to school            get table back?
        System.out.println(true                 &&                  true);              //true
        System.out.println(false                 &&                  true);             //false
        System.out.println(true                 &&                  false);             //false
        System.out.println(false                 &&                  false);            //false

    }
}
