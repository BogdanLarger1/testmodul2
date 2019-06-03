public class Ora2 {

    public int secondRowOfHours(int multipleHours){
        if(multipleHours %5 ==1)
        {
            System.out.println("o");
        }
        else
        if(multipleHours %5 ==2)

        {
            System.out.println("oo");
        }
        else
        if(multipleHours %5 ==3) {
            System.out.println("ooo");
        }
        else System.out.println("oooo");

        return multipleHours;
    }

}
