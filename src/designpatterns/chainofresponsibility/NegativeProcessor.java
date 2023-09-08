package designpatterns.chainofresponsibility;

/**
 * @author jev
 * @version 1.0
 * @since 2023-09-08
 */
public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(RequestNumber request) {
        if(request.number() < 0) {
            System.out.println("NegativeProcessor : " + request.number());
        }
        else {
            
        }
    }
}
