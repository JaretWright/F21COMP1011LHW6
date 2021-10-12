public class Friend implements Comparable<Friend>{
    private String firstName, lastName, phoneNumber;

    public Friend(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString()
    {
        return String.format("%s %s, phone #: %s",firstName,lastName,phoneNumber);
    }

    @Override
    public int compareTo(Friend otherFriend) {
        return phoneNumber.compareTo(otherFriend.phoneNumber);
    }
}
