import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("myCat", Cat.class);
        Cat cat2 = applicationContext.getBean("myCat", Cat.class);
        cat2.setName("Fluffy");

        System.out.println("Переменные bean1 и bean2 ссылаются на один и тот же объект: " + (bean1 == bean2));
        System.out.println("Переменные cat1 и cat2 ссылаются на один и тот же объект: " + (cat1 == cat2));

        System.out.println(bean1.getMessage());
        System.out.println("My cat's name is " + cat1.getName());
        System.out.println("My other cat's name is " + cat2.getName());
    }
}