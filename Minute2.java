public class Minute2 {
    public int secondRowOfMinutes(int multipleMinutes){
        if(multipleMinutes %2 ==1)
        {
            System.out.println("m");
        }
        else
        if(multipleMinutes %3 ==2)

        {
            System.out.println("mm");
        }
        else
        if(multipleMinutes %5 ==3) {
            System.out.println("mmm");
        }
        else System.out.println("mmmm");

        return multipleMinutes;
    }

}
