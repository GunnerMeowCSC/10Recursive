public class 10Recursive {
    public static void main(String[] args) {
        printMessage(0, 10);
    }
    
    public static void printMessage(int current, int limit) {
        if (current >= limit) {
            return;
        }
        
        System.out.println("الله يعين");
        
        printMessage(current + 1, limit);
    }
}