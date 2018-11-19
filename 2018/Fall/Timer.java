public class Timer {
    public static void main (String[] args) {
        
        try {
        
            System.out.println("start");
            
            Thread.sleep(3000);
            
            System.out.println("end");
        
        } catch (Exception e) {
            
            System.out.println("ERROR: " + e);
        }
        
    }
}
