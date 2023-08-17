import java.sql.SQLOutput;

public class EducationLoan implements Account {

    @Override
    public void getInterestRate() {
        System.out.println("Education Loan is created");
        System.out.println("Education Loan Interest Rate = 10%");
        System.out.println(" ");
    }

}