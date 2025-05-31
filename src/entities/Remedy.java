package entities;

public class Remedy {
    private String nome;
    private Ingredients ingredients;
    private String descricao;
    private Integer validade;
    private boolean perigo;
    private int quantidade;

    public Remedy(int quantidade, boolean perigo, Integer validade, String descricao, Ingredients ingredients, String nome) {
        this.quantidade = quantidade;
        this.perigo = perigo;
        this.validade = validade;
        this.descricao = descricao;
        this.ingredients = ingredients;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    // Não vai ser possível alterar a validade do remédio.
    public Integer getValidade() {
        return validade;
    }
    // Não vai ser possível alterar a periculosidade do remédio.
    public boolean isPerigo() {
        return perigo;
    }
    // Não vai ser possível alterar a quantidade do produto através de SET, somente pelo metodo especificado
    public int getQuantidade() {
        return quantidade;
    }
}
