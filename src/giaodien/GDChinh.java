package giaodien;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import xuli.ChuyenManHinh;
import xuli.DanhMucBean;

/**
 *
 * @author vanphatdev
 */
public class GDChinh extends javax.swing.JFrame {

    private boolean isThuGonMenu = false;
    
    /**
     * Creates new form GDChinh
     */
    public GDChinh() {
        icon();
        this.setTitle("Quản lí khách sạn - VinaHotel");
        initComponents();
        
        ChuyenManHinh dieuKhien = new ChuyenManHinh(pNoiDung);
        dieuKhien.setManHinhNoiDung(pQLPhong, lblQLPhong);
        
        List<DanhMucBean> listDanhMucBean = new ArrayList<>();
        listDanhMucBean.add(new DanhMucBean("QLPhong", pQLPhong, lblQLPhong));
        listDanhMucBean.add(new DanhMucBean("QLDichVu", pQLDichVu, lblQLDichVu));
        listDanhMucBean.add(new DanhMucBean("QLKhachHang", pQLKhachHang, lblQLKhachHang));
        listDanhMucBean.add(new DanhMucBean("QLNhanVien", pQLNhanVien, lblQLNhanVien));
        listDanhMucBean.add(new DanhMucBean("QLThuChi", pQLThuChi, lblQLThuChi));
        
        dieuKhien.setSuKienClickDanhMuc(listDanhMucBean);
    }
    
