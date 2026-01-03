import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        while(contador < 5){
            
        String personagem;
        int exp;
        System.out.println("Escolha o nome do personagem");
        personagem = sc.next();
        System.out.println("Quanto de experiencia ele tem?");
        exp = sc.nextInt();
        
        if (exp <= 1000){
           System.out.println("O Herói de nome " + personagem + " está no nível Ferro"); 
        }else if(exp >=1001 && exp <=2000){
            System.out.println("O Herói de nome " + personagem + " está no nível Bronze");
        }else if(exp >=2001 && exp <=5000){
            System.out.println("O Herói de nome " + personagem + " está no nível Prata");
        }else if(exp >=5001 && exp <=7000){
            System.out.println("O Herói de nome " + personagem + " está no nível Ouro");
        }else if(exp >=7001 && exp <=8000){
            System.out.println("O Herói de nome " + personagem + " está no nível Platina");
        }else if(exp >=8001 && exp <=000){
            System.out.println("O Herói de nome " + personagem + " está no nível Ascendente");
        }else if(exp >=9001 && exp <=10000){
            System.out.println("O Herói de nome " + personagem + " está no nível Imortal");
        }else {
            System.out.println("O Herói de nome " + personagem + " está no nível Radiante");
        }
        contador ++;
        
    }
    sc.close();
    }
}