package fr2922.se201.jchess.events.utils;

import fr2922.se201.jchess.events.GameEvent;

import java.util.*;

public class EventBus {

    private static final Map<Class<? extends GameEvent>, List<EventListener>> callbacks = new  HashMap<>();

    private static boolean posting= false;

    public static void print(){
        callbacks.keySet().forEach(key -> {
            System.out.print("Key " + key + " => ");
            callbacks.get(key).forEach(value -> System.out.print(value.toString() + " "));
            System.out.println();
        });
    }



    public static<T extends GameEvent> void onEvent(Class<T> clazz, EventListener<T> callback){
        if(callbacks.get(clazz) != null){
            callbacks.get(clazz).add(callback);
            return;
        }
        callbacks.put(clazz, new ArrayList<>());
        callbacks.get(clazz).add(callback);
    }


    public static void post(GameEvent event){
        callbacks.get(event.getClass()).forEach((cb) -> cb.handle(event));
    }



    @SuppressWarnings("unchecked")
    private static  <T extends GameEvent>void dispatch(T event){
        System.out.println("Calling " + callbacks.get(event.getClass()).size() + " callbacks");

    }

}
