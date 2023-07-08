# Construtor de menus em console JAVA.
> Uma função para facilitar a criação de menus personalizados em consoles java.

<hr>

## Como usar:

Para usar, siga a sintaxe a seguir: `result = menuBuild.buildMenu(title, options);`, Onde:

- `result`: É uma variável de tipo `int`, que recebe o valor de retorno da classe de construção do menu.
  > Caso o valor seja 0, foi possível imprimir o menu.
  > Caso o valor seja -1, o menu não possuia título.
  > Caso o valor seja -2, o menu não possuia opções.

- `title` É uma `String` que guarda o título do menu. não pode ser `null`.

- `options` É uma `String` que guarda todas as opções do menu. não pode ser `null`.

Veja o exemplo a seguir:

    String title = "titulo do menu";
    
    String options = "[1] Opção 1.;[2] Opção 2.;[3] Opção 3.; [4] Opção 4.;";
    
    int verif = menuBuild(title, options);

<hr>

## Sobre:

o BuildMenu é um projeto feito por [Matheus Camargo Ginebro](https://github.com/MatheusCamargoGinebro), com o intuito de facilitar a criação de menus personalizados no console do java.
