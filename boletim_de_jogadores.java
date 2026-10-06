class boletim_de_jogadores {
	private String nome = "KLEBER";
    private int id = 45;
    private double grana = 34563.98;
    private double pontuacao = 456.78;
    private String nome_pontos = "| RANKING ALTO |";
    
    public boletim_de_jogadores() {};
    
    public boletim_de_jogadores(String nome, int id, double grana, double pontuacao, String nome_pontos) {
    	this.nome = nome;
        this.id = id;
        this.grana = grana;
        this.pontuacao = pontuacao;
        this.nome_pontos = nome_pontos;
    }
    
    public String getNome() {
    	return nome;
    }
    public void setNome(String meuNome) {
    	this.nome = meuNome;
    }
    public int getId() {
    	return id;
    }
    public void setId(int meuId) {
    	this.id = meuId;
    }
    public double getGrana() {
    	return grana;
    }
    public void setGrana(double minhaGrana) {
    	this.grana = minhaGrana;
    }
    public double getPontuacao() {
    	return pontuacao;
    }
    public void setPontuacao(double minhaPontuacao) {
    	this.pontuacao = minhaPontuacao;
    }
    public String getNome_pontos() {
    	return nome_pontos;
    }
    public void setNome_pontos(String meusPontos) {
    	this.nome_pontos = meusPontos;
    }
    
    @Override
    public String toString() {
    	return "NOME: " + nome +
        "ID: " + id + "SALDO: " + grana +
        "PONTOS: " + pontuacao + "NOME DA PONTUAÇÃO: " + 
        nome_pontos;
    }
    
    public static void main(String[] args) {
    	boletim_de_jogadores minhaClasse = new boletim_de_jogadores();
        
        System.out.println(minhaClasse);
        
    }
}