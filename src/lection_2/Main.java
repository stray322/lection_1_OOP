package lection_2;

public class Main {
    public static void main(String[] args) {
        boolean checkReg = User.regUser("AnnaSolyannikova07", "nKOdsa56", "nKOdsa56");
        if (checkReg) {
            System.out.println("Вы успешно зарегистрировались.");
        }
    }
}
