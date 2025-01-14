/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDetails;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prathamesh
 */
public class ViewJPanel extends javax.swing.JPanel {

    private JPanel startCardLayout;
    private CarDetails carDetails;
    private CarDirectory carDirectory;
    public String checkboxAvail;

    /**
     * Creates new form ViewJPanel
     */
    ViewJPanel(JPanel startCardLayout, CarDetails carDetails, CarDirectory carDirectory) {
        initComponents();
        this.startCardLayout = startCardLayout;
        this.carDetails = carDetails;
        this.carDirectory = carDirectory;
        populateDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void populateDetails(){
        txtCarType.setSelectedItem(carDetails.getCarType());
        txtManufacturedBy.setText(carDetails.getManufacturedBy());
        txtModelNumber.setText(carDetails.getModelNumber());
        txtSerialNumber.setText(carDetails.getSerialNumber());
        txtColor.setText(carDetails.getColor());
        txtAvailableCity.setText(carDetails.getAvailableCity());
        txtEngineNumber.setText(carDetails.getEngineNumber());
        txtPrice.setText(Double.toString(carDetails.getPrice()));
        txtOdometerReading.setText(Integer.toString(carDetails.getOdometerReading()));
        txtNoOfSeats.setText(Integer.toString(carDetails.getNo_seats()));
        //txtMaxSeats.setText(Integer.toString(carDetails.getMax_seats()));
        txtManufactureYear.setText(Integer.toString(carDetails.getManufactureYear()));
        txtValidOrNot.setSelectedItem(carDetails.getMaintenance_certificate());
        checkBoxAvailable.setSelected(carDetails.getAvailablity().equalsIgnoreCase("Yes"));
        txtUsedYesOrNo.setSelectedItem(carDetails.getUsedByUber());
        txtDate.setText(carDetails.getDate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOdometerReading = new javax.swing.JLabel();
        txtEngineNumber = new javax.swing.JTextField();
        lblEngNumber = new javax.swing.JLabel();
        lblEnterDetails = new javax.swing.JLabel();
        txtOdometerReading = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblManufactureYear = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblManufacturedBy = new javax.swing.JLabel();
        lblCarType = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        txtManufacturedBy = new javax.swing.JTextField();
        txtCarType = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        txtModelNumber = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblAvailableCity = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        txtAvailableCity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblAvailable = new javax.swing.JLabel();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        txtUsedYesOrNo = new javax.swing.JComboBox();
        lblNoOfSeats = new javax.swing.JLabel();
        lblUsedByUber = new javax.swing.JLabel();
        txtNoOfSeats = new javax.swing.JTextField();
        txtValidOrNot = new javax.swing.JComboBox();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        checkBoxAvailable = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(102, 0, 0));

        lblOdometerReading.setBackground(new java.awt.Color(0, 0, 0));
        lblOdometerReading.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOdometerReading.setForeground(new java.awt.Color(0, 255, 255));
        lblOdometerReading.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOdometerReading.setText("Odometer Reading:");

        txtEngineNumber.setEditable(false);
        txtEngineNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtEngineNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtEngineNumber.setBorder(null);

        lblEngNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblEngNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEngNumber.setForeground(new java.awt.Color(0, 255, 255));
        lblEngNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEngNumber.setText("Eng Number:");

        lblEnterDetails.setBackground(new java.awt.Color(0, 0, 0));
        lblEnterDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterDetails.setForeground(new java.awt.Color(0, 255, 255));
        lblEnterDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterDetails.setText("View Details");

        txtOdometerReading.setEditable(false);
        txtOdometerReading.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOdometerReading.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtOdometerReading.setBorder(null);

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtPrice.setBorder(null);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        lblManufactureYear.setBackground(new java.awt.Color(0, 0, 0));
        lblManufactureYear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblManufactureYear.setForeground(new java.awt.Color(0, 255, 255));
        lblManufactureYear.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufactureYear.setText("Manufacture Year:");

        lblPrice.setBackground(new java.awt.Color(0, 0, 0));
        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPrice.setText("Price:");

        lblManufacturedBy.setBackground(new java.awt.Color(0, 0, 0));
        lblManufacturedBy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblManufacturedBy.setForeground(new java.awt.Color(0, 255, 255));
        lblManufacturedBy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedBy.setText("Manufactured By:");

        lblCarType.setBackground(new java.awt.Color(0, 0, 0));
        lblCarType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCarType.setForeground(new java.awt.Color(0, 255, 255));
        lblCarType.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarType.setText("Car Type:");

        lblModelNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblModelNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblModelNumber.setForeground(new java.awt.Color(0, 255, 255));
        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModelNumber.setText("Model Number:");

        txtManufacturedBy.setEditable(false);
        txtManufacturedBy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtManufacturedBy.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtManufacturedBy.setBorder(null);

        txtCarType.setEditable(true);
        txtCarType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCarType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Hatchback", "Sedan", "SUV", "Crossover", "Convertible" }));
        txtCarType.setEnabled(false);
        txtCarType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarTypeActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtModelNumber.setEditable(false);
        txtModelNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtModelNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtModelNumber.setBorder(null);

        lblSerialNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblSerialNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSerialNumber.setForeground(new java.awt.Color(0, 255, 255));
        lblSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSerialNumber.setText("Serial Number:");

        txtSerialNumber.setEditable(false);
        txtSerialNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSerialNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtSerialNumber.setBorder(null);

        lblColor.setBackground(new java.awt.Color(0, 0, 0));
        lblColor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 255, 255));
        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblColor.setText("Color:");

