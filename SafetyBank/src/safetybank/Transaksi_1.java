/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetybank;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author WISNU
 */
@Entity
@Table(name = "transaksi", catalog = "bank_bca", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaksi_1.findAll", query = "SELECT t FROM Transaksi_1 t"),
    @NamedQuery(name = "Transaksi_1.findByNoTransaksi", query = "SELECT t FROM Transaksi_1 t WHERE t.noTransaksi = :noTransaksi"),
    @NamedQuery(name = "Transaksi_1.findByJenisTrans", query = "SELECT t FROM Transaksi_1 t WHERE t.jenisTrans = :jenisTrans"),
    @NamedQuery(name = "Transaksi_1.findByNoRek", query = "SELECT t FROM Transaksi_1 t WHERE t.noRek = :noRek"),
    @NamedQuery(name = "Transaksi_1.findByTanggal", query = "SELECT t FROM Transaksi_1 t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "Transaksi_1.findByKeterangan", query = "SELECT t FROM Transaksi_1 t WHERE t.keterangan = :keterangan"),
    @NamedQuery(name = "Transaksi_1.findBySaldo", query = "SELECT t FROM Transaksi_1 t WHERE t.saldo = :saldo")})
public class Transaksi_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "No_Transaksi")
    private Integer noTransaksi;
    @Basic(optional = false)
    @Column(name = "Jenis_Trans")
    private String jenisTrans;
    @Basic(optional = false)
    @Column(name = "No_Rek")
    private int noRek;
    @Basic(optional = false)
    @Column(name = "Tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @Basic(optional = false)
    @Column(name = "Saldo")
    private int saldo;

    public Transaksi_1() {
    }

    public Transaksi_1(Integer noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public Transaksi_1(Integer noTransaksi, String jenisTrans, int noRek, Date tanggal, String keterangan, int saldo) {
        this.noTransaksi = noTransaksi;
        this.jenisTrans = jenisTrans;
        this.noRek = noRek;
        this.tanggal = tanggal;
        this.keterangan = keterangan;
        this.saldo = saldo;
    }

    public Integer getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(Integer noTransaksi) {
        Integer oldNoTransaksi = this.noTransaksi;
        this.noTransaksi = noTransaksi;
        changeSupport.firePropertyChange("noTransaksi", oldNoTransaksi, noTransaksi);
    }

    public String getJenisTrans() {
        return jenisTrans;
    }

    public void setJenisTrans(String jenisTrans) {
        String oldJenisTrans = this.jenisTrans;
        this.jenisTrans = jenisTrans;
        changeSupport.firePropertyChange("jenisTrans", oldJenisTrans, jenisTrans);
    }

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        int oldNoRek = this.noRek;
        this.noRek = noRek;
        changeSupport.firePropertyChange("noRek", oldNoRek, noRek);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        Date oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        int oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noTransaksi != null ? noTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi_1)) {
            return false;
        }
        Transaksi_1 other = (Transaksi_1) object;
        if ((this.noTransaksi == null && other.noTransaksi != null) || (this.noTransaksi != null && !this.noTransaksi.equals(other.noTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "safetybank.Transaksi_1[ noTransaksi=" + noTransaksi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
