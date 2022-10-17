public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(String name,int damage,int weight,int health,int dodge){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        if(this.dodge<0||this.dodge>100){
        this.dodge = 0;
        }else{this.dodge = dodge;}

    }
    int hit(Fighter foe){

        System.out.println(this.name + " => "+foe.name+" "+this.damage+ " hasar verdi.");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }



        if(foe.health-this.damage<0){return 0;}
        return foe.health-this.damage;

    }

    boolean isDodge(){
        double random = Math.random()*100;
        return random<this.dodge;
    }

}


