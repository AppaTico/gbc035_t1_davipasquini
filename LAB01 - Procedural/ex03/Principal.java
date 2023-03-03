import java.util.Scanner;
import java.lang.Math.*;

public class Principal {
    public static void main (String [] args)
    {
        int op = 0, cont = 0, maior = 0, maior_pos = 0, menor = 0, menor_pos = 0, normal = 0;
        float media = 0;
        double desvio_padrao = 0, soma1 = 0, soma2 = 0;
        int [] vetor = new int[6];
        Scanner c = new Scanner(System.in);

        while (op != 17)
        {
            System.out.println("=== LISTA ===");
            System.out.println("[1] Exercicio 1");
            System.out.println("[2] Exercicio 2");
            System.out.println("[3] Exercício 3");
            System.out.println("[4] Exercicio 4");
            System.out.println("[5] Exercicio 5");
            System.out.println("[6] Exercicio 6");
            System.out.println("[7] Exercicio 7");
            System.out.println("[8] Exercicio 8");
            System.out.println("[9] Exercicio 9");
            System.out.println("[10] Exercicio 10");
            System.out.println("[11] Exercicio 11");
            System.out.println("[12] Exercicio 12");
            System.out.println("[13] Exercicio 13");
            System.out.println("[14] Exercicio 14");
            System.out.println("[15] Exercicio 15");
            System.out.println("[16] Exercicio 16");
            System.out.println("[17] SAIR");

            System.out.println("Escolha qual exercicio deseja testar:");
            op = c.nextInt();
            c.nextLine();

            switch(op)
            {
                case 1:

                    System.out.println("<<Listando um vetor>>");
                    System.out.println("Entre com o número 1:");
                    vetor[0] = c.nextInt();
                    c.nextLine();

                    System.out.println("Entre com o número 2:");
                    vetor[1] = c.nextInt();
                    c.nextLine();

                    System.out.println("Entre com o número 3:");
                    vetor[2] = c.nextInt();
                    c.nextLine();

                    System.out.println("Entre com o número 4:");
                    vetor[3] = c.nextInt();
                    c.nextLine();

                    System.out.println("Entre com o número 5:");
                    vetor[4] = c.nextInt();
                    c.nextLine();

                    System.out.println("Entre com o número 6:");
                    vetor[5] = c.nextInt();
                    c.nextLine();

                    System.out.println("");
                    System.out.println("Os valores lidos sao: " + vetor[0] + " " + vetor[1] + " " + vetor[2] + " " + vetor[3] + " " + vetor[4] + " " + vetor[5]);

                    break;

                case 2:

                    System.out.println("<<Listando um vetor>>");
                    cont = 1;
                    for (int i = 0; i < 6; i++)
                    {
                        System.out.println("Entre com o número " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        cont++;
                    }

                    System.out.println("");
                    System.out.println("Os valores lidos sao:");
                    for (int i = 0; i < 6; i++)
                        System.out.print(" " + vetor[i]);
                    System.out.println("");

                    break;

                case 3:

                    System.out.println("<<Listando um vetor em ordem inversa>>");
                    cont = 1;
                    for (int i = 0; i < 6; i++)
                    {
                        System.out.println("Entre com o número " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        cont++;
                    }

                    System.out.println("");
                    System.out.println("A ordem inversa dos numeros e:");
                    for (int i = 5; i > -1; i--)
                        System.out.print(" " + vetor[i]);
                    System.out.println("");

                    break;

                case 4:

                    System.out.println("<<Listando um vetor de numeros pares>>");
                    cont = 1;
                    for (int i = 0; i < 6; i++)
                    {
                        System.out.println("Entre com o número " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();

                        if (vetor[i] % 2 == 0)
                            cont++;
                        else
                        {
                            System.out.println("Erro: Valor invalido");
                            i--;
                        }
                    }

                    System.out.println("");
                    System.out.println("Os numeros pares digitados foram:");
                    for (int i = 0; i < 6; i++)
                        System.out.print(" " + vetor[i]);
                    System.out.println("");

                    break;

                case 5:

                    System.out.println("<<5 valores>>");
                    cont = 1;

                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println("Entre com o número " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        if (i == 0)
                        {
                            maior = vetor[i];
                            menor = vetor[i];
                            media = vetor[i];
                        }
                        else
                        {
                            media += vetor[i];

                            if (vetor[i] > maior)
                                maior = vetor[i];
                            else if (vetor[i] < menor)
                                menor = vetor[i];
                        }

                        cont++;
                    }

                    media = media / 5;
                    System.out.println("");
                    System.out.println("Os numeros digitados sao:");
                    for (int i = 0; i < 5; i++)
                        System.out.print(" " + vetor[i]);
                    System.out.println("");
                    System.out.println("O maior valor e: " + maior);
                    System.out.println("O menor valor e: " + menor);
                    System.out.println("A media e: " + media);

                    break;

                case 6:

                    System.out.println("<<5 valores>>");
                    cont = 1;

                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println("Entre com o número " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        if (i == 0)
                        {
                            maior = vetor[i];
                            maior_pos = i;

                            menor = vetor[i];
                            menor_pos = i;

                            media = vetor[i];
                        }
                        else
                        {
                            media += vetor[i];

                            if (vetor[i] > maior) {
                                maior = vetor[i];
                                maior_pos = i;
                            }
                            else if (vetor[i] < menor) {
                                menor = vetor[i];
                                menor_pos = i;
                            }
                        }

                        cont++;
                    }

                    media = media / 5;
                    System.out.println("");
                    System.out.println("Os numeros digitados sao:");
                    for (int i = 0; i < 5; i++)
                        System.out.print(" " + vetor[i]);
                    System.out.println("");
                    System.out.println("O maior valor e: " + maior + ", localizado na posicao " + maior_pos + " do vetor");
                    System.out.println("O menor valor e: " + menor + ", localizado na posicao " + menor_pos + " do vetor");
                    System.out.println("A media e: " + media);

                    break;

                case 7:

                    System.out.println("<<Normalizando as notas>>");
                    cont = 1;

                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println("Entre com a nota do aluno " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        if (i == 0) {
                            maior = vetor[i];
                            maior_pos = i;
                        }
                        else
                        {
                            if (vetor[i] > maior) {
                                maior = vetor[i];
                                maior_pos = i;
                            }
                        }

                        cont++;
                    }

                    System.out.println("");
                    System.out.println("Notas normalizadas");
                    normal = 100 / maior;
                    for (int i = 0; i < 5; i++)
                        vetor[i] = vetor[i] * normal;

                    System.out.println("");
                    cont = 1;
                    for (int i = 0; i < 5; i++) {
                        System.out.println("A nota do aluno " + cont + " e " + vetor[i]);
                        cont++;
                    }

                    break;

                case 8:

                    System.out.println("<<Media e desvio-padrao>>");
                    cont = 1;
                    media = 0;

                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println("Digite o valor " + cont + ":");
                        vetor[i] = c.nextInt();
                        c.nextLine();

                        media += vetor[i];
                        cont++;
                    }

                    media = media / 5;
                    for (int i = 0; i < 5; i++) {
                        soma1 = vetor[i] - media;
                        soma2 += Math.pow(soma1, 2);
                    }

                    soma2 = soma2/4;
                    desvio_padrao = Math.sqrt(soma2);
                    System.out.println("A media e " + media + " e o desviao-padrao e " + desvio_padrao);
                    break;
            }

        }
    }
}