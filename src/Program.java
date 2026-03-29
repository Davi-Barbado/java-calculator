import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.objecthunter.exp4j.*;
public class Program implements ActionListener {
    static JButton botao;
    static JButton botao1;
    static JButton botao2;
    static JButton botao3;
    static JButton botao4;
    static JButton botao5;
    static JButton botao6;
    static JButton botao7;
    static JButton botao8;
    static JButton botao9;
    static JButton botao10;
    static JButton botao_del;
    static JButton botao_plus;
    static JButton botao_equal;
    static JButton botao_minus;
    static JButton botao_multi;
    static JButton botao_divi;
    static JLabel visor;
    static String expressao = "";
    static double resultado = 0;
    String resultado_string;
    public static void main(String[] args){
        Color Dgray = new Color(209, 209, 209);
        JFrame frame = new JFrame();
        frame.setResizable(false);
        ImageIcon icone = new ImageIcon(Program.class.getResource("/logo.png"));
        frame.setIconImage(icone.getImage());
        Font f = new Font("serif", Font.PLAIN, 40);
        visor = new JLabel();
        visor.setForeground(Color.black);
        visor.setText("Expressão aqui");
        visor.setFont(f);
        visor.setBounds(0, 0, 320, 100);
        visor.setBackground(Dgray);
        visor.setOpaque(true);
        botao = new JButton("1");
        botao1 = new JButton("2");
        botao2 = new JButton("3");
        botao3 = new JButton("4");
        botao4 = new JButton("5");
        botao5 = new JButton("6");
        botao6 = new JButton("7");
        botao7 = new JButton("8");
        botao8 = new JButton("9");
        botao9 = new JButton("0");
        botao10 = new JButton(",");
        botao_plus = new JButton("+");
        botao_del = new JButton("DEL");
        botao_equal = new JButton("=");
        botao_minus = new JButton("-");
        botao_multi = new JButton("*");
        botao_divi = new JButton("/");
        Program program = new Program();
        botao.addActionListener(program);
        botao.setBounds(0, 100, 50, 50);
        botao1.addActionListener(program);
        botao1.setBounds(50, 100, 50, 50);
        botao2.addActionListener(program);
        botao2.setBounds(100, 100, 50, 50);
        botao3.addActionListener(program);
        botao3.setBounds(150, 100, 50, 50);
        botao4.addActionListener(program);
        botao4.setBounds(0, 150, 50, 50);
        botao5.addActionListener(program);
        botao5.setBounds(50, 150, 50, 50);
        botao6.addActionListener(program);
        botao6.setBounds(100, 150, 50, 50);
        botao7.addActionListener(program);
        botao7.setBounds(150, 150, 50, 50);
        botao10.addActionListener(program);
        botao10.setBounds(150, 200, 50, 50);
        botao8.addActionListener(program);
        botao8.setBounds(0, 200, 50, 50);
        botao9.addActionListener(program);
        botao9.setBounds(50, 200, 100, 50);
        botao_del.addActionListener(program);
        botao_del.setBounds(220, 100, 100, 50);
        botao_plus.addActionListener(program);
        botao_plus.setBounds(220, 150, 100, 50);
        botao_equal.addActionListener(program);
        botao_equal.setBounds(120, 300, 100, 50);
        botao_multi.addActionListener(program);
        botao_multi.setBounds(220, 250, 100, 50);
        botao_divi.addActionListener(program);
        botao_divi.setBounds(220, 300, 100, 50);
        botao_minus.addActionListener(program);
        botao_minus.setBounds(220, 200, 100, 50);
        frame.setLayout(null);
        frame.add(botao);
        frame.add(botao1);
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);
        frame.add(botao5);
        frame.add(botao6);
        frame.add(botao7);
        frame.add(botao8);
        frame.add(botao9);
        frame.add(botao10);
        frame.add(botao_del);
        frame.add(botao_plus);
        frame.add(botao_equal);
        frame.add(botao_minus);
        frame.add(botao_multi);
        frame.add(botao_divi);
        frame.add(visor);
        frame.setVisible(true);
        frame.setSize(320, 380);
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==botao){
            if (expressao.length() <= 18){
                expressao += "1";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao1){
            if (expressao.length() <= 18){
                expressao += "2";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao2){
            if (expressao.length() <= 18){
                expressao += "3";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao3){
            if (expressao.length() <= 18){
                expressao += "4";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao4){
            if (expressao.length() <= 18){
                expressao += "5";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao5){
            if (expressao.length() <= 18){
                expressao += "6";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao6){
            if (expressao.length() <= 18){
                expressao += "7";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao7){
            if (expressao.length() <= 18){
                expressao += "8";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao8){
            if (expressao.length() <= 18){
                expressao += "9";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao9){
            if (expressao.length() <= 18){
                expressao += "0";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao10){
            if (expressao.length() <= 18){
                expressao += ".";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_del){
            expressao = "";
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_plus){
            if (expressao.length() <= 18){
                expressao += " + ";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_minus){
            if (expressao.length() <= 18){
                expressao += " - ";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_multi){
            if (expressao.length() <= 18){
                expressao += " * ";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_divi){
            if (expressao.length() <= 18){
                expressao += " / ";
            }
            visor.setText(expressao);
        }
        else if (e.getSource()==botao_equal){
            try {
                Expression formula = new ExpressionBuilder(expressao).build();
                resultado = formula.evaluate();
            }
            catch (Exception ex){
                visor.setText("Expressão mal formatada");
            }
            resultado_string = String.valueOf(resultado);
            visor.setText(resultado_string);
            expressao = String.valueOf(resultado);
        }
    }
}