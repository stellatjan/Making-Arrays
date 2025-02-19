public class MakingArrays {
    String[] food = new String [10];
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
        food[4] = "spicy tuna handroll, ";
        food[5] = "miso soup, ";
        food[6] = "chili, ";
        food[7] = "pasta alla vodka, ";
        food[8] = "dau miu, and ";
        food[9] = "pan seared tofu";
        PrintArray();




    }


public void PrintArray(){
    System.out.println(food[0] + food[1] + food[2] + food[3] + food[4] + food[5] + food[6] + food[7] +food[8] +food[9]);


}


}