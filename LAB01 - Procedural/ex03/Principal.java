import java.util.Scanner;
import java.lang.Math.*;
import java.util.Arrays;

public class Principal {
    public static void main (String [] args)
    {
        /*Dá pra fazer tudo com menos variaveis mas fica meio gororoba e confuso entao fiquei com preguiça
        * Pelo mesmo motivo (preguiça) tb n fiz uns try-catch pro programa nao crashar com qualquer insert invalido
        * Como ta no comeco da materia acho q n faria diferenca na nota ne*/

        int op = 0, cont = 0, maior = 0, maior_pos = 0, menor = 0, menor_pos = 0, normal = 0;
        int verdes = 0, azuis = 0, amarelas = 0, vermelhas = 0;
        float media = 0, prob_verdes = 0, prob_azuis = 0, prob_amarelas = 0, prob_vermelhas = 0, maior_prob = 0;
        double desvio_padrao = 0, soma1 = 0, soma2 = 0;

        int matricula = 0; char classe; float cra = 0;

        int [] vetor = new int[8];
        int [] val_rep = new int[8]; int [] pos_rep = new int [8]; int conta_rep = 0;
        int [] alunos = new int[100];
        int [] array_A = new int[3];
        int [] array_B = new int[3];
        int [] array_C = new int[3];
        int [] pares = new int[5]; int conta_pares = 0;
        int [] impares = new int[5]; int conta_impares = 0;
        Aluno [] exquatorze = new Aluno[10000];

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
                    System.out.print("Os valores lidos sao:");
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
                    System.out.print("A ordem inversa dos numeros e:");
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
                    System.out.print("Os numeros pares digitados foram:");
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

                case 9:

                    cont = 1;
                    media = 0;

                    System.out.println("<<Média de n alunos. Máximo 100 alunos>>");
                    System.out.println("Entre com o numero de alunos: ");
                    maior = c.nextInt();
                    c.nextLine();

                    if (maior > 100 || maior < 1)
                    {
                        System.out.println("Erro! O numero maximo de alunos permitido e 100!");
                        break;
                    }

                    for (int i = 0; i < maior; i++)
                    {
                        System.out.println("Digite a nota do aluno " + cont + ":");
                        cont++;

                        alunos[i] = c.nextInt();
                        c.nextLine();
                        media += alunos[i];
                    }

                    cont = 1;
                    System.out.println("");
                    System.out.println("Relatorio de Notas");
                    for (int i = 0; i < maior; i++)
                    {
                        System.out.println("Digite a nota do aluno " + cont + " e: " + alunos[i]);
                        cont++;
                    }

                    media = media / maior;
                    System.out.println("A media da turma e: " + media);

                    break;

                case 10:

                    System.out.println("<<Subtracao de vetores>>");
                    cont = 1;
                    for(int i = 0; i < 3; i++)
                    {
                        System.out.println("Digite o valor " + cont + " de A:");
                        cont++;
                        array_A[i] = c.nextInt();
                        c.nextLine();
                    }

                    System.out.println("");
                    cont = 1;
                    for(int i = 0; i < 3; i++)
                    {
                        System.out.println("Digite o valor " + cont + " de B:");
                        cont++;
                        array_B[i] = c.nextInt();
                        c.nextLine();
                        array_C[i] = array_A[i] - array_B[i];
                    }

                    System.out.println("");
                    System.out.println("O vetor C, definido como C = A-B e (" + array_C[0] + ", " + array_C[1] + ", " + array_C[2] + ")");

                    break;

                case 11:

                    System.out.println("<<Pares e Impares>>");
                    cont = 1;
                    conta_pares = 0; conta_impares = 0;

                    for(int i = 0; i < 5; i++)
                    {
                        System.out.println("Digite o valor " + cont + ":");
                        cont++;
                        vetor[i] = c.nextInt();
                        c.nextLine();

                        if (vetor[i] % 2 == 0)
                        {
                            pares[conta_pares] = vetor[i];
                            conta_pares++;
                        }
                        else
                        {
                            impares[conta_impares] = vetor[i];
                            conta_impares++;
                        }
                    }

                    System.out.println("");
                    if (conta_impares > 0)
                    {
                        System.out.print("Impares: " + impares[0]);
                        if (conta_impares > 1)
                        {
                            for (int i = 1; i <= conta_impares; i++)
                                System.out.print(", " + impares[i]);
                        }
                        System.out.println("");
                    }
                    if (conta_pares > 0)
                    {
                        System.out.println("Pares: " + pares[0]);
                        if (conta_pares > 1)
                        {
                            for (int i = 1; i <= conta_pares; i++)
                                System.out.print(", " + pares[i]);
                        }
                        System.out.println("");
                    }

                    break;

                case 12:

                    cont = 0;

                    System.out.println("<<Probabilidades>>");
                    System.out.println("");
                    System.out.println("Digite a quantidade de bolinhas");

                    System.out.println("Verde: ");
                    verdes = c.nextInt();
                    c.nextLine();

                    cont += verdes;

                    System.out.println("Azul: ");
                    azuis = c.nextInt();
                    c.nextLine();

                    cont += azuis;

                    System.out.println("Amarela: ");
                    amarelas = c.nextInt();
                    c.nextLine();

                    cont += amarelas;

                    System.out.println("Vermelha: ");
                    vermelhas = c.nextInt();
                    c.nextLine();

                    cont += vermelhas;

                    prob_verdes = verdes / cont;
                    maior_prob = prob_verdes;

                    prob_azuis = azuis / cont;
                    if (prob_azuis > maior_prob)
                        maior_prob = prob_azuis;

                    prob_amarelas = amarelas / cont;
                    if (prob_amarelas > maior_prob)
                        maior_prob = prob_amarelas;

                    prob_vermelhas = vermelhas / cont;
                    if (prob_vermelhas > maior_prob)
                        maior_prob = prob_vermelhas;

                    System.out.println("");
                    System.out.println("Probabilidades");

                    System.out.print("Verde: " + prob_verdes + "%");
                    if (prob_verdes == maior_prob)
                        System.out.print(" << Maior probabilidade");
                    System.out.println("");

                    System.out.print("Azul: " + prob_azuis + "%");
                    if (prob_azuis == maior_prob)
                        System.out.print(" << Maior probabilidade");
                    System.out.println("");

                    System.out.print("Amarela: " + prob_amarelas + "%");
                    if (prob_amarelas == maior_prob)
                        System.out.print(" << Maior probabilidade");
                    System.out.println("");

                    System.out.print("Vermelha: " + prob_vermelhas + "%");
                    if (prob_vermelhas == maior_prob)
                        System.out.print(" << Maior probabilidade");
                    System.out.println("");

                    break;

                case 13:

                    System.out.println("<<Zerando negativos>>");
                    cont = 1;
                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println("Entre com o numero " + cont + ": ");
                        vetor[i] = c.nextInt();
                        c.nextLine();

                        if (vetor[i] < 0)
                            vetor[i] = 0;
                    }

