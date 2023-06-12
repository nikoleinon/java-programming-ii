public class Book {

    private String title;
    private int age;

    public Book (String title, int age){
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return title + " (recommended for " + this.age + " year-olds or older)";
    }
}
