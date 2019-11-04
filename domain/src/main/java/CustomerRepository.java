import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {

    private Map<String, Customer> customerRepository = new HashMap<>();

    public Customer saveCustomer(String id, Customer customer) {
        if (isIn(customer)) {
            throw new IllegalArgumentException("Customer is already in.");
        }
        return customerRepository.put(id, customer);
    }

    private boolean isIn(Customer customer) {
        return customerRepository.containsValue(customer);
    }

    public Collection<Customer> getAllCustomers() {
        return customerRepository.values();
    }

}
