/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conversor.HorasParaString;
import conversor.TimeToEnglish;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tailaneb
 */
public class Main {

    /* Questao 7
       criada a variável clicked para controlar a mudança
       de idioma quando o botao "Mudar Idioma" for pressionado
     */
    static boolean clicked = true;

    /* OPCIONAL
        criada a variável enable para controlar quando o botao
        "habilitar" for pressionado, mudar o nome dele para 
        "desabilitar" e vice-versa.
     */
    static boolean enable = true;

    /* OPCIONAL
      as variáveis mensagens, e horario foram criadas para facilitar o tramite 
      das mensagens retornadas pelo método saudar
      que como melhoria está sendo verificado em mais de um lugar.
     */
    static String mensagem;
    static int horario;
    
    /*OPCIONAL
      hh e mm usadas para controlar o retorno do método substring para o horario
    */
    static int hh, mm;

    public static void main(String[] args) {
        /* Questao 6
          fazendo instancia da classe Saudacao, para chamar
          o método saudar() dentro da açao do btn3
         */
        Saudacao sd = new Saudacao();
        HorasParaString hs = new HorasParaString();
        TimeToEnglish te = new TimeToEnglish();
        
        JFrame janela = new JFrame("Questão 1");

        /* Questao 1
          Trocado o null e criado um objeto do tipo BorderLayout.
         */
        //BorderLayout bdrLayout = null;
        BorderLayout bdrLayout = new BorderLayout();

        JPanel mainPanel = new JPanel(bdrLayout);
        JPanel painel = new JPanel();
        JTextField caixa1 = new JTextField(25);

        JLabel labelCaixa1 = new JLabel("Label 1");
        labelCaixa1.setForeground(Color.black);
        
        /* OPCIONAL
          criadas txtHorario, e lblLinguagem para mostrar
          o horario em string quando digitado um horario
          e mostrar a respectiva lingua quando o btn "Mudar Idioma"
          for pressionado
        */
        JTextArea txtHorario = new JTextArea(10,25);
        JLabel lblLinguagem = new JLabel("pt_BR");
        
        JButton btn1 = new JButton("Vermelho");
        JButton btn2 = new JButton("Azul");
        JPanel panelBtn = new JPanel();

        /* Questao 3
           Adicionar 3 botoes com "Saudacao", "Habilitar",
           "Mudar Idioma"
            foi criado o painel 2 e adicionado a janela 
            com border layout centralizado
            foram criados os btn3, btn4 e btn5 e foram
            adicionados ao painel2.
         */
        JPanel painel2 = new JPanel();
        JButton btn3 = new JButton("Saudação");
        JButton btn4 = new JButton("Habilitar");
        JButton btn5 = new JButton("Mudar Idioma");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                /* Questao 2
                    Trocando a cor da janela conforme o botao
                    btn1 = vermelho
                 */
                mainPanel.setBackground(Color.red);
                painel.setBackground(Color.red);
                painel2.setBackground(Color.red);
                panelBtn.setBackground(Color.red);
                txtHorario.setBackground(Color.red);//tocando o txtHorario tbm
                labelCaixa1.setForeground(Color.yellow);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                /* Questao 2
                    Trocando a cor da janela conforme o botao
                    btn2 = azul
                 */
                mainPanel.setBackground(Color.BLUE);
                painel.setBackground(Color.BLUE);
                painel2.setBackground(Color.BLUE);
                panelBtn.setBackground(Color.BLUE);
                txtHorario.setBackground(Color.BLUE);//tocando o txtHorario tbm
                labelCaixa1.setForeground(Color.yellow);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                /* Questao 4
                    habilitando a propriedade edição da caixa de texto
                    quando btn4 for pressionado      
                 */
                /* OPCIONAL
                    apenas adicionei uma nova funcionalidade para o botao habilitar
                    se o botao estiver habilitado, mostrar como Desabilitado
                    e assim vice-versa, adicionando a internacionalizaçao também. 
                 */
                Locale brasil = new Locale("br", "BR");
                ResourceBundle tradBR = ResourceBundle.getBundle("linguas.MessagesBundle", brasil);
                Locale usa = new Locale("us", "US");
                ResourceBundle tradUS = ResourceBundle.getBundle("linguas.MessagesBundle", usa);

                if (enable) {//verifica se o botao habilitar foi pressionado
                    if (clicked) {//vefifica se o botao mudar idioma foi pressionado
                        //se sim, mudar idioma para BR
                        String txt2_btn4 = tradBR.getString("txt2_btn4");
                        btn4.setText(txt2_btn4);

                    } else {//se botao idioma nao foi pressionado
                        //se nao, mudar idioma para US
                        String txt2_btn4 = tradUS.getString("txt2_btn4");
                        btn4.setText(txt2_btn4);
                    }
                    //habilita a caixa1
                    caixa1.setEditable(true);
                    enable = false;

                } else { // se o botao habilitar nao foi pressionado
                    if (clicked) { // verifica se o botao mudar idioma foi pressionado
                        //se sim, muda idioma para BR
                        String txt2_btn4 = tradBR.getString("txt_btn4");
                        btn4.setText(txt2_btn4);

                    } else {//se botao mudar idioma nao foi pressionado
                        //se nao, muda idoma para US
                        String txt2_btn4 = tradUS.getString("txt_btn4");
                        btn4.setText(txt2_btn4);
                    }
                    //desabilita a caixa1
                    caixa1.setEditable(false);
                    enable = true;
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                /* Questao 6
                    trocando o texto da labelCaixa1 conforme horario
                    digitado em caixa1.
                 */
                /* OPCIONAL
                    adicionei o try/catch para fazer a validacao
                    da caixa1. Para evitar erro de 
                    StringIndexOutOfBoundsException
                 */
                Locale brasil = new Locale("br", "BR");
                ResourceBundle tradBR = ResourceBundle.getBundle("linguas.MessagesBundle", brasil);
                Locale usa = new Locale("us", "US");
                ResourceBundle tradUS = ResourceBundle.getBundle("linguas.MessagesBundle", usa);

                //tente pegar o texto digitado no caixa1
                try {
                    String texto = caixa1.getText();
                    int txt1 = texto.indexOf(":");
                    //pegue os primeiros dois digitos da hora digitada
                    String txtHora = texto.substring(0, txt1);
                    String txtMin = texto.substring(txt1+1,texto.length());
                    
                    //formata o horario tirando a hora e o minuto
                    hh = Integer.valueOf(txtHora);
                    mm = Integer.valueOf(txtMin);
                    
                    //formata o texto que vai aperecer no txtHorario
                    txtHorario.setFont(new Font("Calibri", Font.BOLD, 14));
                    txtHorario.setForeground(Color.BLACK);
                    
                    //convete para inteiro
                    horario = Integer.parseInt(txtHora);
                    
                    //verifico se o horario é menor que 0 ou maior que 23
                    if (horario < 0 || horario > 23) {

                        if (clicked) {
                            String msg_hh = tradBR.getString("msg_hh");
                            JOptionPane.showMessageDialog(null, msg_hh);
                        } else {
                            String msg_hh = tradUS.getString("msg_hh");
                            JOptionPane.showMessageDialog(null, msg_hh);
                        }
                    } else if (clicked == false) {//se o botao mudar idioma nao estiver ativo
                        //chama o metodo saudar2 e passe como linguagem US
                        mensagem = sd.saudar2(horario);
                        labelCaixa1.setText(mensagem);
                        //chama horario em ingles
                        txtHorario.setText(te.time(hh, mm));
                        
                    } else {
                        //chama o metodo saudar2 e passe como linguagem BR
                        mensagem = sd.saudar2(horario);
                        labelCaixa1.setText(mensagem);
                        //chama horario em portugues
                        txtHorario.setText(hs.horario(hh, mm));
                    }

                } catch (StringIndexOutOfBoundsException e) {//se nao conseguiu pegar o texto da caixa1

                    if (clicked) {//verifica se o botao mudar idioma foi clicado o idoma sera BR
                        /*
                            adicionei a internalizacao para a lblCaixa1, com
                            o JOptionPane
                         */

                        //pega a mensagem correspondente no documento de propriedades
                        String msg_jopBR = tradBR.getString("msg_jop");
                        //adiciona essa mensagem para uma janela de aviso
                        JOptionPane.showMessageDialog(null, msg_jopBR);

                    } else {//se o botao mudar idioma nao foi clicado o idioma será US

                        String msg_jop = tradUS.getString("msg_jop");
                        JOptionPane.showMessageDialog(null, msg_jop);

                    }

                }

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //clicked = true;

                /* Questao 7
                    criei o pacote Linguas com os arquivos "properties" de idiomas
                    ingles e portugues.
                    pressionando o btn5 as linguas vao mudar.
                 */
                
                if (clicked == false) {//se o botao idioma nao foi clicado o idoma sera BR
                    //identifica a linguagem numa lbl na tela
                    lblLinguagem.setText("pt_BR");
                    
                    clicked = true;
                    //troca automaticamente a linguagem do lblCaixa1
                    labelCaixa1.setText(sd.saudar2(horario));
                    //troca automaticamente a linguagem do txtHorario
                    txtHorario.setText(hs.horario(hh, mm));


                    Locale brasil = new Locale("br", "BR");
                    ResourceBundle tradBR = ResourceBundle.getBundle("linguas.MessagesBundle", brasil);
                    //troca o idioma dos botoes para BR
                    String btnBR01 = tradBR.getString("txt_btn1");
                    String btnBR02 = tradBR.getString("txt_btn2");
                    String btnBR03 = tradBR.getString("txt_btn3");
                    String btnBR04 = tradBR.getString("txt_btn4");
                    String btnBR05 = tradBR.getString("txt_btn5");
                    btn1.setText(btnBR01);
                    btn2.setText(btnBR02);
                    btn3.setText(btnBR03);
                    btn4.setText(btnBR04);
                    btn5.setText(btnBR05);

                } else {//se o botao idoma foi clicado o idioma será US
                    //identifica a linguagem numa lbl na tela
                    lblLinguagem.setText("en_US");
                    clicked = false;
                    //troca automaticamente a linguagem na lblCaixa1.
                    labelCaixa1.setText(sd.saudar2(horario));
                    //troca automaticamente a txtHorario
                    txtHorario.setText(te.time(hh, mm));

                    Locale usa = new Locale("us", "US");
                    ResourceBundle tradUS = ResourceBundle.getBundle("linguas.MessagesBundle", usa);
                    //troca o idioma dos botoes para US
                    
                    String btn01 = tradUS.getString("txt_btn1");
                    String btn02 = tradUS.getString("txt_btn2");
                    String btn03 = tradUS.getString("txt_btn3");
                    String btn04 = tradUS.getString("txt_btn4");
                    String btn05 = tradUS.getString("txt_btn5");
                    btn1.setText(btn01);
                    btn2.setText(btn02);
                    btn3.setText(btn03);
                    btn4.setText(btn04);
                    btn5.setText(btn05);

                    
                }

            }
        });

        /* Questao 4
           desabilitei a propriedade edição da caixa de texto
         */
        caixa1.setEditable(false);
        
        /*OPCIONAL
         como default desabilitei a txtHorario para apenas mostrar
         o horario em forma de string
        */
        txtHorario.setEditable(false);
        
        
        

        painel2.add(btn3);
        painel2.add(btn4);
        painel2.add(btn5);
        painel2.add(txtHorario);
        mainPanel.add(painel2, BorderLayout.CENTER);

        painel.add(lblLinguagem);
        painel.add(caixa1);
        painel.add(labelCaixa1);
        panelBtn.add(btn1);
        panelBtn.add(btn2);

        mainPanel.add(painel, BorderLayout.NORTH);
        mainPanel.add(panelBtn, BorderLayout.SOUTH);

        janela.setSize(new Dimension(450, 400));
        janela.add(mainPanel);

        /* Questao 1
          colocar visível a janela.
         */
        janela.setVisible(true);

        /* Questao 5
          Faça com que a janela não permita alterar o seu tamanho
         */
        janela.setResizable(false);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocation(100, 100);

    }
}
