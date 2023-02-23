## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

<h1>Variáveis, tipos e operadores - Módulo 8 </h1>

####
<h2> <li> Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto. </li>

###
<h2><li>Para utilizar uma classe devemos declará-la da mesma maneira que se declara uma variável de tipo primitivo. Declaramos o tipo (neste caso o nome da classe) seguido pelo nome da variável. </h2></li>
<br>

> Exemplo de instanciação de classe:

> Produto produtoUm;
> produtoUm = new Produto();
> produtoUm.apresentarProduto();

<br>

<h2>A segunda linha deste código representa o processo de instanciação de uma classe. Na linha anterior, a variável produtoUm foi definida como sendo do tipo Produto. Em seguida, com a palavra reserva new, um espaço é criado na memória para armazenar um novo objeto do tipo Produto. O construtor Produto() especifica como o objeto deve ser criado. Por fim, uma referência a esse objeto é atribuída à variável produtoUm.
<br>

Assim, através de produtoUm podemos acessar o objeto criado (e seus atributos e métodos). Na terceira linha, por exemplo, utilizando a variável, acessamos o objeto e chamamos o método apresentarProduto().
<br>

Apesar do exemplo acima, o código para criar um objeto e definir a variável que conterá sua referência normalmente é declarado em apenas uma linha.

>Exemplo de instanciação de classe:

> Produto produtoUm = new Produto(); 
</h2>
