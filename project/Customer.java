package project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    String firstName;
    String lastName;
    String dlNumber;
    String postalCode;
    
    public int getId() { return id; }
    
    public String getFirstName() { return firstName; }
    
    public String getLastName() { return lastName; }
    
    public String getDlNumber() { return dlNumber; }
    
    public String getPostalCode() { return postalCode; }
    
    public void setId(int id) { this.id = id; }
    
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public void setDlNumber(String dlNumber) { this.dlNumber = dlNumber; }
    
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }
}
