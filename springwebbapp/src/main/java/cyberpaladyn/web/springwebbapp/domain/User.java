package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String userId;
    private String userEmail;
    private String userPassword;
    private boolean isAdmin;

    public String getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