    public void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/hinhanh/Logo_big.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pChinh = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        pTieuDe = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        pQLPhong = new javax.swing.JPanel();
        lblQLPhong = new javax.swing.JLabel();
        pQLDichVu = new javax.swing.JPanel();
        lblQLDichVu = new javax.swing.JLabel();
        pQLKhachHang = new javax.swing.JPanel();
        lblQLKhachHang = new javax.swing.JLabel();
        pDangXuat = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        pQLNhanVien = new javax.swing.JPanel();
        lblQLNhanVien = new javax.swing.JLabel();
        pQLThuChi = new javax.swing.JPanel();
        lblQLThuChi = new javax.swing.JLabel();
        pNoiDung = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1340, 740));

        pChinh.setBackground(new java.awt.Color(243, 246, 249));

        pMenu.setBackground(new java.awt.Color(206, 229, 240));
        pMenu.setPreferredSize(new java.awt.Dimension(200, 688));

        pTieuDe.setBackground(new java.awt.Color(206, 229, 240));
        pTieuDe.setPreferredSize(new java.awt.Dimension(200, 60));

        lblTieuDe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(204, 0, 51));
        lblTieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/Logo_small.jpg"))); // NOI18N
        lblTieuDe.setText("VinaHotel");
        lblTieuDe.setToolTipText("Thu phóng menu");
        lblTieuDe.setIconTextGap(8);
        lblTieuDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTieuDeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pTieuDeLayout = new javax.swing.GroupLayout(pTieuDe);
        pTieuDe.setLayout(pTieuDeLayout);
        pTieuDeLayout.setHorizontalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTieuDeLayout.setVerticalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTieuDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pQLPhong.setBackground(new java.awt.Color(206, 229, 240));

        lblQLPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQLPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/houses_32px.png"))); // NOI18N
        lblQLPhong.setText("QL phòng");
        lblQLPhong.setToolTipText("Quản lí phòng");
        lblQLPhong.setIconTextGap(24);

        javax.swing.GroupLayout pQLPhongLayout = new javax.swing.GroupLayout(pQLPhong);
        pQLPhong.setLayout(pQLPhongLayout);
        pQLPhongLayout.setHorizontalGroup(
            pQLPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLPhongLayout.setVerticalGroup(
            pQLPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pQLDichVu.setBackground(new java.awt.Color(206, 229, 240));

        lblQLDichVu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQLDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/service_32px.png"))); // NOI18N
        lblQLDichVu.setText("QL dịch vụ");
        lblQLDichVu.setToolTipText("Quản lí dịch vụ");
        lblQLDichVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        lblQLDichVu.setIconTextGap(24);

        javax.swing.GroupLayout pQLDichVuLayout = new javax.swing.GroupLayout(pQLDichVu);
        pQLDichVu.setLayout(pQLDichVuLayout);
        pQLDichVuLayout.setHorizontalGroup(
            pQLDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLDichVuLayout.setVerticalGroup(
            pQLDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        pQLKhachHang.setBackground(new java.awt.Color(206, 229, 240));
        pQLKhachHang.setPreferredSize(new java.awt.Dimension(0, 60));

        lblQLKhachHang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/customer_32px.png"))); // NOI18N
        lblQLKhachHang.setText("QL khách hàng");
        lblQLKhachHang.setToolTipText("Quản lí khách hàng");
        lblQLKhachHang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        lblQLKhachHang.setIconTextGap(24);

        javax.swing.GroupLayout pQLKhachHangLayout = new javax.swing.GroupLayout(pQLKhachHang);
        pQLKhachHang.setLayout(pQLKhachHangLayout);
        pQLKhachHangLayout.setHorizontalGroup(
            pQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLKhachHangLayout.setVerticalGroup(
            pQLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pDangXuat.setBackground(new java.awt.Color(206, 229, 240));
        pDangXuat.setPreferredSize(new java.awt.Dimension(0, 60));

        lblDangXuat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/logout_32px.png"))); // NOI18N
        lblDangXuat.setText("Đăng xuất");
        lblDangXuat.setToolTipText("ALT + F4");
        lblDangXuat.setIconTextGap(24);

        javax.swing.GroupLayout pDangXuatLayout = new javax.swing.GroupLayout(pDangXuat);
        pDangXuat.setLayout(pDangXuatLayout);
        pDangXuatLayout.setHorizontalGroup(
            pDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDangXuatLayout.setVerticalGroup(
            pDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pQLNhanVien.setBackground(new java.awt.Color(206, 229, 240));

        lblQLNhanVien.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/employee_32px.png"))); // NOI18N
        lblQLNhanVien.setText("QL nhân viên");
        lblQLNhanVien.setToolTipText("Quản lí nhân viên");
        lblQLNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        lblQLNhanVien.setIconTextGap(24);

        javax.swing.GroupLayout pQLNhanVienLayout = new javax.swing.GroupLayout(pQLNhanVien);
        pQLNhanVien.setLayout(pQLNhanVienLayout);
        pQLNhanVienLayout.setHorizontalGroup(
            pQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLNhanVienLayout.setVerticalGroup(
            pQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pQLThuChi.setBackground(new java.awt.Color(206, 229, 240));

        lblQLThuChi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQLThuChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/payment_32px.png"))); // NOI18N
        lblQLThuChi.setText("QL thu chi");
        lblQLThuChi.setToolTipText("Quản lí thu chi");
        lblQLThuChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 102)));
        lblQLThuChi.setIconTextGap(24);

        javax.swing.GroupLayout pQLThuChiLayout = new javax.swing.GroupLayout(pQLThuChi);
        pQLThuChi.setLayout(pQLThuChiLayout);
        pQLThuChiLayout.setHorizontalGroup(
            pQLThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLThuChiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLThuChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLThuChiLayout.setVerticalGroup(
            pQLThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLThuChi, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(pDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(pQLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLThuChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addComponent(pTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pQLPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLThuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pNoiDung.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pNoiDungLayout = new javax.swing.GroupLayout(pNoiDung);
        pNoiDung.setLayout(pNoiDungLayout);
        pNoiDungLayout.setHorizontalGroup(
            pNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
        );
        pNoiDungLayout.setVerticalGroup(
            pNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pChinhLayout = new javax.swing.GroupLayout(pChinh);
        pChinh.setLayout(pChinhLayout);
        pChinhLayout.setHorizontalGroup(
            pChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChinhLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pChinhLayout.setVerticalGroup(
            pChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addComponent(pNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTieuDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTieuDeMouseClicked
        if (isThuGonMenu == false) {
            pMenu.setPreferredSize(new Dimension(68,688));
            pMenu.revalidate();
            pMenu.repaint();
            isThuGonMenu = true;
        } else {
            pMenu.setPreferredSize(new Dimension(200,688));
            pMenu.revalidate();
            pMenu.repaint();
            isThuGonMenu = false;
        }
    }//GEN-LAST:event_lblTieuDeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblQLDichVu;
    private javax.swing.JLabel lblQLKhachHang;
    private javax.swing.JLabel lblQLNhanVien;
    private javax.swing.JLabel lblQLPhong;
    private javax.swing.JLabel lblQLThuChi;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pChinh;
    private javax.swing.JPanel pDangXuat;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pNoiDung;
    private javax.swing.JPanel pQLDichVu;
    private javax.swing.JPanel pQLKhachHang;
    private javax.swing.JPanel pQLNhanVien;
    private javax.swing.JPanel pQLPhong;
    private javax.swing.JPanel pQLThuChi;
    private javax.swing.JPanel pTieuDe;
    // End of variables declaration//GEN-END:variables
}
