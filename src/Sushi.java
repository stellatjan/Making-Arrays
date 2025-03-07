public class Sushi {

    // Variables: name, type, price, number of pieces, contains soy
    String name;
    String style;
    double price;
    int numberOfPieces;
    boolean containsSoy;


    // Constructor for Pstyle
    public Sushi(String Pstyle) {
        name = "Spicy tuna handroll";
        style = Pstyle;
        price = 12.99;
        numberOfPieces = 8;
        containsSoy = true;
        displaySushiInfo();
    }

    //i dont know how to impletment these and the name does not work

//    // Constructor for name only
//    public Sushi(String Pname) {
//        name = Pname;
//        style = "Handroll";  // default style
//        price = 12.99;  // default price
//        numberOfPieces = 8;  // default pieces
//        containsSoy = true;  // default soy
//        displaySushiInfo();
//    }
//
//    // Constructor for # pieces only
//    public Sushi(int PnumberOfPieces) {
//        name = "Spicy tuna handroll";  // default name
//        style = "Handroll";  // default style
//        price = 12.99;  // default price
//        numberOfPieces = PnumberOfPieces;
//        containsSoy = true;  // default soy
//        displaySushiInfo();
//    }
//
//
//    //constructor for price only
//    public Sushi(double Pprice) {
//        name = "Spicy tuna handroll";  // default name
//        style = "Handroll";  // default style
//        price = Pprice;
//        numberOfPieces = 8;  // default pieces
//        containsSoy = true;  // default soy
//        displaySushiInfo();
//    }
//
//    // Constructor for containsSoy only
//    public Sushi(boolean PcontainsSoy) {
//        name = "Spicy tuna handroll";  // default name
//        style = "Handroll";  // default style
//        price = 12.99;  // default price
//        numberOfPieces = 8;  // default pieces
//        containsSoy = PcontainsSoy;
//        displaySushiInfo();
//    }




//To display the information of the sushi
    public void displaySushiInfo() {
        System.out.println("Name: " + name + "" +
                "");
        System.out.println("Style: " + style + "" +
                "");
        System.out.println("Price: $" + price + "" +
                "");
        System.out.println("Number of pieces: " + numberOfPieces + "" +
                "");
        System.out.println("Contains soy: " + containsSoy + "" +
                "");
    }

}
