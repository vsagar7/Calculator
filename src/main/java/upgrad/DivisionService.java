package upgrad;

import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService{
    @Override
    public void operate(int x, int y) {
        if(y==0){
            try {
                throw new ArithmeticException();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The Division is :" + (x/y) );
    }
}
