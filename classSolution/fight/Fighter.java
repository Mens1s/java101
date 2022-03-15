public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter op){
        System.out.println("-------------");
        System.out.println(this.name + " => "+op.name+" "+this.damage+" hasar ile vurmak için harekete geçiyoor !");
        if(op.dodge()){
            System.out.println(op.name +" yumrugu savusturdu ve mac tüm hızıyla devam ediyor!");
            return op.health;
        }
        if(op.health-this.damage < 0){
            return 0;
        }
        return op.health - this.damage;
    }
    public boolean dodge(){
        double rand = Math.random() *100;
        return rand <= this.dodge;
    }
}
