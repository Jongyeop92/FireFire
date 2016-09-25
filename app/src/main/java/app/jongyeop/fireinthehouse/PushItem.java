package app.jongyeop.fireinthehouse;

/**
 * Created by Mr.Han on 2016-09-14.
 */
public class PushItem {
    private String name;
    private String serialNumber;

    public String getName() { return name; }
    public String getSerialNumber() { return serialNumber; }

    public PushItem(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }
}
