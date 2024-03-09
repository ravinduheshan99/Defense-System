package defence.system;

public class Observable {

    private Observer[] ob = new Observer[0];

    private static Observable instance = null;

    private Observable() {

    }

    private String message;
    private String name;

    private void extendArray() {
        Observer[] temp = new Observer[ob.length + 1];
        for (int i = 0; i < ob.length; i++) {
            temp[i] = ob[i];
        }
        ob = temp;
    }

    public void addComp(Observer comp) {
        extendArray();
        ob[ob.length - 1] = comp;
    }

    public void getMessage(String message, String name) {
        this.message = message;
        this.name = name;
        notifyMessage();
    }

    public void notifyMessage() {
        for (int i = 0; i < ob.length; i++) {
            ob[i].chat(this.message, this.name);
        }
    }

    public void areaStatus(Boolean result) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].clearArea(result);
        }
    }

    public void sliderState(double level) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].warPosition(level);
        }
    }

    public void getInfo(String diffence, Helicopter hc, Tank tk, Submarine sm) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].sentInfo(diffence, hc, tk, sm);
        }
    }

    public void reqInfo(String diffence, Boolean pm) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].requestInfo(diffence, pm);
        }
    }

    public static Observable getInstance() {
        if (instance == null) {
            instance = new Observable();
        }
        return instance;
    }

}
