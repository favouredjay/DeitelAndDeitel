package chapter5;

public class MobilePhone{
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private static final String INVALID_IMEI = "INVALID_IMEI";
    public MobilePhone(){
        super();
    }
    public MobilePhone(String imei) {
        if (imei == "") {
            this.imei = MobilePhone.INVALID_IMEI;
        } else {
            this.imei = imei;
        }

    }
    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake){
        this(imeiNumber);
    }
    public MobilePhone(String imeiNumber, int storageSpace){
        this(imeiNumber);
    }


    public static String getImei() {
        return INVALID_IMEI;
    }

    public  void setImei(String imei) {
        this.imei = imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Connection makeCall(int phoneNumber){
        Connection theCall = new Connection();
        return theCall;
    }

    public String toString(){
        return String.format(INVALID_IMEI);
    }

}
