public class MakingArrays {
    String[] food = new String [11]; //11 total slots so it will go from [0] to [10]
    public static void main(String[] args) {

        System.out.println("I can't think of my favorite foods because there are so many I enjoy; however, here are some that I am always content with!");
        MakingArrays make = new MakingArrays();

    }



    public MakingArrays(){ //all array values created
        System.out.println("array making in progress");
        System.out.println("some food:");
        food[0] = "french fries, ";
        food[1] = "curry, ";
        food[2] = "aranchini, ";
        food[3] = "veggie dumplings, ";
        food[4] = "spicy tuna handroll, ";
        food[5] = "miso soup, ";
        food[6] = "chili, ";
        food[7] = "pasta alla vodka, ";
        food[8] = "dau miu";
        food[9] = "pan seared tofu, and ";
        food[10] = "yellow curry";
        PrintArray();

    }


public void PrintArray(){

    for (int x=0;x<11;x++){  //this loop makes it more efficent so the line is much shorter
        System.out.println(food[x]);
    }


}




}