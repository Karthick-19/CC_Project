public class Main {
    public static void main(String[] args) {
        IDP idp = new IDP();
        LP lp = new LP(idp.getLogininfo());
    }
}
