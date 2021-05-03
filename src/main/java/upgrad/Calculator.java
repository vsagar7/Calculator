package upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    //field based Ingestion
    //@Autowired
    AdditionService additionService;
    
    //Setter based Ingestion
//    @Autowired
//    public void setAdditionService(AdditionService additionService){
//            this.additionService=additionService;
//    }


    //Constructor based Ingestion
    @Autowired
    public Calculator(AdditionService additionService){
        this.additionService=additionService;
    }

    public void compute(String operation,int x,int y) throws Exception {
        //if(operation.equalsIgnoreCase("+")||operation.equalsIgnoreCase("-")||
          //      operation.equalsIgnoreCase("*") ||operation.equalsIgnoreCase("/"))
        switch (operation){
            case "+":additionService.operate(x,y);break;
            default: throw new Exception();
        }
    }
}
