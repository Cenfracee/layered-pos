package dao.custom.impl;

import dao.DAOFactory;
import dao.DAOType;
import dao.SuperDAO;
import dao.custom.QueryDAO;
import entity.Customer;

import java.util.List;

public class CustomerDAOTest {

    public static void main(String[] args) {
        DAOFactory.getInstance().getDAO(DAOType.QUERY);
        // assert CustomerDAO.findAllCustomers().size() == 6;
//        assert CustomerDAO.deleteCustomer("C011"): "Test Failed";
//        boolean result = CustomerDAO.deleteCustomer("C006");
//        List<Customer> customers = CustomerDAO.findAllCustomers();
//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }
/*        boolean result = CustomerDAO.saveCustomer(new Customer("C006", "Appu", "Panadura"));
        System.out.println(result);
        List<Customer> customers = CustomerDAO.findAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }*/
    }
}
