import ca.tecreations.FindImports;
import ca.tecreations.ProjectPath;
/**
 *
 * @author Tim
 */
public class RunFindImports {


    public static void main(String[] args) {
        ProjectPath.setProjectDir("spring-cloud-config-consumer");
        FindImports.launch();
    }
    
}
