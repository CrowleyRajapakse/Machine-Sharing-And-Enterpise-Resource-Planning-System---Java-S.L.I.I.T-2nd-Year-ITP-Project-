/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voguetexmachinesharing.managementsystem;

/**
 *
 * @author Sampath Rajapakse
 */
import EmployeeManagement.Employee;
import EmployeeManagement.EmployeeInfo;
import StockManagement.StockManagement;
import AccountManagement.AccountManimenu;
import EventHandling.EventHandling;
import Maintenance.Maintenance;
import QualityCheckingAndReturnGoodsHadling.DataMenu;
import StylePlanningAndResourceAllocation.ModuleMainMenu;
import Transportation.TransportationModuleMainMenu;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import sales.management.NewJInternalFrame;
public class InternalHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalHome
     */
    Employee emp;
    public InternalHome(Employee empN) {
        initComponents();
        this.emp=empN;
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnStylePlanningAllocationModule = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        btnStylePlanningAllocationModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/StylePlanning.png"))); // NOI18N
        btnStylePlanningAllocationModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStylePlanningAllocationModuleActionPerformed(evt);
            }
        });
        jPanel2.add(btnStylePlanningAllocationModule);
        btnStylePlanningAllocationModule.setBounds(430, 50, 220, 190);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/SalesManagement.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(170, 50, 220, 190);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/quality checking.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(690, 50, 230, 190);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/accounts.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(970, 50, 240, 190);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/maintenance.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(820, 290, 230, 220);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/storesmanagement.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(550, 290, 220, 220);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/transport.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(300, 290, 220, 220);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/event.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(1090, 290, 230, 220);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITP Icons/hr.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 290, 240, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ITPBACKGROUND.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-10, 0, 1470, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStylePlanningAllocationModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStylePlanningAllocationModuleActionPerformed
        if (emp.getDepartment().equals("Style Planning Dept") || emp.getDesignation().equals("System Administrator")) {
            ModuleMainMenu mmm = new ModuleMainMenu();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.removeAll();
            desktopPane.add(mmm).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_btnStylePlanningAllocationModuleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if (emp.getDepartment().equals("Account Department") || emp.getDesignation().equals("System Administrator")) {
        AccountManimenu mmm = new AccountManimenu();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.removeAll();
            desktopPane.add(mmm).setVisible(true);
            } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (emp.getDepartment().equals("Maintenance Department") || emp.getDesignation().equals("System Administrator")) {
            Maintenance mmm = new Maintenance();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.removeAll();
            desktopPane.add(mmm).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
        //raw
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (emp.getDepartment().equals("Stock Dept") || emp.getDesignation().equals("System Administrator")) {
        StockManagement sm=new StockManagement();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.removeAll();
        desktopPane.add(sm).setVisible(true);
        //Raw Material and Supplier Management
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (emp.getDepartment().equals("Human Resource Department") || emp.getDesignation().equals("System Administrator")) {
        EmployeeInfo ei=new EmployeeInfo(emp);
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.removeAll();
        desktopPane.add(ei).setVisible(true);
         } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (emp.getDepartment().equals("Return good handling & quality checking") || emp.getDesignation().equals("System Administrator")) {
        DataMenu ei=new DataMenu();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.removeAll();
        desktopPane.add(ei).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (emp.getDepartment().equals("Transpotation Management") || emp.getDesignation().equals("System Administrator")) {
            TransportationModuleMainMenu mmm = new TransportationModuleMainMenu();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.removeAll();
            desktopPane.add(mmm).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        EventHandling sm=new EventHandling();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.removeAll();
        desktopPane.add(sm).setVisible(true);
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (emp.getDepartment().equals("Sales Management") || emp.getDesignation().equals("System Administrator")) {
            NewJInternalFrame mmm = new NewJInternalFrame();
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.removeAll();
            desktopPane.add(mmm).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You Are Not Authorized to enter !!!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStylePlanningAllocationModule;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
