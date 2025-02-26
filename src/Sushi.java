public class Sushi {

    // Variables: name, type, price, number of pieces, contains soy
    String name;
    String style;
    double price;
    int numberOfPieces;
    boolean containsSoy;

    // Constructor
    public Sushi(String Pstyle) {
        name = "Spicy tuna handroll";
        style = Pstyle;
        price = 12.99;
        numberOfPieces = 8;
        containsSoy = true;
        displaySushiInfo();
    }

//To display the information of the sushi
    public void displaySushiInfo() {
        System.out.println("Name: " + name);
        System.out.println("Style: " + style);
        System.out.println("Price: $" + price);
        System.out.println("Number of pieces: " + numberOfPieces);
        System.out.println("Contains soy: " + containsSoy);
    }

}
