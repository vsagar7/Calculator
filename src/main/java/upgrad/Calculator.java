package upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    //field based Ingestion
    //@Autowired
    //MathService mathService;
    AdditionService additionService;
    SubtractionService subtractionService;
    MultiplicationService multiplicationService;
    DivisionService divisionService;
    
    //Setter based Ingestion
//    @Autowired
//    public void setAdditionService(AdditionService additionService){
//            this.additionService=additionService;
//    }


    //Constructor based Ingestion
//    @Autowired
//    public Calculator(MathService additionService, MathService subtractionService){
//        this.mathService=subtractionService;
//        this.mathService=additionService;
//
//    }

    @Autowired
    public Calculator(@Qualifier("additionService")  MathService additionService,@Qualifier("subtractionService") MathService subtractionService,
                      @Qualifier("multiplicationService")  MathService multiplicationService,@Qualifier("divisionService")MathService divisionService){
        this.additionService= (AdditionService) additionService;
        this.subtractionService= (SubtractionService) subtractionService;
        this.multiplicationService= (MultiplicationService) multiplicationService;
        this.divisionService= (DivisionService) divisionService;

    }

//    @Autowired
//    public Calculator(@Qualifier("additionService") MathService additionService,@Qualifier("subtractionService") MathService subtractionService,
//                      @Qualifier("multiplicationService") MathService multiplicationService,@Qualifier("divisionService") MathService divisionService){
//        this.mathService=additionService;
//        this.mathService=subtractionService;
//        this.mathService=multiplicationService;
//        this.mathService=divisionService;
//    }

    public void compute(String operation,int x,int y) throws Exception {
        //if(operation.equalsIgnoreCase("+")||operation.equalsIgnoreCase("-")||
          //      operation.equalsIgnoreCase("*") ||operation.equalsIgnoreCase("/"))
        switch (operation){
            case "+": additionService.operate(x,y);break;
            case "-": subtractionService.operate(x,y);break;
            case "/": multiplicationService.operate(x,y);break;
            case "*": divisionService.operate(x,y);break;
            default: throw new Exception();
        }
    }
}
