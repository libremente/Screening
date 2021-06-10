package model.referto.client;

import oracle.jbo.RowIterator;
import oracle.jbo.client.remote.RowImpl;
import oracle.jbo.domain.Date;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Ref_SoRefertomammo1livViewRowClient extends RowImpl implements model.referto.common.Ref_SoRefertomammo1livViewRow 
{
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public Ref_SoRefertomammo1livViewRowClient()
  {
  }


    public RowIterator getRef_SoCnfSugg1livView() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "getRef_SoCnfSugg1livView", null, null);
        return (RowIterator) _ret;
    }

    public RowIterator getRef_SoCodref1livmaView() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "getRef_SoCodref1livmaView", null, null);
        return (RowIterator) _ret;
    }

    public RowIterator getRef_SoCodref1livmaView1() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this, "getRef_SoCodref1livmaView1", null, null);
        return (RowIterator) _ret;
    }

    public RowIterator getRef_SoCodref1livmaView2() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this, "getRef_SoCodref1livmaView2", null, null);
        return (RowIterator) _ret;
    }

    public RowIterator getRef_SoCodref1livmaView3() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this, "getRef_SoCodref1livmaView3", null, null);
        return (RowIterator) _ret;
    }

    public String getCodiceReferto() {
        return (String) getAttribute("CodiceReferto");
    }

    public String getCodts() {
        return (String) getAttribute("Codts");
    }

    public Integer getCompleto() {
        return (Integer) getAttribute("Completo");
    }

    public Integer getDensita() {
        return (Integer) getAttribute("Densita");
    }

    public Date getDtcreazione() {
        return (Date) getAttribute("Dtcreazione");
    }

    public Date getDtinserimento() {
        return (Date) getAttribute("Dtinserimento");
    }

    public Date getDtmammo() {
        return (Date) getAttribute("Dtmammo");
    }

    public Date getDtreferto() {
        return (Date) getAttribute("Dtreferto");
    }

    public Date getDtspedizione() {
        return (Date) getAttribute("Dtspedizione");
    }

    public Date getDtultmodifica() {
        return (Date) getAttribute("Dtultmodifica");
    }

    public Integer getEsito() {
        return (Integer) getAttribute("Esito");
    }

    public String getGrEsito() {
        return (String) getAttribute("GrEsito");
    }

    public Integer getIdallegato() {
        return (Integer) getAttribute("Idallegato");
    }

    public Integer getIdcentroref() {
        return (Integer) getAttribute("Idcentroref");
    }

    public Integer getIdinvito() {
        return (Integer) getAttribute("Idinvito");
    }

    public Integer getIdreferto() {
        return (Integer) getAttribute("Idreferto");
    }

    public Integer getIdsugg() {
        return (Integer) getAttribute("Idsugg");
    }

    public String getL1AltreIndicazioni() {
        return (String) getAttribute("L1AltreIndicazioni");
    }

    public Integer getL1Esito() {
        return (Integer) getAttribute("L1Esito");
    }

    public String getL1Note() {
        return (String) getAttribute("L1Note");
    }

    public Integer getL1Radiologo() {
        return (Integer) getAttribute("L1Radiologo");
    }

    public Integer getL1Sugg() {
        return (Integer) getAttribute("L1Sugg");
    }

    public String getL2AltreIndicazioni() {
        return (String) getAttribute("L2AltreIndicazioni");
    }

    public Integer getL2Esito() {
        return (Integer) getAttribute("L2Esito");
    }

    public String getL2Note() {
        return (String) getAttribute("L2Note");
    }

    public Integer getL2Radiologo() {
        return (Integer) getAttribute("L2Radiologo");
    }

    public Integer getL2Sugg() {
        return (Integer) getAttribute("L2Sugg");
    }

    public String getOpinserimento() {
        return (String) getAttribute("Opinserimento");
    }

    public String getOpultmodifica() {
        return (String) getAttribute("Opultmodifica");
    }

    public String getRAltreIndicazioni() {
        return (String) getAttribute("RAltreIndicazioni");
    }

    public Integer getREsito() {
        return (Integer) getAttribute("REsito");
    }

    public String getRNote() {
        return (String) getAttribute("RNote");
    }

    public Integer getRRadiologo() {
        return (Integer) getAttribute("RRadiologo");
    }

    public Integer getRSugg() {
        return (Integer) getAttribute("RSugg");
    }

    public Integer getRevisione() {
        return (Integer) getAttribute("Revisione");
    }

    public Integer getTpreferto() {
        return (Integer) getAttribute("Tpreferto");
    }

    public String getTpscr() {
        return (String) getAttribute("Tpscr");
    }

    public String getUlss() {
        return (String) getAttribute("Ulss");
    }

    public void setCodiceReferto(String value) {
        setAttribute("CodiceReferto", value);
    }

    public void setCodts(String value) {
        setAttribute("Codts", value);
    }

    public void setCompleto(Integer value) {
        setAttribute("Completo", value);
    }

    public void setDensita(Integer value) {
        setAttribute("Densita", value);
    }

    public void setDtcreazione(Date value) {
        setAttribute("Dtcreazione", value);
    }

    public void setDtinserimento(Date value) {
        setAttribute("Dtinserimento", value);
    }

    public void setDtmammo(Date value) {
        setAttribute("Dtmammo", value);
    }

    public void setDtreferto(Date value) {
        setAttribute("Dtreferto", value);
    }

    public void setDtspedizione(Date value) {
        setAttribute("Dtspedizione", value);
    }

    public void setDtultmodifica(Date value) {
        setAttribute("Dtultmodifica", value);
    }

    public void setEsito(Integer value) {
        setAttribute("Esito", value);
    }

    public void setGrEsito(String value) {
        setAttribute("GrEsito", value);
    }

    public void setIdallegato(Integer value) {
        setAttribute("Idallegato", value);
    }

    public void setIdcentroref(Integer value) {
        setAttribute("Idcentroref", value);
    }

    public void setIdinvito(Integer value) {
        setAttribute("Idinvito", value);
    }

    public void setIdreferto(Integer value) {
        setAttribute("Idreferto", value);
    }

    public void setIdsugg(Integer value) {
        setAttribute("Idsugg", value);
    }

    public void setL1AltreIndicazioni(String value) {
        setAttribute("L1AltreIndicazioni", value);
    }

    public void setL1Esito(Integer value) {
        setAttribute("L1Esito", value);
    }

    public void setL1Note(String value) {
        setAttribute("L1Note", value);
    }

    public void setL1Radiologo(Integer value) {
        setAttribute("L1Radiologo", value);
    }

    public void setL1Sugg(Integer value) {
        setAttribute("L1Sugg", value);
    }

    public void setL2AltreIndicazioni(String value) {
        setAttribute("L2AltreIndicazioni", value);
    }

    public void setL2Esito(Integer value) {
        setAttribute("L2Esito", value);
    }

    public void setL2Note(String value) {
        setAttribute("L2Note", value);
    }

    public void setL2Radiologo(Integer value) {
        setAttribute("L2Radiologo", value);
    }

    public void setL2Sugg(Integer value) {
        setAttribute("L2Sugg", value);
    }

    public void setOpinserimento(String value) {
        setAttribute("Opinserimento", value);
    }

    public void setOpultmodifica(String value) {
        setAttribute("Opultmodifica", value);
    }

    public void setRAltreIndicazioni(String value) {
        setAttribute("RAltreIndicazioni", value);
    }

    public void setREsito(Integer value) {
        setAttribute("REsito", value);
    }

    public void setRNote(String value) {
        setAttribute("RNote", value);
    }

    public void setRRadiologo(Integer value) {
        setAttribute("RRadiologo", value);
    }

    public void setRSugg(Integer value) {
        setAttribute("RSugg", value);
    }

    public void setRevisione(Integer value) {
        setAttribute("Revisione", value);
    }

    public void setTpreferto(Integer value) {
        setAttribute("Tpreferto", value);
    }

    public void setTpscr(String value) {
        setAttribute("Tpscr", value);
    }

    public void setUlss(String value) {
        setAttribute("Ulss", value);
    }
}