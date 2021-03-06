/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;


import java.awt.Color;


/**
 *
 * @author owner
 */
public class BankAppFrame extends javax.swing.JFrame {
    
    private static ListOfAccounts list;

    /**
     * Creates new form BankAppFrame
     * @param l is the initial account list
     */
    public BankAppFrame(ListOfAccounts l) {
        initComponents();
        BankAppFrame.list = l;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("collapsed")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        listLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        //Create several checking and savings accounts         CheckingAccount check = new CheckingAccount("Checking", 100000);         CheckingAccount spending = new CheckingAccount("Spending Money", 123423.20);         CheckingAccount groceries = new CheckingAccount("Grocery Fund", 1000);         CheckingAccount holiday = new CheckingAccount("Holiday Fund", 7823432.90);         SavingsAccount college = new SavingsAccount("College Savings", 80903.35);         SavingsAccount mortgage = new SavingsAccount("Mortgage Savings", 1234);         SavingsAccount business = new SavingsAccount("Business Savings", 8934.90);         SavingsAccount insurance = new SavingsAccount("insurance Savings", 8032423);          ListOfAccounts listy = new ListOfAccounts();         //Populate the list         listy.addAccount(check);         listy.addAccount(spending);         listy.addAccount(groceries);         listy.addAccount(holiday);         listy.addAccount(college);         listy.addAccount(mortgage);         listy.addAccount(business);         listy.addAccount(insurance);
        nameListDisplay = new javax.swing.JTextArea();
        displayCheckingAccounts = new javax.swing.JButton();
        displaySavingsAccounts = new javax.swing.JButton();
        displayAllAccounts = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        //Create several checking and savings accounts         CheckingAccount check = new CheckingAccount("Checking", 100000);         CheckingAccount spending = new CheckingAccount("Spending Money", 123423.20);         CheckingAccount groceries = new CheckingAccount("Grocery Fund", 1000);         CheckingAccount holiday = new CheckingAccount("Holiday Fund", 7823432.90);         SavingsAccount college = new SavingsAccount("College Savings", 80903.35);         SavingsAccount mortgage = new SavingsAccount("Mortgage Savings", 1234);         SavingsAccount business = new SavingsAccount("Business Savings", 8934.90);         SavingsAccount insurance = new SavingsAccount("insurance Savings", 8032423);          ListOfAccounts listy = new ListOfAccounts();         //Populate the list         listy.addAccount(check);         listy.addAccount(spending);         listy.addAccount(groceries);         listy.addAccount(holiday);         listy.addAccount(college);         listy.addAccount(mortgage);         listy.addAccount(business);         listy.addAccount(insurance);
        balanceDisplay = new javax.swing.JTextArea();
        managePanel = new javax.swing.JPanel();
        manageLabel = new javax.swing.JLabel();
        selectField = new javax.swing.JTextField();
        deleteField = new javax.swing.JTextField();
        initNameField = new javax.swing.JTextField();

        selectButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addChecking = new javax.swing.JButton();
        initBalanceField = new javax.swing.JTextField();
        addSavings = new javax.swing.JButton();
        selectedAccountPanel = new javax.swing.JPanel();
        selectedLabel = new javax.swing.JLabel();
        accountNameLabel = new javax.swing.JLabel();
        accountBalanceLabel = new javax.swing.JLabel();
        withdrawField = new javax.swing.JTextField();
        depositField = new javax.swing.JTextField();
        withdrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        selectedAccountNameField = new javax.swing.JFormattedTextField();
        selectedAccountBalanceField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Lobster Two", 3, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Banking Application");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        listPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listLabel.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("Account List");

        nameListDisplay.setEditable(false);
        nameListDisplay.setColumns(8);
        nameListDisplay.setRows(5);
        nameListDisplay.setAutoscrolls(false);
        nameListDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(nameListDisplay);

