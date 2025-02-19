public class MakingArrays {
    String[] food = new String [6];
    public static void main(String[] args) {

        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();




    }



    public MakingArrays(){
        System.out.println("array making in progress");
        System.out.println("some food:");
        food[0] = "lasagna, ";
        food[1] = "curry, ";
        food[2] = "aranchini, ";
        food[3] = "veggie dumplings, ";
        food[4] = "spicy tuna handroll, and ";
        food[5] = "miso soup.";
        PrintArray();


//change

    }


public void PrintArray(){
    System.out.println(food[0] + food[1] + food[2] + food[3] + food[4] + food[5]);


}


}