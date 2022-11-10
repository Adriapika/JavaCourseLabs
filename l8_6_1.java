package task6_1;

public class l8_6_1 {
    public static void main(String[] args){
        Flower[] flowers = {new Rose(2, "red", 90, "07.11.2022"),
                new Rose(4, "yellow", 4, "01.1.2022"),
                new Daisy(6, "white", 5, "05.10.2022"),
                new Lily(2, "orange", 2, "04.9.2022")};

        Bouquet bouquet = new Bouquet(flowers);
        bouquet.sort_by_date();

        System.out.println("Bouquet sorted by condition:\n" + bouquet);
        System.out.println("Flower with length 13-16:\n" + bouquet.get_by_length(13, 16));
    }
}