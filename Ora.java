public class Ora {
    public int firsRowOfHours(int multipleHours){
        if(multipleHours /5 ==1)
        {
            System.out.println("O");
        }
        else
        if(multipleHours /5 ==2)

        {
            System.out.println("OO");
        }
        else
        if(multipleHours /5 ==3) {
            System.out.println("OOO");
        }
        else System.out.println("OOOO");

        return multipleHours;
    }
}
