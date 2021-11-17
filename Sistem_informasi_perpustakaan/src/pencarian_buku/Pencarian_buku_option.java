/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencarian_buku;

import java.awt.Cursor;
import sistem_informasi_perpustakaan.Main_menu;

/**
 *
 * @author Daniel
 */
//Berisi pilihan metode pencarian buku
public class Pencarian_buku_option extends javax.swing.JFrame {

    /**
     * Creates new form Pencarian_buku_option
     */
    public Pencarian_buku_option() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_search_by_title = new javax.swing.JLabel();
        btn_search_by_tag = new javax.swing.JLabel();
        btn_search_by_author = new javax.swing.JLabel();
        btn_search_by_publisher = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_search_by_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search_by_title.setText("Search dengan Judul");
        btn_search_by_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_by_titleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_search_by_titleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_search_by_titleMouseExited(evt);
            }
        });

        btn_search_by_tag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search_by_tag.setText("Search dengan Tag");
        btn_search_by_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_by_tagMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_search_by_tagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_search_by_tagMouseExited(evt);
            }
        });

        btn_search_by_author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search_by_author.setText("Search dengan Penulis");
        btn_search_by_author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_by_authorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_search_by_authorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_search_by_authorMouseExited(evt);
            }
        });

        btn_search_by_publisher.setText("Search dengan Penerbit");
        btn_search_by_publisher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_by_publisherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_search_by_publisherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_search_by_publisherMouseExited(evt);
            }
        });

        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search_by_title, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btn_search_by_tag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search_by_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_search_by_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btn_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search_by_title)
                    .addComponent(btn_search_by_author))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search_by_tag)
                    .addComponent(btn_search_by_publisher))
                .addGap(48, 48, 48)
                .addComponent(btn_back)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//searching buku sesuai metode berdasarkan button yang di click
    private void btn_search_by_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_titleMouseClicked
        this.dispose();
        Searching searching = new Searching(0);
        searching.setVisible(true);
    }//GEN-LAST:event_btn_search_by_titleMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.dispose();
        Main_menu main_menu = new Main_menu();
        main_menu.setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_search_by_authorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_authorMouseClicked
        this.dispose();
        Searching searching = new Searching(1);
        searching.setVisible(true);
    }//GEN-LAST:event_btn_search_by_authorMouseClicked

    private void btn_search_by_publisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_publisherMouseClicked
        this.dispose();
        Searching searching = new Searching(2);
        searching.setVisible(true);
    }//GEN-LAST:event_btn_search_by_publisherMouseClicked

    private void btn_search_by_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_tagMouseClicked
        this.dispose();
        Tag_search tag_search = new Tag_search();
        tag_search.setVisible(true);
    }//GEN-LAST:event_btn_search_by_tagMouseClicked

    private void btn_search_by_titleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_titleMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_search_by_titleMouseEntered

    private void btn_search_by_titleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_titleMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_search_by_titleMouseExited

    private void btn_search_by_authorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_authorMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_search_by_authorMouseEntered

    private void btn_search_by_authorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_authorMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_search_by_authorMouseExited

    private void btn_search_by_tagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_tagMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_search_by_tagMouseEntered

    private void btn_search_by_tagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_tagMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_search_by_tagMouseExited

    private void btn_search_by_publisherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_publisherMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_search_by_publisherMouseEntered

    private void btn_search_by_publisherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_by_publisherMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_search_by_publisherMouseExited

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_backMouseExited

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
            java.util.logging.Logger.getLogger(Pencarian_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencarian_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencarian_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencarian_buku_option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencarian_buku_option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_search_by_author;
    private javax.swing.JLabel btn_search_by_publisher;
    private javax.swing.JLabel btn_search_by_tag;
    private javax.swing.JLabel btn_search_by_title;
    // End of variables declaration//GEN-END:variables
}