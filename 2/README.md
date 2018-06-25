# Modificadores de Acesso

Ex. de método:

```java

// public - Modificador de acesso
// static - Tipo do método (estático)
// void   - Tipo de retorno da função (void = "sem retorno")
// main   - Nome da função
// String[] args - Parâmetro da função
public static void main(String[] args) {
    // ...
}
```

* Modificadores de acesso fornecem mais segurança ao código. Apenas quem possui "autorização" pode acessar o método.

* Neste exemplo existem 3 modificadores de acesso:
    - **public** - Todas as classes em todos os pacotes possuem acesso aos métodos e/ou variáveis que possuem este modificador.

    - **private** - Somente a própria classe terá acesso aos métodos e/ou variáveis privadas.

    - **"Sem modificadores"** - Todas as classes (no mesmo pacote) tem acesso a métodos e/ou variavéis que possuem este modificador.