package ua.kogutenko.project_1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Starting project 1
 *
 * @author Kogutenko Alex
 */
class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "project_1/applicationContext.xml"
        );
        TestBean tb1 = context.getBean("testBean", TestBean.class);

        System.out.println(tb1.getName());

        context.close();
    }
}
