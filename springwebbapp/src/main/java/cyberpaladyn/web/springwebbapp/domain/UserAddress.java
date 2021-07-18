package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAddress {
    @Id
    private String userId;
    @Id
    private int addresId;
    private String country;
    private String town;
    private String street;
    private String postCode;
    private String firstName;
    private String lastName;
    private String telephone;
    private User user;

    public String getUserId() {
        return userId;
    }

    public User getUser() {
        return user;
    }

    public int getAddresId() {
        return addresId;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUser(User user) {
        this.user = user;
        this.userId = user.getUserId();
    }

    public void setAddresId(int addresId) {
        this.addresId = addresId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
