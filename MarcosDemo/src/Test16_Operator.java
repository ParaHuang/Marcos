public class Test16_Operator {
    public static void main(String[] args) {
        //and       both need be correct, then the final result is correct

        //Marcos:    if it's quite, and I finished my work, then I go to sleep

        //1:  it's quite outside, you finished all work, do you go to sleep?              yes
        //2:  your neighbor is screaming, you finished all work, do you go to sleep?     no
        //3:  it's quite outside, you didn't finish work, do you go to sleep?               no
        //4:   your neighbor is screaming, you didn't finish work, do you go to sleep?     no

        System.out.println(true && true);       //true
        System.out.println(true && false);      //false
        System.out.println(false && true);      //false
        System.out.println(false && false);     //false

        //or:   anyone is true, then final result is true
        System.out.println(true || true);       //true
        System.out.println(true || false);      //true
        System.out.println(false || true);      //true
        System.out.println(false || false);     //false

    }
}
