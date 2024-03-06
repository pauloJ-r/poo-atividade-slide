package atividadepoo;

import java.util.Scanner;

public class Programa {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean sair = false;
        
        while (!sair) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calculo de Metabolismo Basal");
            System.out.println("3. Sair");

            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    String nome;
                    System.out.println("Digite o Seu nome:");
                    nome = sc.next();
                    System.out.println("Digite o Seu peso em quilogramas:");
                    float peso = sc.nextFloat();
                    System.out.println("Digite a sua altura:");
                    float altura = sc.nextFloat();

                    float imc = peso / (altura * altura);
		
		if(imc< 19) {
			System.out.println("Ola "+nome +" o seu IMC é:"+imc +" e voce esta abaixo do peso");
		}else if(imc <= 19 || imc < 25) {
			System.out.println("Ola "+nome +" o seu IMC é:"+imc +"e voce esta com o peso o normal");
		}else if(imc <= 25 || imc < 30) {
			System.out.println("Ola "+nome +" o seu IMC é:"+imc +"e voce esta sobrepeso");
		}else if (imc <= 30 || imc < 40) {
			System.out.println("Ola "+nome +" o seu IMC é:"+imc +"e voce esta com obesidade tipo 1");
		}else if (imc >= 40) {
			System.out.println("Ola "+nome +" o seu IMC é:"+imc +"e voce esta com obesidade morbida");
		}
		
		break;
                case 2:
                    String genero;
                   
                    System.out.println("Digite o seu Genêro? M ou F");
                    genero = sc.next();
                    System.out.println("Digite a sua idade ? ");
                    int idade = sc.nextInt();
                    
                    System.out.println("Digite o Seu peso em quilogramas:");
                    float pesoM = sc.nextFloat();
                    
                   
                    float mb;
                    
                    if (genero.equals("M") || genero.equals("m")) {
                    	 if (idade >= 18 && idade < 30) {
                	mb = 15.057f * pesoM + 679;
          		} else if (idade >= 30 && idade < 60) {
               		 mb = 11.6f * pesoM + 879;
            		} else {
               		 mb = 13.5f * pesoM + 487;
            		}
            		System.out.println("Seu metabolismo basal é: " + mb + " Kcal");
			    
                    } else if(genero.equals("F") || genero.equals("f")) {
                    	if (idade >= 18 && idade < 30) {
                	mb = 14.7f * pesoM + 486.6f;
            		} else if (idade >= 30 && idade < 60) {
                	mb = 8.7f * pesoM + 829;
           		 } else {
               		 mb = 10.5f * pesoM + 596;
            		}
            		System.out.println("Seu metabolismo basal é: " + mb + " Kcal");
        		}
                      else {
                    	System.out.println("genero invalido");
                    	return;
                    }
                    
                    
                    
                    
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        
    }
}
