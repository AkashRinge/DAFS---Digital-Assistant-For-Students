package dafs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joker96
 */
public class Notification extends javax.swing.JFrame {

    Student s;
    Timetable tt;
    
    public Notification() {
        
        
        try {
            FileInputStream f1 = new FileInputStream("data/student.ser");
            ObjectInputStream o1 = new ObjectInputStream(f1);
            s = (Student) o1.readObject();
            o1.close();
            f1.close();
            
            FileInputStream f2 = new FileInputStream("data/timetable.ser");
            ObjectInputStream o2 = new ObjectInputStream(f2);
            tt = (Timetable) o2.readObject();
            o2.close();
            f1.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Some Error occured, please try registering again");
        }
        
        initComponents();
        txtAmount.addMouseListener(new MouseAdapter(){
          @Override
            public void mouseClicked(MouseEvent e) {
            txtAmount.setText("");
            }
        });
        txtReason.addMouseListener(new MouseAdapter(){
          @Override
            public void mouseClicked(MouseEvent e) {
            txtReason.setText("");
            }
        });
        switch(s.lectureNumber)
        {
            case(1): this.remove(checkSubject2);
            case(2): this.remove(checkSubject3);
            case(3): this.remove(checkSubject4);
            case(4): this.remove(checkSubject5);
            case(5): this.remove(checkSubject6);
            case(6): break;
        }
        
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(dayOfWeek)
        {
            case(1): JOptionPane.showMessageDialog(null, "IT IS A SUNDAY, NO LECTURES TODAY");
                     new DAFS().setVisible(true);
                     this.dispose();
                    break;
                
            case(2): 
                switch(s.lectureNumber)
                {
                    case(6): checkSubject6.setText(tt.Monday[5]);
                    case(5): checkSubject5.setText(tt.Monday[4]);
                    case(4): checkSubject4.setText(tt.Monday[3]);
                    case(3): checkSubject3.setText(tt.Monday[2]);
                    case(2): checkSubject2.setText(tt.Monday[1]);
                    case(1): checkSubject1.setText(tt.Monday[0]);
                }
                break;
            case(3):
                switch(s.lectureNumber)
                {
                    case(6): checkSubject6.setText(tt.Tuesday[5]);
                    case(5): checkSubject5.setText(tt.Tuesday[4]);
                    case(4): checkSubject4.setText(tt.Tuesday[3]);
                    case(3): checkSubject3.setText(tt.Tuesday[2]);
                    case(2): checkSubject2.setText(tt.Tuesday[1]);
                    case(1): checkSubject1.setText(tt.Tuesday[0]);
                }
            case(4):
                switch(s.lectureNumber)
                {
                    case(6): checkSubject6.setText(tt.Wednesday[5]);
                    case(5): checkSubject5.setText(tt.Wednesday[4]);
                    case(4): checkSubject4.setText(tt.Wednesday[3]);
                    case(3): checkSubject3.setText(tt.Wednesday[2]);
                    case(2): checkSubject2.setText(tt.Wednesday[1]);
                    case(1): checkSubject1.setText(tt.Wednesday[0]);
                }
            break;
            case(5):
                switch(s.lectureNumber)
                {
                    case(6): checkSubject6.setText(tt.Thursday[5]);
                    case(5): checkSubject5.setText(tt.Thursday[4]);
                    case(4): checkSubject4.setText(tt.Thursday[3]);
                    case(3): checkSubject3.setText(tt.Thursday[2]);
                    case(2): checkSubject2.setText(tt.Thursday[1]);
                    case(1): checkSubject1.setText(tt.Thursday[0]);
                }
            break;
            case(6):
                switch(s.lectureNumber)
                {
                    case(6): checkSubject6.setText(tt.Friday[5]);
                    case(5): checkSubject5.setText(tt.Friday[4]);
                    case(4): checkSubject4.setText(tt.Friday[3]);
                    case(3): checkSubject3.setText(tt.Friday[2]);
                    case(2): checkSubject2.setText(tt.Friday[1]);
                    case(1): checkSubject1.setText(tt.Friday[0]);
                }
            break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        checkSubject1 = new javax.swing.JCheckBox();
        checkSubject2 = new javax.swing.JCheckBox();
        checkSubject3 = new javax.swing.JCheckBox();
        checkSubject4 = new javax.swing.JCheckBox();
        checkSubject5 = new javax.swing.JCheckBox();
        checkSubject6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtReason = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("CHECK LECTURES YOU PLAN ON ATTENDING TODAY");
        getContentPane().add(jLabel1);

        checkSubject1.setText("jCheckBox6");
        checkSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSubject1ActionPerformed(evt);
            }
        });
        getContentPane().add(checkSubject1);

        checkSubject2.setText("jCheckBox5");
        getContentPane().add(checkSubject2);

        checkSubject3.setText("jCheckBox2");
        getContentPane().add(checkSubject3);

        checkSubject4.setText("jCheckBox4");
        getContentPane().add(checkSubject4);

        checkSubject5.setText("jCheckBox3");
        getContentPane().add(checkSubject5);

        checkSubject6.setText("jCheckBox1");
        checkSubject6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSubject6ActionPerformed(evt);
            }
        });
        getContentPane().add(checkSubject6);

        jLabel2.setText("JOT DOWN YOUR EXPENDITURE FOR YESTERDAY ");
        getContentPane().add(jLabel2);

        txtAmount.setText("Amount");
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        getContentPane().add(txtAmount);

        txtReason.setText("Reason");
        txtReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonActionPerformed(evt);
            }
        });
        getContentPane().add(txtReason);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkSubject6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSubject6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSubject6ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed

    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonActionPerformed

    }//GEN-LAST:event_txtReasonActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        try
        {
            //Attendance updation
            if(checkSubject1.isSelected())
            {
                String subject = checkSubject1.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }
            else if(!checkSubject1.isSelected())
            {
                String subject = checkSubject1.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }
            if(checkSubject2.isSelected())
            {
                String subject = checkSubject2.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }        
            else if(!checkSubject2.isSelected())
            {
                String subject = checkSubject2.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }        
            if(checkSubject3.isSelected())
            {
                String subject = checkSubject3.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }        
            else if(!checkSubject3.isSelected())
            {
                String subject = checkSubject3.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }           
            if(checkSubject4.isSelected())
            {
                String subject = checkSubject4.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }        
            else if(!checkSubject4.isSelected())
            {
                String subject = checkSubject4.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }           
            if(checkSubject5.isSelected())
            {
                String subject = checkSubject5.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }        
            else if(!checkSubject5.isSelected())
            {
                String subject = checkSubject5.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }           
            if(checkSubject6.isSelected())
            {
                String subject = checkSubject6.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                    {
                        s.subject[i].lecturesAttended++;
                        s.subject[i].totalLecturesTillDate++;
                    }
                }
            }        
            else if(!checkSubject6.isSelected())
            {
                String subject = checkSubject6.getText();
                for(int i=0; i<s.subjectNumber; i++)
                {
                    if(s.subject[i].name.equals(subject))
                      s.subject[i].totalLecturesTillDate++;
                }
            }   
           
            //Budget Updation
            double expense = Double.parseDouble(txtAmount.getText());
            String reason = txtReason.getText();
            Date doe = new Date();
            
            s.budget.expenditure[s.budget.count].amountSpent = expense;
            s.budget.expenditure[s.budget.count].reason = reason;
            s.budget.expenditure[s.budget.count].dateOfExpenditure = doe;
            s.budget.count++;
            s.budget.updateAmountRemaining();
            
            FileOutputStream fout = new FileOutputStream("data/student.ser");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            objout.writeObject(s);
            objout.close();
            fout.close();
            new DAFS().setVisible(true);
            dispose();
        }        
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "Some error occured, please try again");}        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void checkSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSubject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSubject1ActionPerformed

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
            java.util.logging.Logger.getLogger(Notification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkSubject1;
    private javax.swing.JCheckBox checkSubject2;
    private javax.swing.JCheckBox checkSubject3;
    private javax.swing.JCheckBox checkSubject4;
    private javax.swing.JCheckBox checkSubject5;
    private javax.swing.JCheckBox checkSubject6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
