package fr2922.se201.jchess.events;

/**
 * GameEvent interface
 */
public interface GameEvent {

    default String getEventName(){
        return getClass().getSimpleName();
    }


}
