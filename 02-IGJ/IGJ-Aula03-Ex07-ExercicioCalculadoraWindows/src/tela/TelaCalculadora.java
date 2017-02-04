/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class TelaCalculadora {

    static double a, b, resultado;
    static int sinal, trava;

    public static void main(String[] args) {

        JFrame frmJanela = new JFrame();               //lin,col
        JPanel pnlPainelMestre = new JPanel(new BorderLayout());
        JPanel pnlPainelCalc = new JPanel(new GridLayout(4, 4));

        JTextField txtDisplay = new JTextField();
        txtDisplay.setSize(new Dimension(50000, 130));

        JButton btn07 = new JButton("7");
        JButton btn08 = new JButton("8");
        JButton btn09 = new JButton("9");
        JButton btnMais = new JButton("+");
        JButton btn04 = new JButton("4");
        JButton btn05 = new JButton("5");
        JButton btn06 = new JButton("6");
        JButton btnMenos = new JButton("-");
        JButton btn01 = new JButton("1");
        JButton btn02 = new JButton("2");
        JButton btn03 = new JButton("3");
        JButton btnVezes = new JButton("*");
        JButton btnPonto = new JButton(".");
        JButton btn0 = new JButton("0");
        JButton btnCE = new JButton("CE");
        JButton btnDividir = new JButton("/");
        JButton btnCalcular = new JButton("=");
        btnCalcular.setSize(new Dimension(100, 200));

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

               

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "0");

            }
        });

        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "1");
            }
        });

        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "2");

            }
        });

        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "3");

            }
        });

        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "4");

            }
        });

        btn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                
                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "5");

            }
        });

        btn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                
                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "6");

            }
        });

        btn07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

               
                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "7");

            }
        });

        btn08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                
                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "8");

            }
        });

        btn09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (sinal == 5) {
                    txtDisplay.setText("");
                    sinal = 0;
                }

                

                txtDisplay.getText();
                txtDisplay.setText(txtDisplay.getText() + "9");

            }
        });

        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sinal = 1;
                a = Double.valueOf(txtDisplay.getText());
                btnMais.setEnabled(false);
                btnMenos.setEnabled(false);
                btnVezes.setEnabled(false);
                btnDividir.setEnabled(false);
                //txtDisplay.setText(txtDisplay.getText() + "+");
                txtDisplay.setText("");
                //System.out.println("sinal " + sinal + " a " + a);

            }
        });

        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sinal = 2;
                a = Double.valueOf(txtDisplay.getText());
                btnMais.setEnabled(false);
                btnMenos.setEnabled(false);
                btnVezes.setEnabled(false);
                btnDividir.setEnabled(false);
                txtDisplay.setText("");

                //txtDisplay.setText(txtDisplay.getText() + "-");
            }
        });

        btnVezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sinal = 3;
                a = Double.valueOf(txtDisplay.getText());
                btnMenos.setEnabled(false);
                btnVezes.setEnabled(false);
                btnMais.setEnabled(false);
                btnDividir.setEnabled(false);

                txtDisplay.setText("");
                //txtDisplay.setText(txtDisplay.getText() + "*");

            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sinal = 4;
                a = Double.valueOf(txtDisplay.getText());
                btnMenos.setEnabled(false);
                btnVezes.setEnabled(false);
                btnDividir.setEnabled(false);
                btnMais.setEnabled(false);

                txtDisplay.setText("");
                //txtDisplay.setText(txtDisplay.getText() + "/");

            }
        });

        btnPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnPonto.setEnabled(false);
                txtDisplay.setText(txtDisplay.getText() + ".");

            }
        });

        btnCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //txtDisplay.getText();
                txtDisplay.setText("");

            }
        });

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b = Double.valueOf(txtDisplay.getText());
                switch (sinal) {
                    case 1:
                        resultado = a + b;
                        break;
                    case 2:
                        resultado = a - b;
                        break;
                    case 3:
                        resultado = a * b;
                        break;
                    case 4:
                        resultado = a / b;
                        break;

                }

                sinal = 5;

                btnMenos.setEnabled(true);
                btnVezes.setEnabled(true);
                btnDividir.setEnabled(true);
                btnMais.setEnabled(true);

                System.out.println("a " + a + " b " + b + " resultado " + resultado);
                //txtDisplay.setText("");
                txtDisplay.setText(String.valueOf(resultado));

            }
        });

        pnlPainelMestre.add(txtDisplay, BorderLayout.NORTH);
        pnlPainelCalc.add(btn07);
        pnlPainelCalc.add(btn08);
        pnlPainelCalc.add(btn09);
        pnlPainelCalc.add(btnMais);
        pnlPainelCalc.add(btn04);
        pnlPainelCalc.add(btn05);
        pnlPainelCalc.add(btn06);
        pnlPainelCalc.add(btnMenos);
        pnlPainelCalc.add(btn01);
        pnlPainelCalc.add(btn02);
        pnlPainelCalc.add(btn03);
        pnlPainelCalc.add(btnVezes);
        pnlPainelCalc.add(btnPonto);
        pnlPainelCalc.add(btn0);
        pnlPainelCalc.add(btnCE);
        pnlPainelCalc.add(btnDividir);

        frmJanela.add(pnlPainelMestre);
        pnlPainelMestre.add(pnlPainelCalc, BorderLayout.CENTER);
        pnlPainelMestre.add(btnCalcular, BorderLayout.SOUTH);
        frmJanela.setVisible(true);
        frmJanela.setSize(250, 250);
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
