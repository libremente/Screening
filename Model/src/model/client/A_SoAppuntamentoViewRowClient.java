package model.client;

import oracle.jbo.client.remote.RowImpl;
import oracle.jbo.domain.Date;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class A_SoAppuntamentoViewRowClient extends RowImpl {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public A_SoAppuntamentoViewRowClient()
  {
  }


    public Integer getIdapp() {
        return (Integer) getAttribute("Idapp");
    }

    public void setIdapp(Integer value) {
        setAttribute("Idapp", value);
    }

    public Integer getIdcentro() {
        return (Integer) getAttribute("Idcentro");
    }

    public void setIdcentro(Integer value) {
        setAttribute("Idcentro", value);
    }

    public Date getDtapp() {
        return (Date)getAttribute("Dtapp");
    }

    public void setDtapp(Date value) {
        setAttribute("Dtapp", value);
    }

    public Integer getOraapp() {
        return (Integer) getAttribute("Oraapp");
    }

    public void setOraapp(Integer value) {
        setAttribute("Oraapp", value);
    }

    public Integer getMinapp() {
        return (Integer) getAttribute("Minapp");
    }

    public void setMinapp(Integer value) {
        setAttribute("Minapp", value);
    }

    public Integer getDispslot() {
        return (Integer) getAttribute("Dispslot");
    }

    public void setDispslot(Integer value) {
        setAttribute("Dispslot", value);
    }

    public String getTpsrc() {
        return (String)getAttribute("Tpsrc");
    }

    public void setTpsrc(String value) {
        setAttribute("Tpsrc", value);
    }

    public Integer getIdcentroref() {
        return (Integer) getAttribute("Idcentroref");
    }

    public String getDescrizione() {
        return (String)getAttribute("Descrizione");
    }

    public String getIndirizzoRes() {
        return (String)getAttribute("IndirizzoRes");
    }

    public Integer getIdcentro1() {
        return (Integer) getAttribute("Idcentro1");
    }

    public String getOraritel() {
        return (String)getAttribute("Oraritel");
    }

    public String getSede() {
        return (String)getAttribute("Sede");
    }

    public String getTel() {
        return (String)getAttribute("Tel");
    }

    public void setDescrizione(String value) {
        setAttribute("Descrizione", value);
    }

    public void setIdcentro1(Integer value) {
        setAttribute("Idcentro1", value);
    }

    public void setIdcentroref(Integer value) {
        setAttribute("Idcentroref", value);
    }

    public void setIndirizzoRes(String value) {
        setAttribute("IndirizzoRes", value);
    }

    public void setOraritel(String value) {
        setAttribute("Oraritel", value);
    }

    public void setSede(String value) {
        setAttribute("Sede", value);
    }

    public void setTel(String value) {
        setAttribute("Tel", value);
    }
}