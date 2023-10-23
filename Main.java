import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rsp, f, m, rep, mediaf, mediam, qts, qts2;
    qts2 = 0;
    f = 0;
    m = 0;
    mediaf = 0;
    mediam = 0;
    rep = 0;
    
    System.out.println("Informe a quantidade de pessoas: ");
    rep = scan.nextInt();
    qts = rep;
    
    while(rep>0){
      while(rep>0){
        rep--;
        System.out.println("Qual o sexo da pessoa? \n 1-Feminino \n 2-Masculino \n");
          rsp = scan.nextInt();
          System.out.println();
        
        if(rsp==1 || rsp==2){
           if(rsp == 1){
             System.out.println("Informe a idade dela: ");
             f = scan.nextInt();
              if(f>=0){
                mediam += m;
                
              }
             if(f<0){
               System.out.println("Digite um valor válido, tentativa não contabilizada \n");
               rep++;
             }
             mediaf += f;
             qts--;
           }
          
          if(rsp == 2){
            System.out.println("Informe a idade dele: ");
            m = scan.nextInt();
            
            if(m>=0){
             mediam += m;
             qts2++;
            }
            else{
              System.out.println("Digite um valor válido, tentativa não contabilizada \n");
              rep++;
            }
            
          }
          if(rep == 0){
      mediaf = f/qts;
      mediam = m/qts2;
      System.out.println("A media das meninas é de "+mediaf+" anos e dos meninos "+mediam+" anos");
          }
          
        }
      else if(rsp>2 || rsp<1){
        System.out.println("Não entendi, escolha uma das opções \n");
      }
      }
    }
    System.out.println("Código finalizado");
  }
}