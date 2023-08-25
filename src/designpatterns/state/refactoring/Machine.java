package designpatterns.state.refactoring;

public class Machine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    private int count = 0;

    public Machine(int numberBalls) {
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count > 0) {
            count = count - 1;
        }
    }
}
