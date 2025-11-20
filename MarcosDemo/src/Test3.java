public class Test3 {
    public static void main(String[] args) {
//        define 5 variables , 1st one repsent your age, 2nd one represent your height, 3nd one repsent your Java score , 4th -> Math score, 5th -> History score.
        //type variableName = value;

        //this is single line comment
        /*
        this is multi-line comment
        line1
        line2
        line3
        */

        int age = 33;
        int height = 167;   //I'm 167 cm
        int javaScore = 89;
        double mathScore = 88.5;
        int historyScore = 70;

        //1.println = print a line
//        System.out.println("the age is ");
//        System.out.println(age);
//        System.out.println("the height is ");
//        System.out.println(height);
        //2.print = print without changing line
//        System.out.print("the age is ");
//        System.out.print(age);
//        System.out.print(",the height is ");
//        System.out.print(height);
//        System.out.print(",the java score is ");
//        System.out.print(javaScore);
        //3.printf = print with a certain format
//        System.out.printf("a content with format",variable1,variable2,variable3);
        //placeholder
        //%d    ->      it holds a place for an int value
        System.out.printf("the age is %d,the height is %d,and Java score is %d,the Math score is %.1f",age,height,javaScore,mathScore);

    }
}
