package org.nlt.view;

public class CalculaterFrame extends javax.swing.JFrame {

    private String firstNo;
    private String Operator;
   
   
    

    public CalculaterFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numberTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        acButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        powButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        pluseButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        sqrButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        pluseMinusButton = new javax.swing.JButton();
        doublezeroButton = new javax.swing.JButton();
        perButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        numberTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numberTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(numberTextField);

        getContentPane().add(jPanel1);

        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        acButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        acButton.setText("AC");
        acButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acButtonActionPerformed(evt);
            }
        });
        jPanel2.add(acButton);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);

        powButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        powButton.setText("POWER");
        powButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powButtonActionPerformed(evt);
            }
        });
        jPanel2.add(powButton);

        divButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });
        jPanel2.add(divButton);

        getContentPane().add(jPanel2);

        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        nineButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nineButton);

        eightButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        jPanel3.add(eightButton);

        sevenButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sevenButton);

        mulButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mulButton.setText("*");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });
        jPanel3.add(mulButton);

        getContentPane().add(jPanel3);

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        sixButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        jPanel4.add(sixButton);

        fiveButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fiveButton);

        fourButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fourButton);

        minusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        jPanel4.add(minusButton);

        getContentPane().add(jPanel4);

        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        threeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(threeButton);

        twoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        jPanel5.add(twoButton);

        oneButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel5.add(oneButton);

        pluseButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pluseButton.setText("+");
        pluseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluseButtonActionPerformed(evt);
            }
        });
        jPanel5.add(pluseButton);

        getContentPane().add(jPanel5);

        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        sqrButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sqrButton.setText("SQR");
        sqrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrButtonActionPerformed(evt);
            }
        });
        jPanel6.add(sqrButton);

        sqrtButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sqrtButton.setText("SQRT");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });
        jPanel6.add(sqrtButton);

        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel6.add(zeroButton);

        equalButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        jPanel6.add(equalButton);

        getContentPane().add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        pluseMinusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pluseMinusButton.setText("+/-");
        pluseMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluseMinusButtonActionPerformed(evt);
            }
        });
        jPanel7.add(pluseMinusButton);

        doublezeroButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        doublezeroButton.setText("00");
        doublezeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublezeroButtonActionPerformed(evt);
            }
        });
        jPanel7.add(doublezeroButton);

        perButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        perButton.setText("%");
        perButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perButtonActionPerformed(evt);
            }
        });
        jPanel7.add(perButton);

        dotButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });
        jPanel7.add(dotButton);

        getContentPane().add(jPanel7);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        //System.out.println(evt.getActionCommand());
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_sixButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_nineButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_eightButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        if (Operator != null)
        {
        String secondNo = numberTextField.getText();
            switch (Operator) {
                case "+":
                    try {
                        numberTextField.setText(Integer.parseInt(firstNo) + Integer.parseInt(secondNo) + "");
                    } catch (NumberFormatException ex) {
                        numberTextField.setText(Float.parseFloat(firstNo) + Float.parseFloat(secondNo) + "");
                    }
                    break;
                case "-":
                    try {
                        numberTextField.setText(Integer.parseInt(firstNo) - Integer.parseInt(secondNo) + "");
                    } catch (NumberFormatException ex) {
                        numberTextField.setText(Float.parseFloat(firstNo) - Float.parseFloat(secondNo) + "");
                    }
                    break;
                case "*":
                    try {
                        numberTextField.setText(Integer.parseInt(firstNo) * Integer.parseInt(secondNo) + "");
                    } catch (NumberFormatException ex) {
                        numberTextField.setText(Float.parseFloat(firstNo) + Float.parseFloat(secondNo) + "");
                    }
                    break;
                case "/":
                    try {
                        numberTextField.setText(Integer.parseInt(firstNo) / Integer.parseInt(secondNo) + "");
                    } catch (NumberFormatException ex) {
                        numberTextField.setText(Float.parseFloat(firstNo) / Float.parseFloat(secondNo) + "");
                    }
                    break;
                case "POW":
                    try{
                        numberTextField.setText(Math.pow(Integer.parseInt(firstNo) , Integer.parseInt(secondNo)) + "");
                    } catch (NumberFormatException ex) 
                    {
                        numberTextField.setText(Math.pow(Float.parseFloat(firstNo) , Float.parseFloat(secondNo)) + "");
                    }
                    break;
               
            }///switch case close
            Operator = null;
            }//if close
    }//GEN-LAST:event_equalButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        String number = numberTextField.getText();
        if (!number.equals("0")) {
            setNumber(evt.getActionCommand());
    }//GEN-LAST:event_zeroButtonActionPerformed
    }
    private void doublezeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublezeroButtonActionPerformed
        String number = numberTextField.getText();
        if (number.isEmpty()) {
            setNumber("0");
        } else if (number.equals("0")) {

        } else {
            setNumber(evt.getActionCommand());
        }

    }//GEN-LAST:event_doublezeroButtonActionPerformed

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        String number = numberTextField.getText();
        if (number.isEmpty()) {
            setNumber(evt.getActionCommand());
        } else if (!number.contains(".")) {
            setNumber(evt.getActionCommand());

        }

        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_dotButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void pluseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pluseButtonActionPerformed
        setOperator(evt.getActionCommand());

    }//GEN-LAST:event_pluseButtonActionPerformed

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtButtonActionPerformed
        String number = numberTextField.getText();
        if (!number.isEmpty()) {
            try {
                long num = Long.parseLong(number);
                numberTextField.setText(Math.sqrt(num) + "");
            } catch (NumberFormatException ex) {
                float num = Float.parseFloat(number);
                numberTextField.setText(Math.sqrt(num) + "");

            }
        }
    }//GEN-LAST:event_sqrtButtonActionPerformed

    private void powButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powButtonActionPerformed
        setOperator(evt.getActionCommand());
    }//GEN-LAST:event_powButtonActionPerformed

    private void pluseMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pluseMinusButtonActionPerformed
        String number = numberTextField.getText();
        if (!number.isEmpty()) {
            try {
                long num = Long.parseLong(number);
                num = num * -1;
                numberTextField.setText(num + "");
            } catch (NumberFormatException ex) {
                float num = Float.parseFloat(number);
                num = num * -1;
                numberTextField.setText(num + "");
            }
        }
    }//GEN-LAST:event_pluseMinusButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        String number = numberTextField.getText();
        if (!number.isEmpty()) {
            System.out.println(number.length());
            number = number.substring(0, number.length() - 1);
            numberTextField.setText(number);

        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void sqrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrButtonActionPerformed
        String number = numberTextField.getText();
        if (!number.isEmpty()) {
            try {
                long num = Long.parseLong(number);
                numberTextField.setText(Math.sqrt(num) + "");
            } catch (NumberFormatException ex) {
                float num = Float.parseFloat(number);
                numberTextField.setText(Math.sqrt(num) + "");
            }
            }
    }//GEN-LAST:event_sqrButtonActionPerformed

    private void acButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acButtonActionPerformed
        
        numberTextField.setText("");
        firstNo = null;
        Operator = null;

    }//GEN-LAST:event_acButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        setNumber(evt.getActionCommand());
    }//GEN-LAST:event_fourButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
         setOperator(evt.getActionCommand());
    }//GEN-LAST:event_divButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
         setOperator(evt.getActionCommand());
    }//GEN-LAST:event_minusButtonActionPerformed

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButtonActionPerformed
          setOperator(evt.getActionCommand());
    }//GEN-LAST:event_mulButtonActionPerformed

    private void perButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perButtonActionPerformed
         setOperator(evt.getActionCommand());
    }//GEN-LAST:event_perButtonActionPerformed
    private void setNumber(String no) {
        String number = numberTextField.getText();

        if (number.equals("0")) 
        {
            numberTextField.setText(no);
        } else if (number.length() <= 10)
        {
           numberTextField.setText(numberTextField.getText()+no);
        }
        }
    private void setOperator(String op)
    {
       if(!numberTextField.getText().isEmpty())
        {
            Operator = op;
            firstNo = numberTextField.getText();
            numberTextField.setText("");

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton doublezeroButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton perButton;
    private javax.swing.JButton pluseButton;
    private javax.swing.JButton pluseMinusButton;
    private javax.swing.JButton powButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton sqrButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

}
