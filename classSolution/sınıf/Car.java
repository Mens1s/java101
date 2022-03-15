class Car {
    // class car :)
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model , int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }
    //overloading!
    Car(){
        System.out.println("Bos kurucu");
    }

    void increaseSpeed(int increment){
        if(this.speed + increment < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if(this.speed>0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Speed : "+this.speed);
    }

    void printInfo(){
        System.out.println("Model \t: "+this.model);
        System.out.println("Color \t: "+this.color);
        System.out.println("Type  \t: "+this.type);
        System.out.println("Speed \t: "+this.speed);


    }
}