        displayCheckingAccounts.setBackground(Color.CYAN);
        displayCheckingAccounts.setText("Show Checking");
        displayCheckingAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCheckingAccountsActionPerformed(evt);
            }
        });

        displaySavingsAccounts.setBackground(Color.YELLOW);
        displaySavingsAccounts.setText("Show Savings");
        displaySavingsAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySavingsAccountsActionPerformed(evt);
            }
        });

        displayAllAccounts.setBackground(Color.LIGHT_GRAY);
        displayAllAccounts.setText("Show All Accounts");
        displayAllAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllAccountsActionPerformed(evt);
            }
        });

        balanceDisplay.setEditable(false);
        balanceDisplay.setColumns(8);
        balanceDisplay.setRows(5);
        balanceDisplay.setAutoscrolls(false);
        jScrollPane3.setViewportView(balanceDisplay);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayAllAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addComponent(displayCheckingAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displaySavingsAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCheckingAccounts)
                    .addComponent(displaySavingsAccounts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayAllAccounts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        managePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        manageLabel.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        manageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageLabel.setText("Manage Accounts");

        selectField.setBackground(new java.awt.Color(153, 255, 153));
        selectField.setText("Select account name here");
        selectField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFieldMouseClicked(evt);
            }
        });

        deleteField.setBackground(new java.awt.Color(255, 102, 102));
        deleteField.setText("Delete account here");
        deleteField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteFieldMouseClicked(evt);
            }
        });

        initNameField.setBackground(new java.awt.Color(153, 255, 255));
        initNameField.setText("Enter new  account name");
        initNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                initNameFieldMouseClicked(evt);
            }
        });

        selectButton.setBackground(Color.GREEN);
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(Color.RED);
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addChecking.setBackground(Color.CYAN);
        addChecking.setText("New Checking");
        addChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckingActionPerformed(evt);
            }
        });

        initBalanceField.setBackground(new java.awt.Color(255, 255, 153));
        initBalanceField.setText("Enter initial balance");
        initBalanceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                initBalanceFieldMouseClicked(evt);
            }
        });

        addSavings.setBackground(Color.YELLOW);
        addSavings.setText("New Savings");
        addSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSavingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(manageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectField)
                            .addComponent(deleteField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(initNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(addChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addSavings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(initBalanceField))))
                .addContainerGap())
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addGap(18, 18, 18)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSavings)
                    .addComponent(addChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        selectedAccountPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectedLabel.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        selectedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedLabel.setText("Selected Account");

        accountNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountNameLabel.setText("Account Name");

        accountBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountBalanceLabel.setText("Balance");

        withdrawField.setBackground(new java.awt.Color(255, 204, 102));

        depositField.setBackground(new java.awt.Color(255, 102, 255));

        withdrawButton.setBackground(Color.ORANGE);
        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(Color.MAGENTA);
        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        selectedAccountNameField.setEditable(false);
        selectedAccountNameField.setBackground(new java.awt.Color(255, 255, 255));
        selectedAccountNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        selectedAccountBalanceField.setEditable(false);
        selectedAccountBalanceField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout selectedAccountPanelLayout = new javax.swing.GroupLayout(selectedAccountPanel);
        selectedAccountPanel.setLayout(selectedAccountPanelLayout);
        selectedAccountPanelLayout.setHorizontalGroup(
            selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAccountPanelLayout.createSequentialGroup()
                .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectedAccountPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(selectedAccountPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(depositField)
                            .addComponent(withdrawField)
                            .addComponent(selectedAccountNameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedAccountBalanceField)
                            .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        selectedAccountPanelLayout.setVerticalGroup(
            selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountBalanceLabel))
                .addGap(18, 18, 18)
                .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedAccountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedAccountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawButton))
                .addGap(18, 18, 18)
                .addGroup(selectedAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(managePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(managePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectedAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Withdraws the input from withdrawField to the selected accounts balance
     * @param evt 
     */
    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        String input = withdrawField.getText();
        Account a = list.getSelected();
        a.withdraw(input);
        if(list.isAllMode()){
            displayAllAccounts.doClick();
        }
        else if(list.isCheckingMode() 
                && a.isChecking()){
            displayCheckingAccounts.doClick();
        }
        else if(list.isSavingsMode() 
                && a.isSavings()){
            displaySavingsAccounts.doClick();
        }
        selectField.setText(a.getAccountName());
        selectButton.doClick();
        withdrawField.setText("");
    }//GEN-LAST:event_withdrawButtonActionPerformed

    /**
     * Selects the correct account and send text to appropriate spots.
     * @param evt 
     */
    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        String input = selectField.getText();
        list.selectAccount(input);
        Account a = list.getSelected();
        selectedAccountNameField.setText(a.getAccountName());
        selectedAccountBalanceField.setText(a.cashString());
        selectField.setText("");
    }//GEN-LAST:event_selectButtonActionPerformed

    /**
     * Deposits money to the selected account
     * @param evt 
     */
    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        String input = depositField.getText();
        Account a = list.getSelected();
        a.deposit(input);
        if(list.isAllMode()){
            displayAllAccounts.doClick();
        }
        else if(list.isCheckingMode() 
                && a.isChecking()){
            displayCheckingAccounts.doClick();
        }
        else if(list.isSavingsMode() 
                && a.isSavings()){
            displaySavingsAccounts.doClick();
        }
        selectField.setText(a.getAccountName());
        selectButton.doClick();
        depositField.setText("");
    }//GEN-LAST:event_depositButtonActionPerformed

    /**
     * Creates a new CheckingAccount and updates the display
     * @param evt 
     */
    private void addCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckingActionPerformed
        String inputName = initNameField.getText();
        double inputBal = Double.parseDouble(initBalanceField.getText());
        CheckingAccount c = new CheckingAccount(inputName, inputBal);
        list.addAccount(c);
        if(list.isAllMode()){
            nameListDisplay.append(c.getCheckingAccountName());
            balanceDisplay.append(c.cashString());
            displayAllAccounts.doClick();
        }
        else if(list.isCheckingMode()){
            nameListDisplay.append(c.getCheckingAccountName());
            balanceDisplay.append(c.cashString());
            displayCheckingAccounts.doClick();
        }
        initNameField.setText("");
        initBalanceField.setText("");
    }//GEN-LAST:event_addCheckingActionPerformed

    /**
     * Deletes the input account and updates the display
     * @param evt 
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String input = deleteField.getText();
        Account d = list.getAccount(input);
        list.deleteAccount(d);
        if(d.isSelected()){
            selectedAccountNameField.setText("");
            selectedAccountBalanceField.setText("");
        }
        deleteField.setText("");
        if(list.isAllMode()){
            displayAllAccounts.doClick();
        }
        if(list.isCheckingMode() && d.isChecking()){
            displayCheckingAccounts.doClick();
        }
        if(list.isSavingsMode() && d.isSavings()){
            displaySavingsAccounts.doClick();
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * Displays only the checkingAccounts
     * @param evt 
     */
    private void displayCheckingAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCheckingAccountsActionPerformed
        list.checkingModeOn();
        list.savingsModeOff();
        list.allModeOff();
        nameListDisplay.setText(list.getCheckingAccounts().nameToString());
        balanceDisplay.setText(list.getCheckingAccounts().balsToString());
    }//GEN-LAST:event_displayCheckingAccountsActionPerformed

    /**
     * Adds a savingsAcount and updates display
     * @param evt 
     */
    private void addSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSavingsActionPerformed
        String inputName = initNameField.getText();
        double inputBal = Double.parseDouble(initBalanceField.getText());
        SavingsAccount c = new SavingsAccount(inputName, inputBal);
        list.addAccount(c);
        if(list.isAllMode()){
            nameListDisplay.append(c.getSavingsAccountName());
            balanceDisplay.append(c.cashString());
            displayAllAccounts.doClick();
        }
        else if(list.isSavingsMode()){
            nameListDisplay.append(c.getSavingsAccountName());
            balanceDisplay.append(c.cashString());
            displaySavingsAccounts.doClick();
        }
        initNameField.setText("");
        initBalanceField.setText("");
    }//GEN-LAST:event_addSavingsActionPerformed

    /**
     * Displays only the savings accounts
     * @param evt 
     */
    private void displaySavingsAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySavingsAccountsActionPerformed
        list.savingsModeOn();
        list.checkingModeOff();
        list.allModeOff();
        nameListDisplay.setText(list.getSavingsAccounts().nameToString());
        balanceDisplay.setText(list.getSavingsAccounts().balsToString());
    }//GEN-LAST:event_displaySavingsAccountsActionPerformed

    /**
     * Displays all accounts
     * @param evt 
     */
    private void displayAllAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllAccountsActionPerformed
        list.allModeOn();
        list.checkingModeOff();
        list.savingsModeOff();
        nameListDisplay.setText(list.nameToString());
        balanceDisplay.setText(list.balsToString());
    }//GEN-LAST:event_displayAllAccountsActionPerformed

    /**
     * Sets the field to empty upon click
     * @param evt 
     */
    private void initNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_initNameFieldMouseClicked
        initNameField.setText("");
    }//GEN-LAST:event_initNameFieldMouseClicked

    /**
     * Sets the field to empty upon click
     * @param evt 
     */
    private void initBalanceFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_initBalanceFieldMouseClicked
        initBalanceField.setText("");
    }//GEN-LAST:event_initBalanceFieldMouseClicked

    /**
     * Sets the field to empty upon click
     * @param evt 
     */
    private void deleteFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteFieldMouseClicked
        deleteField.setText("");
    }//GEN-LAST:event_deleteFieldMouseClicked

    /**
     * Sets the field to empty upon click
     * @param evt 
     */
    private void selectFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFieldMouseClicked
        selectField.setText("");
    }//GEN-LAST:event_selectFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BankAppFrame(list).setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountBalanceLabel;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JButton addChecking;
    private javax.swing.JButton addSavings;
    private javax.swing.JTextArea balanceDisplay;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField deleteField;
    private javax.swing.JButton depositButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JButton displayAllAccounts;
    private javax.swing.JButton displayCheckingAccounts;
    private javax.swing.JButton displaySavingsAccounts;
    private javax.swing.JTextField initBalanceField;
    private javax.swing.JTextField initNameField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel listLabel;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel manageLabel;
    private javax.swing.JPanel managePanel;
    private javax.swing.JTextArea nameListDisplay;
    private javax.swing.JButton selectButton;
    private javax.swing.JTextField selectField;
    private javax.swing.JFormattedTextField selectedAccountBalanceField;
    private javax.swing.JFormattedTextField selectedAccountNameField;
    private javax.swing.JPanel selectedAccountPanel;
    private javax.swing.JLabel selectedLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JTextField withdrawField;
    // End of variables declaration//GEN-END:variables
}
