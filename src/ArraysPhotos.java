import com.sun.source.tree.ArrayAccessTree;

public class ArraysPhotos {
    public static void main(String[] args) {
        ArraysPhotos ArraysPhotos = new ArraysPhotos();

    }
Sushi[] Sushi = new Sushi [10];

    //constructor
    public ArraysPhotos(){
        System.out.println("making arrays with photos!");

        Sushi spicytunahandroll = new Sushi("handroll");
        Sushi[0] = spicytunahandroll;
        Sushi[0].displaySushiInfo();

        Sushi sakesashimi = new Sushi("sashimi");
        Sushi[1] = sakesashimi;
        Sushi[1].displaySushiInfo();

        Sushi salmonavocadoroll = new Sushi("makimono");
        Sushi[2] = salmonavocadoroll;
        Sushi[2].displaySushiInfo();

        Sushi unagi = new Sushi("nigiri");
        Sushi[3] = unagi;
        Sushi[3].displaySushiInfo();

        Sushi misosoup = new Sushi("soup, appetizer");
        Sushi[4] = misosoup;
        Sushi[4].displaySushiInfo();

        Sushi shishitopeppers = new Sushi("small dish, appetizer");
        Sushi[5] = shishitopeppers;
        Sushi[5].displaySushiInfo();

        Sushi salmonnigiri = new Sushi("nigiri");
        Sushi[6] = salmonnigiri;
        Sushi[6].displaySushiInfo();

        Sushi izakayatuna = new Sushi("crispy rice with tuna");
        Sushi[7] = izakayatuna;
        Sushi[7].displaySushiInfo();

        Sushi hamachikama = new Sushi("girlled yellowtail with lemon, main dish");
        Sushi[8]= hamachikama;
        Sushi[8].displaySushiInfo();

        Sushi chefschoice = new Sushi("Chef's choice of sashimi and nigiri");
        Sushi[9]=chefschoice;
        Sushi[9].displaySushiInfo();

//        for(int x;x<10;x=x++) { you can do [x] and sushi[x] = new Sushi(peram) then do sushi.print info

    PrintArray();
    ChangePieceCount();
    TotalSushiOrder();

    }

    public void PrintArray(){
        for(int x=0;x<10;x++){
         Sushi[x].displaySushiInfo();

        }
    }

    public void ChangePieceCount() {
        for (int x = 0; x < Sushi.length; x++) {
            Sushi[x].numberOfPieces = (int) (Math.random() * 10) + 10; // Set a random piece count between 10 and 19
        }

        // Print the updated piece count for each sushi item
        System.out.println("Piece count for each sushi item:");
        for (int x = 0; x < Sushi.length; x++) {
            System.out.println("Sushi item " + (x+1) + ": " + Sushi[x].numberOfPieces + " pieces");
        }
    }


    public void TotalSushiOrder(){
        int totalPieces = 0; // Variable to store the total number of sushi pieces
        for (int x = 0; x < Sushi.length; x++) {
            totalPieces += Sushi[x].numberOfPieces; //+= variable = variable + value

        }
        System.out.println("Total number of sushi pieces: " + totalPieces);
    }
    }


