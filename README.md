# Compiladores-ASTs-MiniJava
2º projeto de Teoria e Implementação de Linguagens Computacionais

Obs.: Existem alguns bugs na impressão pelo PrettyPrintVisitor no projeto que são causados pelas próprias regras da BNF:
* Declarações de variaveis ("int x;", "Coisa o;", etc.) não são impressas se estiverem na mainClass
* Apenas o primeiro statement na mainClass é impresso, outros statements são ignorados, a menos que todos eles estejam dentro de um segundo conjunto de chaves
* Não é possível executar funções sem atribuir o resultado delas a algum objeto
