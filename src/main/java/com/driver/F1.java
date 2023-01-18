package com.driver;

public class F1 extends Car {
    private String name;
    private boolean isManual;
    public F1(String name, boolean isManual) {
        super();
        //Use arbitrary values for parameters which are not mentioned
        this.name=name;
        this.isManual=isManual;
    }

    public void accelerate(int rate){
        int newSpeed; //set the value of new speed by using currentSpeed and rate
        newSpeed=getCurrentSpeed()+rate;
        /* *
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */


        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed > 0 && newSpeed<=100) {
            changeGear(2);
            move(newSpeed,getCurrentDirection());
        } else if (newSpeed > 100 && newSpeed<=150) {
            changeGear(3);
            move(newSpeed,getCurrentDirection());
        } else if (newSpeed > 150 && newSpeed<=200) {
            changeGear(4);
            move(newSpeed,getCurrentDirection());
        } else if (newSpeed > 200 && newSpeed<=250) {
            changeGear(5);
            move(newSpeed,getCurrentDirection());
        }else {
            changeGear(6);
            move(newSpeed,getCurrentDirection());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
