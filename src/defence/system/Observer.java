package defence.system;

public interface Observer {

    void chat(String text, String name);

    void clearArea(Boolean checked);

    void warPosition(double level);

    void sentInfo(String diffence, Helicopter hc, Tank tk, Submarine sm);

    void requestInfo(String diffence, Boolean pm);
}
