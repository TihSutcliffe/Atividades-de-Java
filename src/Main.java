import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int  cont, idade, otimo, cont1;
        String notas;
        float media, soma, porcen;
        List<Integer> pessoas = new ArrayList<>();
        cont = 1;
        otimo = 0;
        soma = 0;
        media = 0;
        porcen= 0;
        cont1 = 0;


        while (cont <= 40) {

           idade = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, digite a sua idade: "));

           notas = JOptionPane.showInputDialog("O que você achou do filme? \nÓtimo, digite a letra A: \nBom, digite a " +
                        "letra B:\nRegular, digite a letra C: \nRuim, digite a letra D: \nPéssimo, digite a " +
                        "letra E: ").toUpperCase();
           cont ++;
           if (notas.equals("E")){
               cont1 ++;
           }

           if (notas.equals("A")){
               otimo ++;
           }

           if (notas.equals("D")){
               pessoas.add(idade);
               soma = pessoas.stream().mapToInt(Integer::intValue).sum();
               media = soma/pessoas.toArray().length;
           }
           if (notas.equals("E")){
               porcen = (cont1*100)/40;

           }


        }
        JOptionPane.showMessageDialog(null, "A quantidade de respostas ótimo foi de: " +
                otimo);
        JOptionPane.showMessageDialog(null,"A média da idade das pessoas que responderam ruim " +
                "foi de " + media);
        JOptionPane.showMessageDialog(null, "A porcentagem de pessoas que responderam péssimo foi " +
                "de " +
                porcen + "%");



        }

}
