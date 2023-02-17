import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;



public class FraseDoDiaGUI extends JFrame {

    public static void main(String[] args) {
        FraseDoDiaGUI frame = new FraseDoDiaGUI();
        frame.setVisible(true);
    }

    private JPanel contentPane;

    private FraseDoDia fraseDoDia;

    public FraseDoDiaGUI() {
        Color minhaCor = new Color(81, 64, 206);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.setBackground(minhaCor);

        this.fraseDoDia = new FraseDoDia();

        JButton botao = new JButton("Clique aqui para ver a frase do dia!");

        botao.addActionListener(e -> {
            List<String> frases = this.fraseDoDia.getFrases();
            String[] frasesArray = frases.toArray(new String[0]);
            int indiceAleatorio = (int) (Math.random() * frasesArray.length);
            String mensagem = "Frase do dia:\n" + frasesArray[indiceAleatorio];
            JOptionPane.showMessageDialog(null, mensagem);
        });

        contentPane.add(botao);

        JButton botaoNumeros = new JButton("Clique aqui para ver os números da sorte!");

        botaoNumeros.addActionListener(e -> {
            int[] numeros = this.fraseDoDia.getNumerosDaSorte();
            String mensagem = "Números da sorte: " + Arrays.toString(numeros);
            JOptionPane.showMessageDialog(null, mensagem);
        });

        contentPane.add(botaoNumeros, BorderLayout.SOUTH);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
}
