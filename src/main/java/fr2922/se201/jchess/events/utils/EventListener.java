package fr2922.se201.jchess.events.utils;

import fr2922.se201.jchess.events.GameEvent;

/**
 * EventListener interface
 * @param <T> - accepts only subtypes of GameEvent
 */
@FunctionalInterface
public interface EventListener<T extends GameEvent> {

    /**
     * Handle specific event
     * @param event
     */
    void handle(T event);

}
