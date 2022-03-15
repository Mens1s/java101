public class Main {
    public static void main(String[] args) {
        double rand = Math.random()*100;
        Fighter not = new Fighter("NOTORUSHIMA" , 15 , 100, 90, 40);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 90);
        Ring r;
        if (rand>50)  {
            r = new Ring(not,alex , 90 , 100);
        }else{
            r = new Ring(alex,not , 90 , 100);
        }

        r.fight();
    }
}
