public class Box <T>{
    public Box() {
    }

    @Override
    public String toString() {
        return "Box{}";
    }

    public static <T> T getBox(T box){
        return box;
    }
}
