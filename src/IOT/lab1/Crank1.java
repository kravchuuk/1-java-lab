package IOT.lab1;

public record Crank1(int maxLiftingWeight, String producer, String colour, int mass, int priceInUah, String size, String typeOfCrank) {
    public static  String someStaticField = "1010";


    public Crank1(int maxLiftingWeight, String producer, String colour) {
        this(maxLiftingWeight, producer, colour, 0, 0, null, null);
    }

    public Crank1() {
        this(0, "", "");
    }



    public static String getSomeStaticField(){
        return someStaticField;
    }

    @Override
    public String toString() {
        return "Crank1{" +
                "maxLiftingWeight=" + maxLiftingWeight +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", mass=" + mass +
                ", priceInUah=" + priceInUah +
                ", size='" + size + '\'' +
                ", typeOfCrank='" + typeOfCrank + '\'' +
                '}';
    }
}