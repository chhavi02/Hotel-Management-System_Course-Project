import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class console extends javax.swing.JFrame {
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton3;
    private JButton jButton5;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel26;
    private JButton jButton4;

    private JLayeredPane jLayeredPane1;
    private JLayeredPane jLayeredPane10;
    private JLayeredPane jLayeredPane11;
    private JLayeredPane jLayeredPane12;
    private JLayeredPane jLayeredPane13;
    private JLayeredPane jLayeredPane2;
    private JLayeredPane jLayeredPane3;
    private JLayeredPane jLayeredPane4;
    private JLayeredPane jLayeredPane6;
    private JLayeredPane jLayeredPane7;
    private JMenu jMenu1;
    private JMenuItem jMenuItem1;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField18;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JLayeredPane jLayeredPane5;
    private JTextField jTextField20;
    private JTextField jTextField19;
    public console() {
        initComponents();
    }
    private void initComponents() {
        jTextField20=new JTextField();
        jTextField19=new JTextField();
        jLabel26=new JLabel();
        jLabel32=new JLabel();
        jLabel33=new JLabel();
        jLabel34=new JLabel();
        jMenuItem1 = new JMenuItem();
        jMenu1 = new JMenu();
        jTabbedPane1 = new JTabbedPane();
        jLayeredPane1 = new JLayeredPane();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jButton21 = new JButton();
        jLayeredPane10 = new JLayeredPane();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jLabel6 = new JLabel();
        jTextField5 = new JTextField();
        jLabel7 = new JLabel();
        jTextField6 = new JTextField();
        jButton1 = new JButton();
        jLabel8 = new JLabel();
        jLayeredPane2 = new JLayeredPane();
        jButton5 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jLayeredPane12 = new JLayeredPane();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jTextField9 = new JTextField();
        jTextField10 = new JTextField();
        jLabel14 = new JLabel();
        jTextField11 = new JTextField();
        jLabel15 = new JLabel();
        jTextField12 = new JTextField();
        jButton2 = new JButton();
        jLabel16 = new JLabel();
        jLayeredPane3 = new JLayeredPane();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jLayeredPane13 = new JLayeredPane();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jTextField13 = new JTextField();
        jTextField14 = new JTextField();
        jTextField15 = new JTextField();
        jTextField16 = new JTextField();
        jLabel22 = new JLabel();
        jTextField17 = new JTextField();
        jLabel23 = new JLabel();
        jTextField18 = new JTextField();
        jButton3 = new JButton();
        jLabel24 = new JLabel();
        jLayeredPane4 = new JLayeredPane();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jLayeredPane11 = new JLayeredPane();
        jScrollPane1 = new JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLayeredPane5 = new JLayeredPane();
        jButton4=new JButton();
        jTextField20=new JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Management console");

        jTabbedPane1.setBackground(new java.awt.Color(104, 253, 246));
        jTabbedPane1.setBorder(null);

        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));


        // 18,19,20,21 buttons are of tab 1
        jButton18.setBackground(Color.decode("#444C5C"));
        jButton18.setForeground(Color.white);
        jButton18.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add room.png"))); // NOI18N
        jButton18.setText("Add Room");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        jButton18.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(2);

            }
        });

        jButton19.setBackground(Color.decode("#CE5A57"));
        jButton19.setForeground(Color.white);
        jButton19.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addcus.jpg"))); // NOI18N
        jButton19.setText("Add Customer");
        jButton19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton19.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(1);
                }
        });

        jButton20.setBackground(Color.decode("#78A5A3"));
        jButton20.setForeground(Color.white);
        jButton20.setFont(new java.awt.Font("Ubuntu Mono", 1, 22));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png")));
        jButton20.setText("Book Room");
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        jButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(0);
            }
        });
        jButton21.setBackground(Color.decode("#E1B16A"));
        jButton21.setForeground(Color.white);
        jButton21.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_available.png"))); // NOI18N
        jButton21.setText("Availability");
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));



        jLayeredPane10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setBackground(new java.awt.Color(229, 147, 49));
        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 82, 206));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Booking Application Form");

        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setText("Room type");

        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel4.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel3.setText("Customer Name");

        jLabel5.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel5.setText("Food");

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel6.setText("No of Days");

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setText("Room No");
        jButton1.setText("Book");
        jLabel16.setForeground(Color.RED);

        jTextField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String rtype=null;
                int rnum=Integer.parseInt(jTextField3.getText());
                ResultSet rs=null;
                try {
                    rs=db.stmt.executeQuery("select type from room where rnum="+rnum);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                try {
                    while (rs.next()) {
                        try {
                            rtype = rs.getString(1);
                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                }catch (SQLException exp)
                {
                }
                if(rtype!=null)
                    jTextField5.setText(rtype);
                else
                    jTextField5.setText("invalid room number");


            }
        });



        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=null;
                int id=Integer.parseInt(jTextField1.getText());
                ResultSet rs=null;
                try {
                    rs=db.stmt.executeQuery("select name from customer where id="+id);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                try {
                    while (rs.next()) {
                        try {
                            name = rs.getString(1);
                        } catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                }catch (SQLException exp)
                {
                }
                if(name!=null)
                jTextField4.setText(name);
                else
                    jTextField4.setText("invalid customer id");



            }
        });
        /*here comes the functionality of all the functions used in the project */

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=null,food=null;
                int id=0,ndays=0,rnum=0;


                try {
                    id= Integer.parseInt(jTextField1.getText());
                    ndays= Integer.parseInt(jTextField6.getText());
                    food= jTextField2.getText();
                    name= jTextField4.getText();
                    rnum=Integer.parseInt(jTextField3.getText());

                } catch (Exception e12) {
                    jLabel8.setEnabled(true);
                    jLabel8.setForeground(Color.RED);
                    jLabel8.setText("Fill all the fields!!!!!!!! ");

                }
                if (ndays!= 0 && rnum!=0 &&food!=null && rnum!=0) {
                    int var = -1;
                    try {
                        db.pstmt3.setInt(1, id);
                        db.pstmt3.setInt(2,rnum);
                        db.pstmt3.setString(5,name);
                        db.pstmt3.setString(4, food);
                        db.pstmt3.setInt(3, ndays);
                        System.out.println("running into if condition");
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel8.setEnabled(true);
                        jLabel8.setText(e1.getMessage());

                    }

                    try {
                        var = db.pstmt3.executeUpdate();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel8.setEnabled(true);
                        jLabel8.setText(e1.getMessage());
                    }

                    if (var != -1) {
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        jLabel8.setEnabled(true);
                        jLabel8.setForeground(Color.RED);
                        jLabel8.setText("Room successfully Booked\n");
                    } else {
                        jLabel8.setEnabled(true);
                        jLabel8.setForeground(Color.RED);
                        jLabel8.setText("Failed!!!");
                        System.out.println("successfully added "+var+" record");
                    }
                }
                else
                {
                    jLabel8.setForeground(Color.RED);
                    jLabel8.setEnabled(true);
                    jLabel8.setText("Please fill all the fields!!!!!!!!");
                }

            }
        });

        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rtype=null,wifi=null;
                int rnum=0,cost=0,nbeds=0;

                try {
                    rtype= jTextField16.getText();
                    rnum= Integer.parseInt(jTextField13.getText());
                    cost= Integer.parseInt(jTextField15.getText());
                    wifi = jTextField14.getText();
                    nbeds= Integer.parseInt(jTextField18.getText());

                } catch (Exception e12) {
                    jLabel24.setEnabled(true);
                    jLabel24.setForeground(Color.RED);
                    jLabel24.setText("Fill all the fields!!!!!!!! ");

                }
                if (cost != 0 && rnum!=0 && wifi!=null &&rtype!=null && nbeds!=0) {
                    int var = -1;
                    try {
                        db.pstmt2.setInt(1, rnum);
                        db.pstmt2.setInt(3, cost);
                        db.pstmt2.setString(2,rtype);
                        db.pstmt2.setString(4, wifi);
                        db.pstmt2.setInt(5, nbeds);
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel24.setEnabled(true);
                        jLabel24.setText(e1.getMessage());

                    }

                    try {
                        var = db.pstmt2.executeUpdate();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel24.setEnabled(true);
                        jLabel24.setText(e1.getMessage());
                    }

                    if (var != -1) {
                        jTextField13.setText("");
                        jTextField14.setText("");
                        jTextField15.setText("");
                        jTextField16.setText("");
                        jTextField18.setText("");
                        jLabel24.setEnabled(true);
                        jLabel24.setForeground(Color.RED);
                        jLabel24.setText("successfully added");
                    } else {
                        jLabel24.setEnabled(true);
                        jLabel24.setForeground(Color.RED);
                        jLabel24.setText("Failed!!!");
                        System.out.println("successfully added "+var+" record");
                    }
                }
                else
                {
                    jLabel24.setForeground(Color.RED);
                    jLabel24.setEnabled(true);
                    jLabel24.setText("Please fill all the fields!!!!!!!!");
                }
            }

        });



        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=null, address=null, number=null, gender=null;
                int id=0, age=0;

                try {
                    name = jTextField7.getText();
                    id = Integer.parseInt(jTextField10.getText());
                    age = Integer.parseInt(jTextField9.getText());
                    address = jTextField8.getText();
                    number = jTextField12.getText();
                    gender = jTextField11.getText();

                } catch (Exception e12) {
                    jLabel16.setEnabled(true);
                    jLabel16.setForeground(Color.RED);
                    jLabel16.setText("Fill all the fields!!!!!!!! ");

                }
                if (id != 0 && age!=0 && address!=null &&name!=null && gender!=null) {
                    int var = -1;
                    try {
                        db.pstmt.setInt(1, id);
                        db.pstmt.setString(2, name);
                        db.pstmt.setInt(3, age);
                        db.pstmt.setString(4, address);
                        db.pstmt.setString(5, number);
                        db.pstmt.setString(6, gender);
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel16.setEnabled(true);
                        jLabel16.setText(e1.getMessage());

                    }

                    try {
                        var = db.pstmt.executeUpdate();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                        jLabel16.setEnabled(true);
                        jLabel16.setText(e1.getMessage());
                    }

                    if (var != -1) {
                        jTextField7.setText("");
                        jTextField8.setText("");
                        jTextField9.setText("");
                        jTextField10.setText("");
                        jTextField11.setText("");
                        jTextField12.setText("");
                        jLabel16.setEnabled(true);
                        jLabel16.setForeground(Color.RED);
                        jLabel16.setText("successfully added");
                        System.out.println(var);
                    } else {
                        jLabel16.setEnabled(true);
                        jLabel16.setForeground(Color.RED);
                        jLabel16.setText("Failed!!!");
                        System.out.println("successfully added "+var+" record");
                    }
                }
                else
                {
                    jLabel16.setForeground(Color.RED);
                    jLabel16.setEnabled(true);
                    jLabel16.setText("Please fill all the fields!!!!!!!!");
                }
            }

        });

        jButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                        jTabbedPane1.setSelectedIndex(3);
                        availabilty();
                        calculate();
                        calculateAvailability();



                        }
        });


















        jLabel8.setEnabled(false);  //label for printing booking error message or successful message

        jLayeredPane10.setLayer(jLabel1, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel2, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel3, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel4, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel5, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField1, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField2, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField3, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField4, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel6, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField5, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel7, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jTextField6, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jButton1, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jLabel8, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
                jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(45, 45, 45)
                                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(341, Short.MAX_VALUE))
        );
        jLayeredPane10Layout.setVerticalGroup(
                jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane10Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jLayeredPane1.setLayer(jButton18, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton19, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton20, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton21, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane10, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52)
                                .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(396, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLayeredPane10)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(580, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BOOK ROOM", new javax.swing.ImageIcon(getClass().getResource("/add room.png")), jLayeredPane1); // NOI18N

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jButton5.setBackground(Color.decode("#444C5C"));
        jButton5.setForeground(Color.white);
        jButton5.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add room.png"))); // NOI18N
        jButton5.setText("Add Room");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton5.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
               jTabbedPane1.setSelectedIndex(2);
            }
        });
        jButton7.setBackground(Color.decode("#CE5A57"));
        jButton7.setForeground(Color.white);
        jButton7.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addcus.jpg"))); // NOI18N
        jButton7.setText("Add Customer");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(1);
            }
        });
        jButton8.setBackground(Color.decode("#78A5A3"));
        jButton8.setForeground(Color.white);

        jButton8.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        jButton8.setText("Book Room");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(0);
            }
        });
        jButton9.setBackground(Color.decode("#E1B16A"));
        jButton9.setForeground(Color.white);
        jButton9.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_available.png"))); // NOI18N
        jButton9.setText("Availability");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTabbedPane1.setSelectedIndex(3);
                availabilty();
                calculate();
                calculateAvailability();

            }
        });
        jLayeredPane12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel9.setBackground(new java.awt.Color(229, 147, 49));
        jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 82, 206));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add New Customer");

        jLabel10.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel10.setText("Age");

        jLabel11.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel11.setText("Customer ID");

        jLabel12.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel12.setText("Customer Name");

        jLabel13.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel13.setText("Address");



        jLabel14.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel14.setText("Mobile Number");



        jLabel15.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel15.setText("Gender (M/F)");


        jButton2.setText("Add Customer");

        jLabel16.setEnabled(false);
        jLabel16.setForeground(Color.RED);

        jLayeredPane12.setLayer(jLabel9, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel10, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel11, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel12, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel13, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField7, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField8, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField9, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField10, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel14, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField11, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel15, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jTextField12, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jButton2, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane12.setLayer(jLabel16, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane12Layout = new javax.swing.GroupLayout(jLayeredPane12);
        jLayeredPane12.setLayout(jLayeredPane12Layout);
        jLayeredPane12Layout.setHorizontalGroup(
                jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(45, 45, 45)
                                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField7)
                                                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(341, Short.MAX_VALUE))
        );
        jLayeredPane12Layout.setVerticalGroup(
                jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane12Layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jLayeredPane2.setLayer(jButton5, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton7, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton8, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton9, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane12, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addComponent(jLayeredPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(390, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLayeredPane12)
                                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(580, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD CUSTOMER", new javax.swing.ImageIcon(getClass().getResource("/addcus.jpg")), jLayeredPane2); // NOI18N

        jLayeredPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jButton10.setBackground(Color.decode("#444C5C"));
        jButton10.setForeground(Color.white);
        jButton10.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add room.png"))); // NOI18N
        jButton10.setText("Add Room");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(2);
            }
        });
        jButton11.setBackground(Color.decode("#CE5A57"));
        jButton11.setForeground(Color.white);
        jButton11.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addcus.jpg"))); // NOI18N
        jButton11.setText("Add Customer");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(1);
            }
        });
        jButton12.setBackground(Color.decode("#78A5A3"));
        jButton12.setForeground(Color.white);
        jButton12.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        jButton12.setText("Book Room");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(0);
            }
        });

        jButton13.setBackground(Color.decode("#E1B16A"));
        jButton13.setForeground(Color.white);
        jButton13.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_available.png"))); // NOI18N
        jButton13.setText("Availability");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jTabbedPane1.setSelectedIndex(3);
                availabilty();
                calculateAvailability();
                calculate();
            }
        });
        jLayeredPane13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel17.setBackground(new java.awt.Color(229, 147, 49));
        jLabel17.setFont(new java.awt.Font("Ubuntu Mono", 1, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(69, 82, 206));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Add New Room");

        jLabel18.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel18.setText("Cost of Room/Day");

        jLabel19.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel19.setText("Room type");

        jLabel20.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel20.setText("Room Number");

        jLabel21.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel21.setText("Wifi (Yes/No)");

        jLabel22.setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        jLabel22.setText("No of Beds");

        jLabel23.setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        jLabel23.setEnabled(false);



        jButton3.setText("Add Room ");

        jLabel24.setEnabled(false);

        jLayeredPane13.setLayer(jLabel17, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel18, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel19, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel20, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel21, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField13, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField14, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField15, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField16, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel22, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField17, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel23, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jTextField18, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jButton3, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane13.setLayer(jLabel24, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane13Layout = new javax.swing.GroupLayout(jLayeredPane13);
        jLayeredPane13.setLayout(jLayeredPane13Layout);
        jLayeredPane13Layout.setHorizontalGroup(
                jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(45, 45, 45)
                                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField13)
                                                        .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(341, Short.MAX_VALUE))
        );
        jLayeredPane13Layout.setVerticalGroup(
                jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane13Layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jLayeredPane3.setLayer(jButton10, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton11, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton12, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton13, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLayeredPane13, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
                jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addComponent(jLayeredPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(397, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
                jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLayeredPane13)
                                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(580, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD ROOM", new javax.swing.ImageIcon(getClass().getResource("/icon.png")), jLayeredPane3); // NOI18N

        jLayeredPane4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jButton14.setBackground(Color.decode("#444C5C"));

        jButton14.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add room.png"))); // NOI18N
        jButton14.setText("Add Room");
        jButton14.setForeground(Color.white);
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(2);
            }
        });

        jButton15.setBackground(Color.decode("#CE5A57"));
        jButton15.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addcus.jpg"))); // NOI18N
        jButton15.setText("Add Customer");
        jButton15.setForeground(Color.white);
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(1);
            }
        });
        jButton16.setBackground(Color.decode("#78A5A3"));
        jButton16.setForeground(Color.white);
        jButton16.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        jButton16.setText("Book Room");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(0);
            }
        });
        jButton17.setBackground(Color.decode("#E1B16A"));
        jButton17.setForeground(Color.white);
        jButton17.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_available.png"))); // NOI18N
        jButton17.setText("Availability");
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTabbedPane1.setSelectedIndex(3);
                availabilty();
                calculate();
                calculateAvailability();
            }
        });

        jLayeredPane11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));



        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Room Number", "Customer ID", "Customer Name"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jLabel25.setFont(new java.awt.Font("Ubuntu Mono", 1, 22)); // NOI18N
        jLabel25.setForeground(new Color(69,82,206));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Room Allocation Table");

        jLabel27.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(67, 193, 235));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Statistics");
        jLabel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel28.setText("Total Rooms");

        jLabel29.setText("Available");

        jLayeredPane11.setLayer(jScrollPane1, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel25, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel27, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel28, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel29, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel30, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel31, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
                jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                                                .addGap(95, 95, 95)
                                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                                                .addGap(63, 63, 63)
                                                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        jLayeredPane11Layout.setVerticalGroup(
                jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(43, 43, 43)
                                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(225, 225, 225)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane4.setLayer(jButton14, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton15, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton16, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton17, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLayeredPane11, JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
                jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(395, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
                jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLayeredPane11)
                                        .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(580, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AVAILABILITY", new javax.swing.ImageIcon(getClass().getResource("/rsz_available.png")), jLayeredPane4); // NOI18N


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        jTextField17.setVisible(false);




        jLayeredPane5.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
                jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(67, 67, 67)
                                                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                        .addComponent(jTextField19)
                                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(1084, Short.MAX_VALUE))
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(1382, Short.MAX_VALUE)))
        );
        jLayeredPane5Layout.setVerticalGroup(
                jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(1345, Short.MAX_VALUE))
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(1515, Short.MAX_VALUE)))
        );
        jLabel34.setText("Room Leaving Form");
        jLabel34.setForeground(Color.blue);
        jLabel32.setText("Customer ID");
        jLabel26.setText("Room Number");
        jLabel34.setFont(new java.awt.Font("Ubuntu Mono", 1, 30));
        jLabel32.setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        jLabel26.setFont(new java.awt.Font("Ubuntu Mono", 1, 18));
        jButton4.setText("Submit");
        jButton4.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=0,rnum=0;
                 id= Integer.parseInt(jTextField20.getText());
                rnum= Integer.parseInt(jTextField19.getText());
                if(id==0&&rnum==0)
                {
                    jLabel33.setForeground(Color.RED);
                    jLabel33.setEnabled(true);
                    jLabel33.setText("Fill in all the fields");

                }
                else {
                    try {
                        int var = db.stmt.executeUpdate("delete from booking where id=" + id + " and rnum=" + rnum);
                    } catch (SQLException r) {
                        System.out.println("error in deleting " + r.getMessage());
                    }
                    jLabel33.setEnabled(true);
                    jLabel33.setForeground(Color.RED);
                    jLabel33.setText("Successfully removed");
                    jTextField19.setText("");
                    jTextField20.setText("");
                }

            }
        });






        jTabbedPane1.addTab("Leave Room", new javax.swing.ImageIcon(getClass().getResource("/12345.png")),jLayeredPane5);

        layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );



















        pack();

    }

    public void availabilty()
    {
        db.rs=null;
        String name=null;
        int id=0,rnum=0;
        int count=0;
        int i=0,j=0,k=0;
        int rcount=0;
        int avail=0;

        i=0;
        try {
            db.rs = db.stmt.executeQuery("select name,id,rnum from booking");
            while (db.rs.next()) {
                name=db.rs.getString(1);
                id=db.rs.getInt(2);
                rnum=db.rs.getInt(3);

                System.out.println(rnum+" "+id+" "+name);
                for (j=0;j<3;j++) {
                    if(j==0)
                        jTable1.setValueAt(rnum,i,j);
                    if(j==1)
                        jTable1.setValueAt(id,i,j);
                    if(j==2)
                        jTable1.setValueAt(name,i,j);
                }
                i++;
                }
                }
        catch (SQLException es)
        {
            System.out.println("exception occurred"+es.getSQLState()+es.getMessage());

        }
        try {
            db.rs.close();
        }
        catch (SQLException er)
        {

        }
        name=null;
        rnum=0;
        id=0;
        i=0;j=0;k=0;
        }
        public void calculate()
        {
            try
            {
                ResultSet rs1 = db.stmt.executeQuery("select count(*) from room");
                while (rs1.next())
                {
                    db.rcount=rs1.getInt(1);
                    System.out.println("rooms :"+db.rcount);
                }

                jLabel30.setEnabled(true);
                jLabel30.setFont(new java.awt.Font("Ubuntu Mono", 1, 22));
                jLabel30.setForeground(new Color(210,0,255));
                jLabel30.setText(Integer.toString(db.rcount));

            }
            catch (SQLException er)
            {
                System.out.println(er.getSQLState()+" "+er.getMessage());
            }
        }
        public void calculateAvailability()
        {
            try {
                ResultSet rs2 = db.stmt.executeQuery("select count(*) from booking");
                while (rs2.next()) {
                    db.avail = db.rcount - rs2.getInt(1);
                    System.out.println("available: " + db.avail);

                }
            }catch (SQLException erd)
            {
                System.out.println(erd.getSQLState()+" "+erd.getMessage());
            }

                jLabel31.setEnabled(true);
            jLabel31.setFont(new java.awt.Font("Ubuntu Mono", 1, 22));

                jLabel31.setForeground(new Color(210,0,255));
            jLabel31.setText(Integer.toString(db.avail));

        }

    public void startConsole() {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new console().setVisible(true);
            }
        });
    }



}
