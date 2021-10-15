import java.util.Random;

public class MethodToTheMadness {

    public static void main(String[] args) {

        String color = randomColor();
        System.out.println(color);

    }

    static String randomColor(){
        String color = "";
        Random rand = new Random();
        int x = rand.nextInt(5);
        switch(x){
            case 0:
                color = "orange";
                break;
            case 1:
                color = "blue";
                break;
            case 2:
                color = "green";
                break;
            case 3:
                color = "yellow";
                break;
            case 4:
                color = "black";
                break;
        }
        return color;
    }

}
