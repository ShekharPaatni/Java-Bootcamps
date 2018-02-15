//Create 3 sub class of bank com.first.SBI,com.first.BOI,com.first.ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks.


class RBI {
    private double roi;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public void getDetails() {
        System.out.println("com.first.RBI new ROI is "+ roi+"%");
    }
}
class SBI extends  RBI{
    private double roi;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public void getDetails() {
        System.out.println("com.first.SBI new ROI is "+ roi+"%");
    }
}
class BOI extends RBI{
    private double roi;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public void getDetails() {
        System.out.println("com.first.BOI new ROI is " + roi+ "%");
    }
}
class ICICI extends RBI{
    private double roi;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public void getDetails() {
        System.out.println("com.first.ICICI new ROI is "+ roi+"%");
    }
}

class customer {
    public static void main(String[] args) {
        RBI obj = new ICICI();
        obj.setRoi(5.8);
        obj.getDetails();
    }
}
