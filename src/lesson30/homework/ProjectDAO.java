package lesson30.homework;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 21.07.2018.
 */
public class ProjectDAO {
    private Set<Project> projects = new TreeSet<>();

    public ProjectDAO(Set<Project> projects) {
        this.projects = projects;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "ProjectDAO{" +
                "projects=" + projects +
                '}';
    }
}
