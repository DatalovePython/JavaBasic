/**
 * @author luzc
 * @date 2020/6/10 9:54
 * @desc
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        // ��ȡpublic�ֶ�"score":
        System.out.println(stdClass.getField("score"));
        // ��ȡ�̳е�public�ֶ�"name":
        System.out.println(stdClass.getField("name"));
        // ��ȡprivate�ֶ�"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Student extends Person2 {
    public int score;
    private int grade;
}

class Person2 {
    public String name;
}