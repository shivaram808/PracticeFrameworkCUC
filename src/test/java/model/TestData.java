package model;


public class TestData {

    private String userName;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TestData testData = new TestData();
        testData.setEmail("shiva@selenium");
        testData.setUserName("Shiva");
        System.out.println("TestData:"+testData);
        System.out.println("email:"+testData.getEmail());
    }
}