        txtColor.setEditable(false);
        txtColor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtColor.setBorder(null);

        lblAvailableCity.setBackground(new java.awt.Color(0, 0, 0));
        lblAvailableCity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAvailableCity.setForeground(new java.awt.Color(0, 255, 255));
        lblAvailableCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAvailableCity.setText("City Available:");

        txtManufactureYear.setEditable(false);
        txtManufactureYear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtManufactureYear.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtManufactureYear.setBorder(null);

        txtAvailableCity.setEditable(false);
        txtAvailableCity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAvailableCity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAvailableCity.setBorder(null);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAvailable.setBackground(new java.awt.Color(0, 0, 0));
        lblAvailable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(0, 255, 255));
        lblAvailable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAvailable.setText("Available:");

        lblMaintenanceCertificate.setBackground(new java.awt.Color(0, 0, 0));
        lblMaintenanceCertificate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaintenanceCertificate.setForeground(new java.awt.Color(0, 255, 255));
        lblMaintenanceCertificate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaintenanceCertificate.setText("Maintenance Certificate:");

        txtUsedYesOrNo.setEditable(true);
        txtUsedYesOrNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUsedYesOrNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Yes", "No" }));
        txtUsedYesOrNo.setEnabled(false);
        txtUsedYesOrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsedYesOrNoActionPerformed(evt);
            }
        });

        lblNoOfSeats.setBackground(new java.awt.Color(0, 0, 0));
        lblNoOfSeats.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNoOfSeats.setForeground(new java.awt.Color(0, 255, 255));
        lblNoOfSeats.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNoOfSeats.setText("No of Seats:");

        lblUsedByUber.setBackground(new java.awt.Color(0, 0, 0));
        lblUsedByUber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsedByUber.setForeground(new java.awt.Color(0, 255, 255));
        lblUsedByUber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsedByUber.setText("Used By Uber:");

        txtNoOfSeats.setEditable(false);
        txtNoOfSeats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNoOfSeats.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtNoOfSeats.setBorder(null);

        txtValidOrNot.setEditable(true);
        txtValidOrNot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtValidOrNot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Valid", "Expired" }));
        txtValidOrNot.setEnabled(false);
        txtValidOrNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidOrNotActionPerformed(evt);
            }
        });

        lblDate.setBackground(new java.awt.Color(0, 0, 0));
        lblDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Date:");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtDate.setBorder(null);
        txtDate.setEnabled(false);

        checkBoxAvailable.setEnabled(false);
        checkBoxAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEnterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarType)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelNumber)
                                    .addComponent(lblColor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAvailableCity))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtModelNumber)
                                            .addComponent(txtCarType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblManufacturedBy)
                                            .addComponent(lblSerialNumber)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblOdometerReading))))
                            .addComponent(lblEngNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtManufacturedBy)
                            .addComponent(txtAvailableCity)
                            .addComponent(txtOdometerReading)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoOfSeats)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblManufactureYear))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblUsedByUber)
                                    .addGap(141, 141, 141)
                                    .addComponent(txtUsedYesOrNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaintenanceCertificate)
                                        .addComponent(lblAvailable))
                                    .addGap(62, 62, 62)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtValidOrNot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkBoxAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lblPrice))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterDetails)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCarType)
                        .addComponent(lblManufacturedBy)
                        .addComponent(txtManufacturedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailableCity)
                    .addComponent(txtAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEngNumber)
                    .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdometerReading)
                    .addComponent(txtOdometerReading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufactureYear)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoOfSeats)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaintenanceCertificate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValidOrNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailable)
                    .addComponent(btnSave)
                    .addComponent(checkBoxAvailable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsedByUber)
                    .addComponent(txtUsedYesOrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCarTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageJPanel panel = new ManageJPanel(startCardLayout, carDirectory);
        startCardLayout.add("ManageJPanel", panel);
        CardLayout layout = (CardLayout) startCardLayout.getLayout();
        layout.next(startCardLayout); 
//        startCardLayout.remove(this);
//        CardLayout layout = (CardLayout) startCardLayout.getLayout();
//        layout.previous(startCardLayout);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtCarType.setEditable(true);
        txtManufacturedBy.setEditable(true);
        txtModelNumber.setEditable(true);
        txtSerialNumber.setEditable(true);
        txtColor.setEditable(true);
        txtAvailableCity.setEditable(true);
        txtEngineNumber.setEditable(true);
        txtOdometerReading.setEditable(true);
        //txtMinSeats.setEditable(true);
        //txtMaxSeats.setEditable(true);
        txtNoOfSeats.setEditable(true);
        txtPrice.setEditable(true);
        txtManufactureYear.setEditable(true);
        txtValidOrNot.setEditable(true);
        //checkBoxAvailable.setEditable(true);
        txtUsedYesOrNo.setEditable(true);
        txtCarType.setEnabled(true);
        txtManufacturedBy.setEnabled(true);
        txtModelNumber.setEnabled(true);
        txtSerialNumber.setEnabled(true);
        txtColor.setEnabled(true);
        txtAvailableCity.setEnabled(true);
        txtEngineNumber.setEnabled(true);
        txtOdometerReading.setEnabled(true);
        //txtMinSeats.setEnabled(true);
        //txtMaxSeats.setEnabled(true);
        txtNoOfSeats.setEnabled(true);
        txtPrice.setEnabled(true);
        txtManufactureYear.setEnabled(true);
        txtValidOrNot.setEnabled(true);
        checkBoxAvailable.setEnabled(true);
        txtUsedYesOrNo.setEnabled(true);
        txtDate.setEnabled(false);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        DateFormat dateformat = new SimpleDateFormat("MM:dd:YYYY");
        Date dateObj = new Date();
        String j = dateformat.format(dateObj);
        carDetails.setDate(j);
        carDetails.setCarType(txtCarType.getSelectedItem().toString());
        carDetails.setManufacturedBy(txtManufacturedBy.getText());
        carDetails.setModelNumber(txtModelNumber.getText());
        carDetails.setSerialNumber(txtSerialNumber.getText());
        carDetails.setColor(txtColor.getText());
        carDetails.setAvailableCity(txtAvailableCity.getText());
        carDetails.setEngineNumber(txtEngineNumber.getText());
        carDetails.setOdometerReading(Integer.parseInt(txtOdometerReading.getText()));
        //carDetails.setMin_seats(Integer.parseInt(txtMinSeats.getText()));
        //carDetails.setMax_seats(Integer.parseInt(txtMaxSeats.getText()));
        carDetails.setNo_seats(Integer.parseInt(txtNoOfSeats.getText()));
        carDetails.setPrice(Double.parseDouble(txtPrice.getText()));
        carDetails.setManufactureYear(Integer.parseInt(txtManufactureYear.getText()));
        carDetails.setMaintenance_certificate(txtValidOrNot.getSelectedItem().toString());
        //carDetails.setAvailablity(checkBoxAvailable.getSelectedItem().toString());
        carDetails.setAvailablity(checkboxAvail);
        carDetails.setUsedByUber(txtUsedYesOrNo.getSelectedItem().toString());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Account updated successfully!");
        
        txtCarType.setEnabled(false);
        txtManufacturedBy.setEditable(false);
        txtModelNumber.setEditable(false);
        txtSerialNumber.setEditable(false);
        txtColor.setEditable(false);
        txtAvailableCity.setEditable(false);
        txtEngineNumber.setEditable(false);
        txtOdometerReading.setEditable(false);
        //txtMinSeats.setEditable(false);
        //txtMaxSeats.setEditable(false);
        txtNoOfSeats.setEditable(false);
        txtPrice.setEditable(false);
        txtManufactureYear.setEditable(false);
        txtValidOrNot.setEnabled(false);
        checkBoxAvailable.setEnabled(false);
        txtUsedYesOrNo.setEnabled(false);
        txtDate.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUsedYesOrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsedYesOrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsedYesOrNoActionPerformed

    private void txtValidOrNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidOrNotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidOrNotActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void checkBoxAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableActionPerformed
        // TODO add your handling code here:
        if(checkBoxAvailable.isSelected())
        {
            checkboxAvail = "Yes";
        }
        else
        {
            checkboxAvail = "No";
        }
    }//GEN-LAST:event_checkBoxAvailableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkBoxAvailable;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblAvailableCity;
    private javax.swing.JLabel lblCarType;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEngNumber;
    private javax.swing.JLabel lblEnterDetails;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblManufacturedBy;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblOdometerReading;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblUsedByUber;
    private javax.swing.JTextField txtAvailableCity;
    private javax.swing.JComboBox txtCarType;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEngineNumber;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtManufacturedBy;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtOdometerReading;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JComboBox txtUsedYesOrNo;
    private javax.swing.JComboBox txtValidOrNot;
    // End of variables declaration//GEN-END:variables
}