                    System.out.println("");
                    System.out.println("Zerando os negativos, obtem-se: " + vetor[0] + " " + vetor[1] + " " + vetor[2] + " " + vetor[3] + " " + vetor[4]);

                    break;

                case 14:

                    System.out.println("<<Universidade X>>");
                    System.out.println("Quantos alunos serao cadastrados: ");
                    cont = c.nextInt();
                    c.nextLine();

                    if (cont > 10000 || cont < 0)
                    {
                        System.out.println("Valor invalido");
                        break;
                    }

                    for (int i = 0; i < cont; i++)
                    {
                        System.out.println("Entre com o numero do aluno: ");
                        matricula = c.nextInt();
                        c.nextLine();

                        System.out.println("Entre com a classe social do aluno " + matricula + ": ");
                        classe = c.next(".").charAt(0);

                        System.out.println("Entre com o CRA do aluno " + matricula + ": ");
                        cra = c.nextFloat();
                        c.nextLine();

                        exquatorze[i] = new Aluno(matricula, classe, cra);
                    }

                    System.out.println("====Alunos Cadastrados====");
                    for (int i = 0; i < cont; i++)
                        exquatorze[i].printAluno();

                    break;

                case 15:

                    System.out.println("<<Valores iguais>>");
                    cont = 1; conta_pares = 1;

                    for (int i = 0; i < 8; i++)
                    {
                        System.out.println("Entre com o numero " + cont + ": ");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        cont++;
                    }

                    Arrays.sort(vetor);

                    for(int i = 1; i < 7; i++)
                    {
                        if (vetor[i] == vetor[i+1] && vetor[i] != val_rep[conta_pares - 1])
                        {
                            val_rep[conta_pares] = vetor[i];
                            conta_pares++;
                        }
                    }

                    System.out.println("");
                    if (conta_pares > 1)
                    {
                        System.out.print("Valores repetidos: " + val_rep[1]);
                        if (conta_pares > 2) {
                            for (int i = 2; i < conta_pares; i++)
                                System.out.print(", " + val_rep[i]);
                        }
                    }
                    System.out.println("");
                    break;

                case 16:

                    System.out.println("<<Valores iguais>>");
                    cont = 1; conta_pares = 0;

                    for (int i = 0; i < 8; i++)
                    {
                        System.out.println("Entre com o numero " + cont + ": ");
                        vetor[i] = c.nextInt();
                        c.nextLine();
                        cont++;
                    }

                    Arrays.sort(vetor);

                    for(int i = 0; i <= 7; i++)
                    {
                        if (i < 7 && i > 0)
                        {
                            if (vetor[i] == vetor[i + 1] || vetor[i] == vetor[i - 1]) {
                                val_rep[conta_pares] = vetor[i];
                                conta_pares++;
                            }
                        }
                        else if (i == 7)
                        {
                            if (vetor[i] == vetor[i - 1])
                            {
                                val_rep[conta_pares] = vetor[i];
                                conta_pares++;
                            }
                        }
                        else if (i == 0)
                        {
                            if (vetor[i] == vetor[i + 1])
                            {
                                val_rep[conta_pares] = vetor[i];
                                conta_pares++;
                            }
                        }
                    }

                    cont = 0;
                    conta_impares = 0;
                    for (int i = cont; i < conta_pares; i++)
                    {
                        conta_rep = val_rep[cont];
                        for (int j = 0; j < conta_pares; j++) {
                            if (val_rep[j] == conta_rep) {
                                cont++;
                                conta_impares++;
                            }
                        }

                        System.out.println("Valores repetidos: ");
                        System.out.println(conta_rep + " aparece " + conta_impares + " vezes");
                        conta_impares = 0;
                        i = cont;
                    }

                    System.out.println("");

                    break;
            }
        }
    }
}