package model.common;

import oracle.jbo.Row;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public interface A_SoAllegatoViewRow extends Row {
    Integer getIdallegato();

  void setIdallegato(Integer value);

    Integer getIdinvito();

  void setIdinvito(Integer value);

  String getCodts();

  void setCodts(String value);

  oracle.jbo.domain.BlobDomain getLettera();

  void setLettera(oracle.jbo.domain.BlobDomain value);

  oracle.jbo.domain.Date getDtcreazione();

  void setDtcreazione(oracle.jbo.domain.Date value);

  oracle.jbo.domain.Date getDtstampa();

  void setDtstampa(oracle.jbo.domain.Date value);

    Integer getStampapostel();

  void setStampapostel(Integer value);

  String getUlss();

  void setUlss(String value);

  String getTpscr();

  void setTpscr(String value);
}