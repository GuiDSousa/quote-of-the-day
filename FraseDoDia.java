import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class FraseDoDia {
    
    private List<String> frases;
    private int [] numerosDaSorte = new int [5];

    public FraseDoDia() {
        this.frases = new ArrayList<String>();
        this.frases.add("A vida é bela!");
        this.frases.add("O que não mata, fortalece.");
        this.frases.add("Menos é mais.");
        this.frases.add("A persistência é o caminho do êxito.");
        this.frases.add("Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos");
        this.frases.add("Não tenha medo da mudança. Coisas boas se vão para que melhores possam vir.");
        this.frases.add("A vida é como andar de bicicleta. Para manter o equilíbrio, você tem que se manter em movimento.");
        this.frases.add("A verdadeira felicidade é aquela que conquistamos dia a dia, através do nosso trabalho e das pessoas que amamos.");
        this.frases.add("Acredite em milagres, mas não dependa deles.");
        this.frases.add("A única maneira de fazer um excelente trabalho é amar o que você faz.");
        this.numerosDaSorte = gerarNumerosDaSorte();
    }

    public List<String> getFrases() {
        return frases;
    }

    private int [] gerarNumerosDaSorte () {
        Random random = new Random();
        int [] numeros = new int [5];
        for (int i =0; i<5; i++) {
            numeros [i] = random.nextInt(100);
        }
        return numeros;
    }
    
    public String getFrase () {
        Random gerador = new Random();
        int posicao = gerador.nextInt (frases.size());
        return frases.get(posicao);
    }

    public int [] getNumerosDaSorte () {
        return this.numerosDaSorte;
    }
}
