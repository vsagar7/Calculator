package upgrad;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService{
    @Override
    public void operate(int x, int y) {
        System.out.println("The Sum is :" + (x+y) );
    }
}
