public class AbstractFactoryDemo {

    public static void main(String[] args) {


        AbstractFactory af = FactoryProvider.getFactory("Account");


        Account account2 = af.getAccount("Current");
        account2.getInterestRate();


        Account account1 = af.getAccount("Savings");
        account1.getInterestRate();

        AbstractFactory lf = FactoryProvider.getFactory("Loan");

        Account loan1 = lf.getAccount("Home");
        loan1.getInterestRate();

        Account loan2 = lf.getAccount("Education");
        loan2.getInterestRate();

    }

}