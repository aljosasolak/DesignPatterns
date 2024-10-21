package com.aljosasolak.state.abuse;

public class StoppedState implements State{
   private final Stopwatch STOPWATCH;

    public StoppedState(Stopwatch stopwatch) {
        this.STOPWATCH = stopwatch;
    }

    @Override
    public void click() {
        STOPWATCH.setCurrentState(new RunningState(STOPWATCH));
        System.out.println("The stopwatch is stopped");
    }
}
