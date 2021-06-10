package model.global;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Date;
import oracle.jbo.Key;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class A_SoOldDocsImpl extends EntityImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Idallegato {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getIdallegato();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setIdallegato((Integer) value);
            }
        }
        ,
        Iddocumento {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getIddocumento();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setIddocumento((Integer) value);
            }
        }
        ,
        Tipolettera {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTipolettera();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTipolettera((Integer) value);
            }
        }
        ,
        Codtempl {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCodtempl();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCodtempl((Integer) value);
            }
        }
        ,
        Cognome {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCognome();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCognome((String) value);
            }
        }
        ,
        Nome {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getNome();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setNome((String) value);
            }
        }
        ,
        Indirizzo {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getIndirizzo();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setIndirizzo((String) value);
            }
        }
        ,
        Cap {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCap();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCap((String) value);
            }
        }
        ,
        Comune {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getComune();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setComune((String) value);
            }
        }
        ,
        Provincia {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getProvincia();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setProvincia((String) value);
            }
        }
        ,
        Centro {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCentro();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCentro((String) value);
            }
        }
        ,
        IndirizzoCentro {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getIndirizzoCentro();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setIndirizzoCentro((String) value);
            }
        }
        ,
        DataApp {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getDataApp();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setDataApp((String) value);
            }
        }
        ,
        OraApp {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getOraApp();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setOraApp((String) value);
            }
        }
        ,
        Medico {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getMedico();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setMedico((String) value);
            }
        }
        ,
        DataEsame {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getDataEsame();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setDataEsame((String) value);
            }
        }
        ,
        CodiceCampione {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCodiceCampione();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCodiceCampione((String) value);
            }
        }
        ,
        TesseraSanitaria {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTesseraSanitaria();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTesseraSanitaria((String) value);
            }
        }
        ,
        CodiceFiscale {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCodiceFiscale();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCodiceFiscale((String) value);
            }
        }
        ,
        DataNascita {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getDataNascita();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setDataNascita((String) value);
            }
        }
        ,
        CognomeMarito {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCognomeMarito();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCognomeMarito((String) value);
            }
        }
        ,
        Telefono1 {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTelefono1();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTelefono1((String) value);
            }
        }
        ,
        Telefono2 {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTelefono2();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTelefono2((String) value);
            }
        }
        ,
        CentroReferto {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getCentroReferto();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setCentroReferto((String) value);
            }
        }
        ,
        DataCreazione {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getDataCreazione();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setDataCreazione((Date) value);
            }
        }
        ,
        DataStampa {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getDataStampa();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setDataStampa((Date) value);
            }
        }
        ,
        Postel {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getPostel();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setPostel((Integer) value);
            }
        }
        ,
        Ulss {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getUlss();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setUlss((String) value);
            }
        }
        ,
        Tpscr {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTpscr();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTpscr((String) value);
            }
        }
        ,
        Importato {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getImportato();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setImportato((Integer) value);
            }
        }
        ,
        GiorniOrari {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getGiorniOrari();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setGiorniOrari((String) value);
            }
        }
        ,
        Telefono {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getTelefono();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setTelefono((String) value);
            }
        }
        ,
        IntFirmaInviti {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getIntFirmaInviti();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setIntFirmaInviti((String) value);
            }
        }
        ,
        FirmaInviti {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getFirmaInviti();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setFirmaInviti((String) value);
            }
        }
        ,
        FirmaRef1 {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getFirmaRef1();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setFirmaRef1((String) value);
            }
        }
        ,
        FirmaRef2 {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getFirmaRef2();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setFirmaRef2((String) value);
            }
        }
        ,
        Luogo {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getLuogo();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setLuogo((String) value);
            }
        }
        ,
        Altro {
            public Object get(A_SoOldDocsImpl obj) {
                return obj.getAltro();
            }

            public void put(A_SoOldDocsImpl obj, Object value) {
                obj.setAltro((String) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(A_SoOldDocsImpl object);

        public abstract void put(A_SoOldDocsImpl object, Object value);

        public int index() {
            return A_SoOldDocsImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return A_SoOldDocsImpl.AttributesEnum.firstIndex() + A_SoOldDocsImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = A_SoOldDocsImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IDALLEGATO = AttributesEnum.Idallegato.index();
    public static final int IDDOCUMENTO = AttributesEnum.Iddocumento.index();
    public static final int TIPOLETTERA = AttributesEnum.Tipolettera.index();
    public static final int CODTEMPL = AttributesEnum.Codtempl.index();
    public static final int COGNOME = AttributesEnum.Cognome.index();
    public static final int NOME = AttributesEnum.Nome.index();
    public static final int INDIRIZZO = AttributesEnum.Indirizzo.index();
    public static final int CAP = AttributesEnum.Cap.index();
    public static final int COMUNE = AttributesEnum.Comune.index();
    public static final int PROVINCIA = AttributesEnum.Provincia.index();
    public static final int CENTRO = AttributesEnum.Centro.index();
    public static final int INDIRIZZOCENTRO = AttributesEnum.IndirizzoCentro.index();
    public static final int DATAAPP = AttributesEnum.DataApp.index();
    public static final int ORAAPP = AttributesEnum.OraApp.index();
    public static final int MEDICO = AttributesEnum.Medico.index();
    public static final int DATAESAME = AttributesEnum.DataEsame.index();
    public static final int CODICECAMPIONE = AttributesEnum.CodiceCampione.index();
    public static final int TESSERASANITARIA = AttributesEnum.TesseraSanitaria.index();
    public static final int CODICEFISCALE = AttributesEnum.CodiceFiscale.index();
    public static final int DATANASCITA = AttributesEnum.DataNascita.index();
    public static final int COGNOMEMARITO = AttributesEnum.CognomeMarito.index();
    public static final int TELEFONO1 = AttributesEnum.Telefono1.index();
    public static final int TELEFONO2 = AttributesEnum.Telefono2.index();
    public static final int CENTROREFERTO = AttributesEnum.CentroReferto.index();
    public static final int DATACREAZIONE = AttributesEnum.DataCreazione.index();
    public static final int DATASTAMPA = AttributesEnum.DataStampa.index();
    public static final int POSTEL = AttributesEnum.Postel.index();
    public static final int ULSS = AttributesEnum.Ulss.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int IMPORTATO = AttributesEnum.Importato.index();
    public static final int GIORNIORARI = AttributesEnum.GiorniOrari.index();
    public static final int TELEFONO = AttributesEnum.Telefono.index();
    public static final int INTFIRMAINVITI = AttributesEnum.IntFirmaInviti.index();
    public static final int FIRMAINVITI = AttributesEnum.FirmaInviti.index();
    public static final int FIRMAREF1 = AttributesEnum.FirmaRef1.index();
    public static final int FIRMAREF2 = AttributesEnum.FirmaRef2.index();
    public static final int LUOGO = AttributesEnum.Luogo.index();
    public static final int ALTRO = AttributesEnum.Altro.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public A_SoOldDocsImpl()
  {
  }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.global.A_SoOldDocs");
    }


    /**
     *
     *  Gets the attribute value for Idallegato, using the alias name Idallegato
     */
    public Integer getIdallegato()
  {
        return (Integer) getAttributeInternal(IDALLEGATO);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idallegato
   */
  public void setIdallegato(Integer value)
  {
    setAttributeInternal(IDALLEGATO, value);
  }

  /**
     *
     *  Gets the attribute value for Iddocumento, using the alias name Iddocumento
     */
    public Integer getIddocumento()
  {
        return (Integer) getAttributeInternal(IDDOCUMENTO);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Iddocumento
   */
  public void setIddocumento(Integer value)
  {
    setAttributeInternal(IDDOCUMENTO, value);
  }

  /**
     *
     *  Gets the attribute value for Tipolettera, using the alias name Tipolettera
     */
    public Integer getTipolettera()
  {
        return (Integer) getAttributeInternal(TIPOLETTERA);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Tipolettera
   */
  public void setTipolettera(Integer value)
  {
    setAttributeInternal(TIPOLETTERA, value);
  }

  /**
     *
     *  Gets the attribute value for Codtempl, using the alias name Codtempl
     */
    public Integer getCodtempl()
  {
        return (Integer) getAttributeInternal(CODTEMPL);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Codtempl
   */
  public void setCodtempl(Integer value)
  {
    setAttributeInternal(CODTEMPL, value);
  }

  /**
   * 
   *  Gets the attribute value for Cognome, using the alias name Cognome
   */
  public String getCognome()
  {
    return (String)getAttributeInternal(COGNOME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Cognome
   */
  public void setCognome(String value)
  {
    setAttributeInternal(COGNOME, value);
  }

  /**
   * 
   *  Gets the attribute value for Nome, using the alias name Nome
   */
  public String getNome()
  {
    return (String)getAttributeInternal(NOME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Nome
   */
  public void setNome(String value)
  {
    setAttributeInternal(NOME, value);
  }

  /**
   * 
   *  Gets the attribute value for Indirizzo, using the alias name Indirizzo
   */
  public String getIndirizzo()
  {
    return (String)getAttributeInternal(INDIRIZZO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Indirizzo
   */
  public void setIndirizzo(String value)
  {
    setAttributeInternal(INDIRIZZO, value);
  }

  /**
   * 
   *  Gets the attribute value for Cap, using the alias name Cap
   */
  public String getCap()
  {
    return (String)getAttributeInternal(CAP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Cap
   */
  public void setCap(String value)
  {
    setAttributeInternal(CAP, value);
  }

  /**
   * 
   *  Gets the attribute value for Comune, using the alias name Comune
   */
  public String getComune()
  {
    return (String)getAttributeInternal(COMUNE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Comune
   */
  public void setComune(String value)
  {
    setAttributeInternal(COMUNE, value);
  }

  /**
   * 
   *  Gets the attribute value for Provincia, using the alias name Provincia
   */
  public String getProvincia()
  {
    return (String)getAttributeInternal(PROVINCIA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Provincia
   */
  public void setProvincia(String value)
  {
    setAttributeInternal(PROVINCIA, value);
  }

  /**
   * 
   *  Gets the attribute value for Centro, using the alias name Centro
   */
  public String getCentro()
  {
    return (String)getAttributeInternal(CENTRO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Centro
   */
  public void setCentro(String value)
  {
    setAttributeInternal(CENTRO, value);
  }

  /**
   * 
   *  Gets the attribute value for IndirizzoCentro, using the alias name IndirizzoCentro
   */
  public String getIndirizzoCentro()
  {
    return (String)getAttributeInternal(INDIRIZZOCENTRO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for IndirizzoCentro
   */
  public void setIndirizzoCentro(String value)
  {
    setAttributeInternal(INDIRIZZOCENTRO, value);
  }

  /**
   * 
   *  Gets the attribute value for DataApp, using the alias name DataApp
   */
  public String getDataApp()
  {
    return (String)getAttributeInternal(DATAAPP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DataApp
   */
  public void setDataApp(String value)
  {
    setAttributeInternal(DATAAPP, value);
  }

  /**
   * 
   *  Gets the attribute value for OraApp, using the alias name OraApp
   */
  public String getOraApp()
  {
    return (String)getAttributeInternal(ORAAPP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for OraApp
   */
  public void setOraApp(String value)
  {
    setAttributeInternal(ORAAPP, value);
  }

  /**
   * 
   *  Gets the attribute value for Medico, using the alias name Medico
   */
  public String getMedico()
  {
    return (String)getAttributeInternal(MEDICO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Medico
   */
  public void setMedico(String value)
  {
    setAttributeInternal(MEDICO, value);
  }

  /**
   * 
   *  Gets the attribute value for DataEsame, using the alias name DataEsame
   */
  public String getDataEsame()
  {
    return (String)getAttributeInternal(DATAESAME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DataEsame
   */
  public void setDataEsame(String value)
  {
    setAttributeInternal(DATAESAME, value);
  }

  /**
   * 
   *  Gets the attribute value for CodiceCampione, using the alias name CodiceCampione
   */
  public String getCodiceCampione()
  {
    return (String)getAttributeInternal(CODICECAMPIONE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CodiceCampione
   */
  public void setCodiceCampione(String value)
  {
    setAttributeInternal(CODICECAMPIONE, value);
  }

  /**
   * 
   *  Gets the attribute value for TesseraSanitaria, using the alias name TesseraSanitaria
   */
  public String getTesseraSanitaria()
  {
    return (String)getAttributeInternal(TESSERASANITARIA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for TesseraSanitaria
   */
  public void setTesseraSanitaria(String value)
  {
    setAttributeInternal(TESSERASANITARIA, value);
  }

  /**
   * 
   *  Gets the attribute value for CodiceFiscale, using the alias name CodiceFiscale
   */
  public String getCodiceFiscale()
  {
    return (String)getAttributeInternal(CODICEFISCALE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CodiceFiscale
   */
  public void setCodiceFiscale(String value)
  {
    setAttributeInternal(CODICEFISCALE, value);
  }

  /**
   * 
   *  Gets the attribute value for DataNascita, using the alias name DataNascita
   */
  public String getDataNascita()
  {
    return (String)getAttributeInternal(DATANASCITA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DataNascita
   */
  public void setDataNascita(String value)
  {
    setAttributeInternal(DATANASCITA, value);
  }

  /**
   * 
   *  Gets the attribute value for CognomeMarito, using the alias name CognomeMarito
   */
  public String getCognomeMarito()
  {
    return (String)getAttributeInternal(COGNOMEMARITO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CognomeMarito
   */
  public void setCognomeMarito(String value)
  {
    setAttributeInternal(COGNOMEMARITO, value);
  }

  /**
   * 
   *  Gets the attribute value for Telefono1, using the alias name Telefono1
   */
  public String getTelefono1()
  {
    return (String)getAttributeInternal(TELEFONO1);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Telefono1
   */
  public void setTelefono1(String value)
  {
    setAttributeInternal(TELEFONO1, value);
  }

  /**
   * 
   *  Gets the attribute value for Telefono2, using the alias name Telefono2
   */
  public String getTelefono2()
  {
    return (String)getAttributeInternal(TELEFONO2);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Telefono2
   */
  public void setTelefono2(String value)
  {
    setAttributeInternal(TELEFONO2, value);
  }

  /**
   * 
   *  Gets the attribute value for CentroReferto, using the alias name CentroReferto
   */
  public String getCentroReferto()
  {
    return (String)getAttributeInternal(CENTROREFERTO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CentroReferto
   */
  public void setCentroReferto(String value)
  {
    setAttributeInternal(CENTROREFERTO, value);
  }

  /**
   * 
   *  Gets the attribute value for DataCreazione, using the alias name DataCreazione
   */
  public Date getDataCreazione()
  {
    return (Date)getAttributeInternal(DATACREAZIONE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DataCreazione
   */
  public void setDataCreazione(Date value)
  {
    setAttributeInternal(DATACREAZIONE, value);
  }

  /**
   * 
   *  Gets the attribute value for DataStampa, using the alias name DataStampa
   */
  public Date getDataStampa()
  {
    return (Date)getAttributeInternal(DATASTAMPA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DataStampa
   */
  public void setDataStampa(Date value)
  {
    setAttributeInternal(DATASTAMPA, value);
  }

  /**
     *
     *  Gets the attribute value for Postel, using the alias name Postel
     */
    public Integer getPostel()
  {
        return (Integer) getAttributeInternal(POSTEL);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Postel
   */
  public void setPostel(Integer value)
  {
    setAttributeInternal(POSTEL, value);
  }

  /**
   * 
   *  Gets the attribute value for Ulss, using the alias name Ulss
   */
  public String getUlss()
  {
    return (String)getAttributeInternal(ULSS);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Ulss
   */
  public void setUlss(String value)
  {
    setAttributeInternal(ULSS, value);
  }

  /**
   * 
   *  Gets the attribute value for Tpscr, using the alias name Tpscr
   */
  public String getTpscr()
  {
    return (String)getAttributeInternal(TPSCR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Tpscr
   */
  public void setTpscr(String value)
  {
    setAttributeInternal(TPSCR, value);
  }

  /**
     *
     *  Gets the attribute value for Importato, using the alias name Importato
     */
    public Integer getImportato()
  {
        return (Integer) getAttributeInternal(IMPORTATO);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Importato
   */
  public void setImportato(Integer value)
  {
    setAttributeInternal(IMPORTATO, value);
  }

  /**
   * 
   *  getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

  /**
   * 
   *  setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param iddocumento key constituent
     * @param ulss key constituent
     * @param tpscr key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer iddocumento, String ulss, String tpscr) {
        return new Key(new Object[] { iddocumento, ulss, tpscr });
    }

    /**
     *
     *  Gets the attribute value for GiorniOrari, using the alias name GiorniOrari
     */
  public String getGiorniOrari()
  {
    return (String)getAttributeInternal(GIORNIORARI);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for GiorniOrari
   */
  public void setGiorniOrari(String value)
  {
    setAttributeInternal(GIORNIORARI, value);
  }

  /**
   * 
   *  Gets the attribute value for Telefono, using the alias name Telefono
   */
  public String getTelefono()
  {
    return (String)getAttributeInternal(TELEFONO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Telefono
   */
  public void setTelefono(String value)
  {
    setAttributeInternal(TELEFONO, value);
  }

  /**
   * 
   *  Gets the attribute value for IntFirmaInviti, using the alias name IntFirmaInviti
   */
  public String getIntFirmaInviti()
  {
    return (String)getAttributeInternal(INTFIRMAINVITI);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for IntFirmaInviti
   */
  public void setIntFirmaInviti(String value)
  {
    setAttributeInternal(INTFIRMAINVITI, value);
  }

  /**
   * 
   *  Gets the attribute value for FirmaInviti, using the alias name FirmaInviti
   */
  public String getFirmaInviti()
  {
    return (String)getAttributeInternal(FIRMAINVITI);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for FirmaInviti
   */
  public void setFirmaInviti(String value)
  {
    setAttributeInternal(FIRMAINVITI, value);
  }

  /**
   * 
   *  Gets the attribute value for FirmaRef1, using the alias name FirmaRef1
   */
  public String getFirmaRef1()
  {
    return (String)getAttributeInternal(FIRMAREF1);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for FirmaRef1
   */
  public void setFirmaRef1(String value)
  {
    setAttributeInternal(FIRMAREF1, value);
  }

  /**
   * 
   *  Gets the attribute value for FirmaRef2, using the alias name FirmaRef2
   */
  public String getFirmaRef2()
  {
    return (String)getAttributeInternal(FIRMAREF2);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for FirmaRef2
   */
  public void setFirmaRef2(String value)
  {
    setAttributeInternal(FIRMAREF2, value);
  }

  /**
   * 
   *  Gets the attribute value for Luogo, using the alias name Luogo
   */
  public String getLuogo()
  {
    return (String)getAttributeInternal(LUOGO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Luogo
   */
  public void setLuogo(String value)
  {
    setAttributeInternal(LUOGO, value);
  }

  /**
   * 
   *  Gets the attribute value for Altro, using the alias name Altro
   */
  public String getAltro()
  {
    return (String)getAttributeInternal(ALTRO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Altro
   */
  public void setAltro(String value)
  {
    setAttributeInternal(ALTRO, value);
  }

}