package model;

public class Shipper extends Person{
    private String identityCard;
    private String area;
    private boolean status;

    public Shipper() {
    }

    public Shipper(String identityCard, String area, boolean status) {
        this.identityCard = identityCard;
        this.area = area;
        this.status = status;
    }

    public Shipper(String id, String name, int age, String address, String phoneNumber, String identityCard, String area, boolean status) {
        super(id, name, age, address, phoneNumber);
        this.identityCard = identityCard;
        this.area = area;
        this.status = status;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", area='" + area + '\'' +
                ", status=" + status +
                '}';
    }
}
