import ca.tecreations.BuildProject;
import ca.tecreations.ProjectPath;
/**
 *
 * @author Tim
 */
public class RunBuildProject {
    
    public static void main(String[] args) {
        ProjectPath.setProjectDir("microservices.007.profile-service");
        new BuildProject(ProjectPath.getProjectPath(),true);
    }
}
