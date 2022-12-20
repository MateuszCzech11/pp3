public class SMS extends Message {
    private String phoneNo;

    public SMS(String message, String phoneNo) {
        super(message);
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String send(){
        return "Sent to: "+ phoneNo +"\nContents of message: " + getMessage()
    + "\nNumber of characters: "+ charNumber();
    }
}
