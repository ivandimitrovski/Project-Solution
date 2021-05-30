package project;

class Author
{
    private String firstName;
    private String lastName;
    private short birthday;

    public Author(String firstName, String lastName, short birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getBirthday() {
        return birthday;
    }

    public void setBirthday(short birthday) {
        this.birthday = birthday;
    }
    
    public String toString()
    {
        return this.firstName+" "+this.lastName+" ";
    }
    
    
}

