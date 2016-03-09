package lt.bees;

import javax.faces.bean.ManagedBean;

/**
 * Created by Ala on 3/7/2016.
 */
@ManagedBean
public class Bees {
    private String firstName;
    private String lastName;

    public Bees(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
