package data;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 30/11/2024
 */
//Cha và Con đều có 2 món tài sản
//Rectangle có o, c, w, l
//Square    có o, c, e, e
public class Parent {
    protected String assetOne; //biệt thự
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "assetOne='" + assetOne + '\'' +
                ", assetTwo='" + assetTwo + '\'' +
                '}';
    }

    public void showProfile() {
        System.out.println("PARENT? " + "asset1: " + assetOne + " asset2: " + assetTwo);
    }


}
