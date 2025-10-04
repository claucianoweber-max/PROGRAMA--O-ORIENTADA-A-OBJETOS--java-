# PROGRAMAÇÃO ORIENTADA A OBJETOS (java)
Primeira Atividade Prática - Avaliativa - AP1 ,aqui detalhamos o uso do Scanner em uma Classe.
<p>→ A Scanner classe é usada para obter a entrada do usuário, é encontrada no java.utilpacote.↓</p>
<p>Código //<a> import java.util.Scanner;</a> //</p>
<p>→ A ( public ) palavra-chave é um modificador de acesso.↓ </p>
<p>Código //<a> ( public ) class CalculadoraDesconto</a> //</a></p>
<p>→ Para criar uma classe, use a palavra-chave class.↓</p>
<p>Código // <a> public ( class ) CalculadoraDesconto </a>//</p>
<p>→ Para nomear um nome de classe.↓</p>
<p><a>Código // public class ( CalculadoraDesconto ) //</a></p>
<p>→ Entrada via teclado do valor.↓</p>
<p>Código //<a>System.out.print("Digite o valor: R$ ");
        double valorProduto = scanner.nextDouble();</a> //</p>

<p>→ Entrada via teclado da porcentagem de desconto.↓</p>
<p>Código //<a>System.out.print("Digite a porcentagem de desconto (%): ");
        double percentualDesconto = scanner.nextDouble(); </a>//</p>
<p>→ Cálculo do desconto.↓</p>
<p>Código //<a>double valorDesconto = valorProduto * (percentualDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;</a> //</p>

<p>→ Saída em tela.↓</p>
<p>Código //<a>System.out.println("\n Valores apurados ");</a>//</p>
<p>Código //<a>System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);</a>//</p>
<p>Código //<a>System.out.printf("Desconto: R$ %.2f%n", valorDesconto);</a>//</p>
<p>Código //<a>System.out.printf("Preço com desconto aplicado: R$ %.2f%n", precoFinal);</a>//</p>
<p>→ O close() método fecha o arquivo ou fluxo de entrada que o scanner estava lendo.↓</p>
<p>Código //<a> scanner.close(); </a>//</p>

