package upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("upgrad");
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");

        calculator.compute("+",3,5);
        calculator.compute("-",3,5);
        calculator.compute("*",3,5);
        calculator.compute("/",3,5);

        //calculator.compute("%",3,5);


    }
}

