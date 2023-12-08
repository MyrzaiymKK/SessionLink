public class Student  {
    String name;
    String group;
    int mark;

    public Student(String name, String group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }


}
