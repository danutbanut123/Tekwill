public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
       String both="";
        if (!firstName.equals("null")){
            both+=firstName;
        }
        if (lastName != null) {
            both += " ";
        }
        if (lastName != null) {
            both += lastName;
        }
        return both;
    }
    }




