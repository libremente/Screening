package model.common;

import oracle.jbo.Row;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public interface Agenda_SoAppuntamentoViewRow extends Row {
    Integer getIdapp();

  void setIdapp(Integer value);

    Integer getIdcentro();

  void setIdcentro(Integer value);

  oracle.jbo.domain.Date getDtapp();

  void setDtapp(oracle.jbo.domain.Date value);

    Integer getOraapp();

  void setOraapp(Integer value);

    Integer getMinapp();

  void setMinapp(Integer value);

  Integer getDispslot();

  void setDispslot(Integer value);

  String getTpsrc();

  void setTpsrc(String value);



  String getOrario();


    String getRigaSalvata();

  void setRigaSalvata(String value);

  oracle.jbo.RowIterator getAgenda_DettAppColonView();

  oracle.jbo.RowIterator getAgenda_DettAppView();

    Integer getSlotoccup();

  void setSlotoccup(Integer value);


    String getStato();


    void setStato(String value);

    Integer getNascosto();

    void setNascosto(Integer value);
}