/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesApp;

import ArchivosCRUD.ClientesCRUD;
import ArchivosCRUD.InventarioCRUD;
import ObjetosApp.Inventario;
import Personas.Cliente;
import Trabajo.Oficios;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MADE
 */
public class Mecanica extends javax.swing.JPanel {

    //Variables para almacenar información del trabajo actual.
    private String idTrabajoAUX;
    private double precioMaterial = 1.0;

    public Mecanica() {
        initComponents();

    }

    public String getIdTrabajoAUX() {
        return idTrabajoAUX;
    }

    public void setIdTrabajoAUX(String idTrabajoAUX) {
        this.idTrabajoAUX = idTrabajoAUX;

        //Obtiene la información del trabajo actual desde la base de datos.
        ArrayList<Cliente> clientes = ClientesCRUD.Read();
        ArrayList<Oficios> oficios;

        //Busca el trabajo con el ID proporcionado y actualiza la interfaz con la información correspondiente.
        for (Cliente cliente : clientes) {
            oficios = cliente.getOficios();
            for (Oficios oficio : oficios) {
                if (oficio.getIdTrabajo().equals(idTrabajoAUX)) {

                    detallesTXT.setText(oficio.getDetalles());
                    tipoTrabajoTXT.setText(oficio.getTipoTrabajo());

                    //Deshabilita la entrada de material si el trabajo es de tipo "REVISION".
                    if (oficio.getTipoTrabajo().equals("REVISION")) {
                        materialTXT.setEnabled(false);
                    }
                }
            }
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

        Contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        materialTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        horasTXT = new javax.swing.JTextField();
        actualizarBTN = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        detallesTXT = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoTrabajoTXT = new javax.swing.JLabel();
        estadoBTN = new javax.swing.JToggleButton();

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.setPreferredSize(new java.awt.Dimension(800, 700));
        Contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContenedorMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("zona de trabajos ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("detalles del trabajo:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("añadir MATERIAL (id):");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        materialTXT.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        materialTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                materialTXTFocusLost(evt);
            }
        });
        materialTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialTXTMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("añadir horas de trabajo:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        horasTXT.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        horasTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                horasTXTFocusLost(evt);
            }
        });
        horasTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horasTXTMouseClicked(evt);
            }
        });

        actualizarBTN.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        actualizarBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarBTN.setText("actualizar trabajo");
        actualizarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        actualizarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarBTNMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("estado del trabajo:");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesApp/IMAGENES2/obrero.png"))); // NOI18N

        detallesTXT.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        detallesTXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("tipo de trabajo:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tipoTrabajoTXT.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        tipoTrabajoTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoTrabajoTXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        estadoBTN.setBackground(java.awt.Color.green);
        estadoBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estadoBTN.setText("TRABAJANDO");
        estadoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(actualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detallesTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(horasTXT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(materialTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 42, Short.MAX_VALUE)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(estadoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipoTrabajoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detallesTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoTrabajoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(materialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addComponent(actualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estadoBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoBTNMouseClicked
        if (estadoBTN.isSelected()) {
            estadoBTN.setText("FINALIZADO");
            estadoBTN.setBackground(Color.red);
        } else {
            estadoBTN.setText("TRABAJANDO");
            estadoBTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_estadoBTNMouseClicked

    private void actualizarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBTNMouseClicked

        //Obtener la información ingresada por el usuario.
        String idAux = materialTXT.getText();

        String horas = horasTXT.getText();

        boolean trabajando = true;

        if (estadoBTN.isSelected()) {
            trabajando = false;
        }

        try {
            //Validar que las horas sean un número entero positivo.
            int horas_int = Integer.parseInt(horas);

            if (idAux.isEmpty() || horas.isEmpty()) {
                //Mostrar mensaje de alerta si las horas no son válidas.
                JOptionPane.showMessageDialog(null, "debe ingresar todos los datos correspondientes", "Alerta", JOptionPane.WARNING_MESSAGE);

            } else {
                //Se leen todos los clientes.
                ArrayList<Cliente> clientes = ClientesCRUD.Read();

                ArrayList<Oficios> oficios;
                //Se recorren todos los clientes.
                for (Cliente cliente : clientes) {
                    //Obtenemos los trabajos del cliente.
                    oficios = cliente.getOficios();
                    //Los reccorremos
                    for (Oficios oficio : oficios) {
                        //Validamos que el id del trabajo sea una que este registrado. 
                        if (oficio.getIdTrabajo().equals(idTrabajoAUX)) {

                            //Actualización la información.
                            oficio.setDiasTrabajo(oficio.getDiasTrabajo() + horas_int);

                            oficio.setPrecioMaterial(oficio.getPrecioMaterial() + precioMaterial);

                            oficio.setEstadoTrabajo(trabajando);

                            JOptionPane.showMessageDialog(null, "trabajo actualizado correctamente", "Trabajo exitoso", JOptionPane.OK_OPTION);

                            //Setteamos los trabajos el cliente.
                            cliente.setOficios(oficios);
                            //Actualizamos el archivo. 
                            ClientesCRUD.Update(cliente);
                        }

                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "horas deben ser numericos", "Alerta", JOptionPane.WARNING_MESSAGE);

        }

        //Limpiamos los campos y ocultar la interfaz actual.
        materialTXT.setText("");
        horasTXT.setText("");

        this.setVisible(false);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_actualizarBTNMouseClicked

    private void materialTXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_materialTXTFocusLost
        //Obtener el ID del material ingresado por el usuario.
        String idAux = materialTXT.getText();

        boolean existe = false;

        //Verificar si el ID del material no está vacío.
        if (!idAux.isEmpty()) {

            //Buscar el material en el inventario.
            ArrayList<Inventario> productos = InventarioCRUD.Read();

            for (Inventario producto : productos) {

                String id = producto.getId() + "";

                //Verificar si el material existe en el inventario.
                if (id.equals(idAux)) {

                    existe = true;

                    precioMaterial = producto.getPrecio();

                }

            }

            //Mostrar mensaje de alerta si el material no existe.
            if (existe == false) {

                JOptionPane.showMessageDialog(null, "el id de material no existe", "Alerta", JOptionPane.WARNING_MESSAGE);
                materialTXT.setText("");

            }

        } else {
            // Limpiar el campo de texto si el ID del material está vacío.
            materialTXT.setText("");

        }


    }//GEN-LAST:event_materialTXTFocusLost

    private void horasTXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_horasTXTFocusLost
        //Obtener las horas ingresadas por el usuario.
        String horas = horasTXT.getText();

        //Verificar si el campo de horas no está vacío.
        if (!horas.isEmpty()) {

            try {

                //Validar que las horas sean un número entero positivo.
                int horas_int = Integer.parseInt(horas);

                if (horas_int < 1) {
                    JOptionPane.showMessageDialog(null, "las horas no pueden ser negativas ni 0", "Alerta", JOptionPane.WARNING_MESSAGE);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "las horas deben ser numericas", "Alerta", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            materialTXT.setText("");
           
        }
    }//GEN-LAST:event_horasTXTFocusLost

    private void materialTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialTXTMouseClicked
        materialTXT.setText("");
       
    }//GEN-LAST:event_materialTXTMouseClicked

    private void ContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenedorMouseClicked
        
    }//GEN-LAST:event_ContenedorMouseClicked

    private void horasTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horasTXTMouseClicked
        horasTXT.setText("");
       
    }//GEN-LAST:event_horasTXTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel actualizarBTN;
    private javax.swing.JLabel detallesTXT;
    private javax.swing.JToggleButton estadoBTN;
    private javax.swing.JTextField horasTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField materialTXT;
    private javax.swing.JLabel tipoTrabajoTXT;
    // End of variables declaration//GEN-END:variables
}
