package model.accettazione;

import java.math.BigDecimal;

import oracle.jbo.client.remote.RowImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class AccPf_SoAccPfas2livViewRowClient extends RowImpl 
{
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public AccPf_SoAccPfas2livViewRowClient()
  {
  }

  public BigDecimal getCodCampione()
  {
    return (BigDecimal)getAttribute("CodCampione");
  }

  public BigDecimal getCodRichiesta()
  {
    return (BigDecimal)getAttribute("CodRichiesta");
  }

  public oracle.jbo.domain.Date getDtcreazione()
  {
    return (oracle.jbo.domain.Date)getAttribute("Dtcreazione");
  }

  public oracle.jbo.domain.Date getDtultmod()
  {
    return (oracle.jbo.domain.Date)getAttribute("Dtultmod");
  }

  public Integer getIdaccpf2liv()
  {
    return (Integer)getAttribute("Idaccpf2liv");
  }

  public Integer getIdinvito()
  {
    return (Integer)getAttribute("Idinvito");
  }

  public String getNote()
  {
    return (String)getAttribute("Note");
  }

  public String getOpcreazione()
  {
    return (String)getAttribute("Opcreazione");
  }

  public String getOpultmod()
  {
    return (String)getAttribute("Opultmod");
  }

  public void setCodCampione(BigDecimal value)
  {
    setAttribute("CodCampione", value);
  }

  public void setCodRichiesta(BigDecimal value)
  {
    setAttribute("CodRichiesta", value);
  }

  public void setDtcreazione(oracle.jbo.domain.Date value)
  {
    setAttribute("Dtcreazione", value);
  }

  public void setDtultmod(oracle.jbo.domain.Date value)
  {
    setAttribute("Dtultmod", value);
  }

  public void setIdaccpf2liv(Integer value)
  {
    setAttribute("Idaccpf2liv", value);
  }

  public void setIdinvito(Integer value)
  {
    setAttribute("Idinvito", value);
  }

  public void setNote(String value)
  {
    setAttribute("Note", value);
  }

  public void setOpcreazione(String value)
  {
    setAttribute("Opcreazione", value);
  }

  public void setOpultmod(String value)
  {
    setAttribute("Opultmod", value);
  }



























































































}