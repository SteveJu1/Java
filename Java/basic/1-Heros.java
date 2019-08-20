package test;

public class Heros {
    public String name;
    public int attack_num;
    public int heros_HP;
    //方法    
    public void attack (Heros other){    
        other.heros_HP=other.heros_HP-attack_num;
          if (other.heros_HP<=0){
                System.out.println(other.name+"被"+name+"击杀");}
         else{       
                System.out.println(other.name+"被"+name+"攻击"+"剩余的血量为"+other.heros_HP);              
            }
                                    }
    public static void main(String[] args) {
        int i=0;
        //创建赵信对象
        Heros zhaoxin = new Heros();
        //给赵信对象的属性赋值
        zhaoxin.name = "赵信";
        zhaoxin.attack_num = 10;
        zhaoxin.heros_HP=120;
        
        Heros nvjing = new Heros();
        nvjing.name = "女警";
        nvjing.attack_num = 15;
        nvjing.heros_HP=100;    
            
        while(nvjing.heros_HP> 0 && zhaoxin.heros_HP >0) {      
            i++;
            System.out.println("第"+i+"回合");
            zhaoxin.attack(nvjing);
            nvjing.attack(zhaoxin);
            if(nvjing.heros_HP<= 0 && zhaoxin.heros_HP <=0){break;}
        }
}


}
