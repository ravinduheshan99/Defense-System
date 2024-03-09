package defence.system;

public class DefenceSystem {

    public static void main(String[] args) {
        Observable obs = Observable.getInstance();

        MainController mc = new MainController();
        Helicopter hc = new Helicopter();
        Tank tk = new Tank();
        Submarine sm = new Submarine();

        mc.setVisible(true);
        hc.setVisible(true);
        tk.setVisible(true);
        sm.setVisible(true);

        obs.addComp(mc);
        obs.addComp(hc);
        obs.addComp(tk);
        obs.addComp(sm);
    }
}
