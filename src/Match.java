public class Match {
        Fighter f1;
        Fighter f2;
        int minweight;
        int maxweight;

        Match(Fighter f1, Fighter f2, int minweight, int maxweight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minweight = minweight;
        this.maxweight = maxweight;
        }

        void run() {
        if (checkWeight()) {

        while (this.f1.health > 0 && this.f2.health > 0){
        if(isStart()<=1){
        System.out.println("========YENİ ROUND======");
        this.f2.health = this.f1.hit(this.f2);
        if (isWin()){break;}
        this.f1.health = this.f2.hit(f1);
        if (isWin()){break;}

        System.out.println(this.f2.name+": "+this.f2.health);
        System.out.println(this.f1.name+": "+this.f1.health);}
        if(isStart()>1){
        System.out.println("========YENİ ROUND======");
        this.f1.health = this.f2.hit(f1);
        if (isWin()){break;}
        this.f2.health = this.f1.hit(this.f2);
        if (isWin()){break;}

        System.out.println(this.f2.name+": "+this.f2.health);
        System.out.println(this.f1.name+": "+this.f1.health);}
        }
        }else {System.out.println("Sporcuların ağırlıkları uyuşmuyor."); }


        }







        boolean checkWeight() {
        return (this.f1.weight <= maxweight && this.f1.weight >= minweight && this.f2.weight <= maxweight && this.f2.weight >= minweight);

        }

        boolean isWin(){
        if(this.f1.health==0){
        System.out.println(this.f2.name+" Kazandı.");
        return true;
        }
        if(this.f2.health==0){
        System.out.println(this.f1.name+" Kazandı.");
        return true;
        }
        return false;
        }

        double isStart(){
        double chance= Math.random()*2;
        return chance;

        }
        }





