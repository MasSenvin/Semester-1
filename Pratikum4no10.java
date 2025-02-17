public class Pratikum4no10 {
    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
        //(false && true == false)berlaku sebaliknya, dan yang dikurung dikerjakan terlebih dahulu
        if( !a || ( b && c ) )
        {
            System.out.println("If executed");
        }
        else//keadaan kalo tidak memenuhi yang atas 
        {
            System.out.println("else executed");
        }

    }
}
