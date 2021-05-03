package upgrad;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService{
    @Override
    public void operate(int x, int y) {
        System.out.println("The Multiplication is :" + (x*y) );
    }
}
