package test;

public class Heros {
    public String name;
    public int attack_num;
    public int heros_HP;
    //����    
    public void attack (Heros other){    
        other.heros_HP=other.heros_HP-attack_num;
          if (other.heros_HP<=0){
                System.out.println(other.name+"��"+name+"��ɱ");}
         else{       
                System.out.println(other.name+"��"+name+"����"+"ʣ���Ѫ��Ϊ"+other.heros_HP);              
            }
                                    }
    public static void main(String[] args) {
        int i=0;
        //�������Ŷ���
        Heros zhaoxin = new Heros();
        //�����Ŷ�������Ը�ֵ
        zhaoxin.name = "����";
        zhaoxin.attack_num = 10;
        zhaoxin.heros_HP=120;
        
        Heros nvjing = new Heros();
        nvjing.name = "Ů��";
        nvjing.attack_num = 15;
        nvjing.heros_HP=100;    
            
        while(nvjing.heros_HP> 0 && zhaoxin.heros_HP >0) {      
            i++;
            System.out.println("��"+i+"�غ�");
            zhaoxin.attack(nvjing);
            nvjing.attack(zhaoxin);
            if(nvjing.heros_HP<= 0 && zhaoxin.heros_HP <=0){break;}
        }
}


}
