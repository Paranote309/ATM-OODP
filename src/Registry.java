public class Registry {
    private static Registry instance;

    private Registry() {

    }

    public static synchronized Registry getAtm() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

}
