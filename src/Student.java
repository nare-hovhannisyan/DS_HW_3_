public class Student {

    private String firstName;
    private String lastName;
    private int askedQuestions;
    private int remainingQuestions;

    public Student(String _firstName, String _lastName, int _askedQuestions, int _remainingQuestions)
    {
        firstName = _firstName;
        lastName = _lastName;
        askedQuestions = _askedQuestions;
        remainingQuestions = _remainingQuestions;
    }

    public String getFullName() { return firstName + " " + lastName; }
    public int getRemainingQuestions() { return remainingQuestions; }
    public int getAskedQuestions() {return askedQuestions; }
    public void setFirstName(String _firstName) { firstName = _firstName; }
    public void setLastName(String _lastName) { lastName = _lastName; }
    public void setAskedQuestions(int count) { askedQuestions = count; }
    public void setRemainingQuestions(int count) { remainingQuestions = count; }

}
