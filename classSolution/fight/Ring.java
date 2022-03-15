public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void fight(){

        if(checkWeigth()){
            while(f1.health>0 && f2.health>0){
                System.out.println(" ======== YENI ROUND ======== ");
                f2.health = f1.hit(f2);
                if(win()){
                    break;
                }
                f1.health = f2.hit(f1);
                if(win()){
                    break;
                }
                score();
            }
        }
        else{
            System.out.println("Kiloları uygun degil!");
        }
    }

    public boolean checkWeigth() {
        return ((f1.weight>=minWeight && f1.weight<=maxWeight) && ((f2.weight>=minWeight && f2.weight<=maxWeight)));
    }

    public boolean win(){
        if(f1.health<=0){
            System.out.println("KAZANAN : "+this.f2.name);
            return true;
        }
        else if(f2.health<=0){
            System.out.println("KAZANAN : "+this.f1.name);
            return true;
        }
        return false;
    }

    public void score(){
        System.out.println("-------------------");
        System.out.println(f1.name + " Kalan can : \t"+f1.health);
        System.out.println(f2.name + " Kalan can : \t"+f2.health);

    }
}
