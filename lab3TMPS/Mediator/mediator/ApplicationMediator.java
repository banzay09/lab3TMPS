import java.util.ArrayList;

public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        for(Colleague c: colleagues) {
            if (c == originator) {
                continue;
            }
            c.receive(message);
        }
    }
}
