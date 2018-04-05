package fr2922.se201.jchess.events;

public class GameEndedEvent implements GameEvent {

    private String result;

    private GameEndedEvent(String result){
        this.result = result;
    }

    public static GameEndedEvent of(String result){
        return new GameEndedEvent(result);
    }

    public String getResult() {
        return result;
    }



}
