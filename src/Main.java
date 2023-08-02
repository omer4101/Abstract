public class Main {
    public static void main(String[] args) {
    CustomerMenager customerMenager=new CustomerMenager();
    customerMenager.baseDatabaseManager=new SqlServerDatabaseManager();
    customerMenager.getCustomers();
    
    }
}

