package school.mjc.stage0.conditions.task1;

public class PositiveNumberDetermainer {  //5
    public void isPositive(int numberToBeDetermined) {
        if(numberToBeDetermined>0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        PositiveNumberDetermainer positiveNumberDetermainer = new PositiveNumberDetermainer();
        positiveNumberDetermainer.isPositive(5);
    }
}
