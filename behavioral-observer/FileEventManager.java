import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileEventManager implements EventManager {
    Map<String, List<EventListener>> listenerMap = new HashMap<>();

    public FileEventManager(String... operations) {
        for (String operation : operations) {
            this.listenerMap.put(operation, new ArrayList<>());
            System.out.println("----- Create Event Type: " + operation);
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listenerList = listenerMap.get(eventType);
        listenerList.add(listener);
        System.out.println("----- Subscribed Event Type: " + eventType + " to Listener: " + listener.getClass().getName());
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listenerList = listenerMap.get(eventType);
        listenerList.remove(listener);
        System.out.println("------ Unsubscribed Event Type: " + eventType + " from Listener: " + listener.getClass().getName());
    }

    public void notify(String eventType, String fileName) {
        List<EventListener> listenerList = listenerMap.get(eventType);
        for (EventListener listener : listenerList) {
            listener.execute(eventType, fileName);
            System.out.println("------ Executed Event Type: " + eventType + " of Listener: " + listener.getClass().getName());
        }
    }
}
