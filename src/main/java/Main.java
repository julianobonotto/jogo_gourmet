import engine.Service;
public class Main {


    public static void main(String[] args) {
        About about = new About();
        Service service = new Service();

        while(true) {
            service.run();
        }
    }
}
