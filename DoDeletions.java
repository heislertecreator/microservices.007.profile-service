import java.io.File;
/**
 *
 * @author Tim
 */
public class DoDeletions {

    public static void main(String[] args) {
        String jarsPath = "C:\\Users\\Tim\\Documents\\microservices.007.profile-service\\jars\\";
        File logback = new File(jarsPath + "logback-classic-1.2.10.jar");
        logback.delete();
        System.out.println("Logback: Exists: " + logback.exists());
        
        File slf4j158 = new File(jarsPath + "slf4j-api-1.5.8.jar");
        slf4j158.delete();
        System.out.println("slf4j158: Exists: " + slf4j158.exists());
        
        File slf4j1725 = new File(jarsPath + "slf4j-api-1.7.25.jar");
        slf4j1725.delete();
        System.out.println("slf4j1725: Exists: " + slf4j1725.exists());
        
        File slf4j1729 = new File(jarsPath + "slf4j-api-1.7.29.jar");
        slf4j1729.delete();
        System.out.println("slf4j1729: Exists: " + slf4j1729.exists());
        
        File slf4j1730 = new File(jarsPath + "slf4j-api-1.7.30.jar");
        slf4j1730.delete();
        System.out.println("slf4j1730: Exists: " + slf4j1730.exists());
        
        File slf4j1732 = new File(jarsPath + "slf4j-api-1.7.32.jar");
        slf4j1732.delete();
        System.out.println("slf4j1732: Exists: " + slf4j1732.exists());
        
        File slf4j1736 = new File(jarsPath + "slf4j-api-1.7.36.jar");
        slf4j1736.delete();
        System.out.println("slf4j1736: Exists: " + slf4j1736.exists());
    }
}
