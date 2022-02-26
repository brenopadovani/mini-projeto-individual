
import java.util.Scanner;

public class EspacoSaude {

    public static void main(String[] args) {
     Integer resposta;
     
     do{
        System.out.println("-----------------------------------------" + "\n"
                + "BEM VINDO AO ESPAÇO PADOVANI SAUDE!" + "\n"
                + "-----------------------------------------" + "\n"
                + "DIGITE A OPÇÃO DESEJADA: " + "\n"
                + "[1] PARA VER SEU IMC." + "\n"
                + "[2] COLOQUE SEU IMC E SAIBA COMO ESTA!" + "\n"
                + "[3] MELHORES EXERCICIOS." + "\n"
                + "[4] JOGO DO FOCO." + "\n"
                + "[5] SAIR." + "\n"
                + "-----------------------------------------" + "\n");
        Scanner leitor = new Scanner(System.in);

   
         resposta = leitor.nextInt();

        Metodos m = new Metodos();
   
        
        switch (resposta) {
            case 1:
                System.out.println("Digite seu peso");
                Double peso = leitor.nextDouble();
                System.out.println("Digite sua altura");
                Double altura = leitor.nextDouble();
                Double resultado = m.calcularimc(peso, altura);
                String mostrar = String.format("Seu IMC e: %.1f", resultado);
                System.out.println(mostrar);
                
                break;
            case 2:
                System.out.println("Coloque seu IMC,descubra seu grau de "
                        + "obesidade ");
                Double imc = leitor.nextDouble();

                if (imc <= 18.5) {
                    System.out.println("Magreza, Grau:0");
                } else if (imc >= 18.5 && imc <= 24.9) {
                    System.out.println("Normal, Grau:0");
                } else if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Sobrepeso, Grau:1");
                } else if (imc >= 30 && imc <= 39.9) {
                    System.out.println("Obesidade, Grau:2");
                } else if (imc <= 40) {
                    System.out.println("Obesidade Grave, Grau:3");
                }
                break;
            case 3:
                System.out.println("Coloque seu Grau de Obesidade:");
                Integer grau = leitor.nextInt();
                
                if (grau == 0) {
                    System.out.println("Abdominais: 100" + "\n"
                            + "Flexão de braço: 100" + "\n"
                            + "Aerobico: 10 minutos" + "\n"
                            + "Foco Alimentaçao: Carboidratos."
                    );
                }
                else if (grau == 1) {
                    System.out.println("Abdominais: 50" + "\n"
                            + "Flexão de braço: 50" + "\n"
                            + "Aerobico: 40 minutos" + "\n"
                            + "Foco Alimentaçao: Carboidratos controlados,"
                            + "com foco em Proteinas.");
                }
                else if (grau == 2) {
                        System.out.println("Abdominais: 100" + "\n"
                            + "Flexão de braço: 15" + "\n"
                            + "Aerobico: 60 minutos" + "\n"
                            + "Foco Alimentaçao: Proteinas");  
                    }
                else if (grau == 3) {
                    System.out.println("Abdominais: 50" + "\n"
                            + "Flexão de braço: 5" + "\n"
                            + "Aerobico: 120 minutos" + "\n"
                            + "Foco Alimentaçao: Proteinas");
                }
                break;
            case 4:
                System.out.println("Voce conseguiu treinar ?(1 para 'SIM'/"
                        + "2 para 'NAO')");
                System.out.println("Domingo");
                Integer placar0 = leitor.nextInt();
                System.out.println("Segunda");
                Integer placar1 = leitor.nextInt();
                System.out.println("Terca");
                Integer placar2 = leitor.nextInt();
                System.out.println("Quarta");
                Integer placar3 = leitor.nextInt();
                System.out.println("Quinta");
                Integer placar4 = leitor.nextInt();
                System.out.println("Sexta");
                Integer placar5 = leitor.nextInt();
                System.out.println("Sabado");
                Integer placar6 = leitor.nextInt();
                
                Integer placarTotal = 0;
                
                if (placar0 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar1 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar2 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar3 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar4 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar5 == 1) {
                    placarTotal +=5;
                    System.out.println("5 pontos");
                }
                else{
                     placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                if (placar6 == 1) {
                    placarTotal += 5;
                    System.out.println("5 pontos");
                }
                else{
                    placarTotal -= 5;
                    System.out.println("- 5 pontos");
                }
                
                System.out.println("Seu placar total e:" + placarTotal);
                
                if (placarTotal >= 15) {
                    System.out.println("Parabens continue assim!");
                }
                else if (placarTotal < 15) {
                    System.out.println("Nao desista, insista pela melhora!");
                }

               
                break;
            case 5:
                 System.out.println("Foi uma honra receber voce!!!" + "\n"
                        + "Ate a proxima!!!");
                break;
            default:
                while(resposta >= 6){
           System.out.println("Numero invalido digite outro numero");
           resposta = leitor.nextInt();}
                    
        }
     
    
    }while(resposta <=4 && resposta >=1);
    }
}
