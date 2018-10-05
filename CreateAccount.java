
/**
 
 * 2.Define Static Variable and Static Method. A static variable is a variable that is shared amongst a class.A static method can not access all members of a class.
 * 3.Define Constant and give a code example declaring PI.A constants are shared by all objects of a class. final static double PI = 3.1415926535897
 * 4.What's a package-private or package-access?A default package where the classes, methods, and date fields are accessible by any class in the package.
 * 5.Contrast the public modifier and private modifier. Public allows access even if there is a different class or package while with private it must be in the same class.
 * 6.Discuss the code in figure 9.14 and 9.15.Figure 9.14 Shows the difference in private and public amongst data fields and 9.15 shows the difference amongst private and public classes.
 * 7.What's date field encapsulation and its advantages? Data Field Encapsulation makes data fields private, protecting its data and makes the class easy to maintain.
 * 8.Test CircleWithStaticMembers and explain why static variable numberOfObjects and static method getNumberOfObjects is needed? So that all instances of the class, c1 and c2 in this case, can share the date.
 * 9.Give the statement that creates an array of objects and initialize them. public static CircleWithPrivateDataFields[] createCircleArray(){CircleWithPrivateDataFields[] circleArray=new CircleWithPrivateDataFields[5]}; 
 * 
 * 
 * @author royshawnmcclain
 */
public class CreateAccount {
    public static void main(String[] args) {
        
        Account a1= new Account(1122,20000);
        java.util.Date dateCreated= a1.getDateCreated();
        
        a1.setAnnualInterestRate(4.5);
        
        a1.withdraw(2500);
        a1.deposit(3000);
        
        a1.getMonthlyInterestRate();
        
        a1.printInfo();
        
        Account a2= new Account();
        a2.printInfo();
        
        
    }

}