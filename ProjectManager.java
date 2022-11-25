package QA;

public class ProjectManager extends Employee {
    private String[] listOfProjects = new String[5];


    public ProjectManager(String name, double Zarplata) {
        this.setName(name);
        this.setZarplata(Zarplata);
        this.setDoljnost("Manager");
    }

    public String[] getListOfProjects() {
        return listOfProjects;
    }

    public void setListOfProjects(String[] listOfProjects) {
        this.listOfProjects = listOfProjects;
    }
    public boolean addProject(String name) {
        for(int i=0;i<listOfProjects.length;i++) {
            if(listOfProjects[i]==null) {
                listOfProjects[i]=name;
                System.out.println("Вы добавили проект в список!");
                return true;
            }
        } return false;
    }
    public void projectsInfo() {
        System.out.println("Список проектов:");
        for(int i=0;i<listOfProjects.length;i++) {
            if(listOfProjects[i]!=null) {
                System.out.println((i+1)+") "+listOfProjects[i]);
            }else {
                return;
            }
        }
    }
    public void managerInfo() {
        System.out.println(this);
        this.projectsInfo();
    }
}
