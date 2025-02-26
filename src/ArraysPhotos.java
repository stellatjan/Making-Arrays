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
    }
}

