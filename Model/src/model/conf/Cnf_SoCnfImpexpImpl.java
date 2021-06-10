package model.conf;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Timestamp;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Cnf_SoCnfImpexpImpl extends EntityImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Progrulss {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getProgrulss();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setProgrulss((Integer) value);
            }
        }
        ,
        Idcentroref {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getIdcentroref();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setIdcentroref((Integer) value);
            }
        }
        ,
        Nomefilepart {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getNomefilepart();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setNomefilepart((String) value);
            }
        }
        ,
        Nomefilearr {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getNomefilearr();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setNomefilearr((String) value);
            }
        }
        ,
        Posizfilepart {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getPosizfilepart();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setPosizfilepart((String) value);
            }
        }
        ,
        Posizfilearr {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getPosizfilearr();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setPosizfilearr((String) value);
            }
        }
        ,
        Ippart {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getIppart();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setIppart((String) value);
            }
        }
        ,
        Usrftp {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getUsrftp();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setUsrftp((String) value);
            }
        }
        ,
        Pwdftp {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getPwdftp();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setPwdftp((String) value);
            }
        }
        ,
        Orasched {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getOrasched();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setOrasched((Integer) value);
            }
        }
        ,
        Intervallo {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getIntervallo();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setIntervallo((Integer) value);
            }
        }
        ,
        Impexp {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getImpexp();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setImpexp((String) value);
            }
        }
        ,
        Tpdip {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTpdip();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTpdip((String) value);
            }
        }
        ,
        Cancellazione {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getCancellazione();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setCancellazione((Boolean) value);
            }
        }
        ,
        Ipdirvirtuale {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getIpdirvirtuale();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setIpdirvirtuale((String) value);
            }
        }
        ,
        Posizdirvirtuale {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getPosizdirvirtuale();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setPosizdirvirtuale((String) value);
            }
        }
        ,
        Dirvirtuale {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getDirvirtuale();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setDirvirtuale((String) value);
            }
        }
        ,
        Email {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getEmail();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setEmail((String) value);
            }
        }
        ,
        Template {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTemplate();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTemplate((BlobDomain) value);
            }
        }
        ,
        Ulss {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getUlss();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setUlss((String) value);
            }
        }
        ,
        Tpscr {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTpscr();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTpscr((String) value);
            }
        }
        ,
        TemplateCompilato {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTemplateCompilato();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTemplateCompilato((BlobDomain) value);
            }
        }
        ,
        Dttransfer {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getDttransfer();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setDttransfer((Timestamp) value);
            }
        }
        ,
        Dtimport {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getDtimport();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setDtimport((Timestamp) value);
            }
        }
        ,
        LogFile {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getLogFile();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setLogFile((BlobDomain) value);
            }
        }
        ,
        Fileparziale {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getFileparziale();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setFileparziale((Boolean) value);
            }
        }
        ,
        Suffisso {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getSuffisso();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setSuffisso((String) value);
            }
        }
        ,
        Filevirtuale {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getFilevirtuale();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setFilevirtuale((String) value);
            }
        }
        ,
        CancellazioneDip {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getCancellazioneDip();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setCancellazioneDip((Boolean) value);
            }
        }
        ,
        Ftpport {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getFtpport();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setFtpport((Integer) value);
            }
        }
        ,
        Attivo {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getAttivo();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setAttivo((Integer) value);
            }
        }
        ,
        LunghRecord {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getLunghRecord();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setLunghRecord((Integer) value);
            }
        }
        ,
        Modalita {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getModalita();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setModalita((Integer) value);
            }
        }
        ,
        Dblink {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getDblink();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setDblink((String) value);
            }
        }
        ,
        Ordine {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getOrdine();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setOrdine((Integer) value);
            }
        }
        ,
        Consenso {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getConsenso();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setConsenso((Boolean) value);
            }
        }
        ,
        Test {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTest();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTest((String) value);
            }
        }
        ,
        Tipo {
            public Object get(Cnf_SoCnfImpexpImpl obj) {
                return obj.getTipo();
            }

            public void put(Cnf_SoCnfImpexpImpl obj, Object value) {
                obj.setTipo((String) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Cnf_SoCnfImpexpImpl object);

        public abstract void put(Cnf_SoCnfImpexpImpl object, Object value);

        public int index() {
            return Cnf_SoCnfImpexpImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return Cnf_SoCnfImpexpImpl.AttributesEnum.firstIndex() + Cnf_SoCnfImpexpImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = Cnf_SoCnfImpexpImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int PROGRULSS = AttributesEnum.Progrulss.index();
    public static final int IDCENTROREF = AttributesEnum.Idcentroref.index();
    public static final int NOMEFILEPART = AttributesEnum.Nomefilepart.index();
    public static final int NOMEFILEARR = AttributesEnum.Nomefilearr.index();
    public static final int POSIZFILEPART = AttributesEnum.Posizfilepart.index();
    public static final int POSIZFILEARR = AttributesEnum.Posizfilearr.index();
    public static final int IPPART = AttributesEnum.Ippart.index();
    public static final int USRFTP = AttributesEnum.Usrftp.index();
    public static final int PWDFTP = AttributesEnum.Pwdftp.index();
    public static final int ORASCHED = AttributesEnum.Orasched.index();
    public static final int INTERVALLO = AttributesEnum.Intervallo.index();
    public static final int IMPEXP = AttributesEnum.Impexp.index();
    public static final int TPDIP = AttributesEnum.Tpdip.index();
    public static final int CANCELLAZIONE = AttributesEnum.Cancellazione.index();
    public static final int IPDIRVIRTUALE = AttributesEnum.Ipdirvirtuale.index();
    public static final int POSIZDIRVIRTUALE = AttributesEnum.Posizdirvirtuale.index();
    public static final int DIRVIRTUALE = AttributesEnum.Dirvirtuale.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int TEMPLATE = AttributesEnum.Template.index();
    public static final int ULSS = AttributesEnum.Ulss.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int TEMPLATECOMPILATO = AttributesEnum.TemplateCompilato.index();
    public static final int DTTRANSFER = AttributesEnum.Dttransfer.index();
    public static final int DTIMPORT = AttributesEnum.Dtimport.index();
    public static final int LOGFILE = AttributesEnum.LogFile.index();
    public static final int FILEPARZIALE = AttributesEnum.Fileparziale.index();
    public static final int SUFFISSO = AttributesEnum.Suffisso.index();
    public static final int FILEVIRTUALE = AttributesEnum.Filevirtuale.index();
    public static final int CANCELLAZIONEDIP = AttributesEnum.CancellazioneDip.index();
    public static final int FTPPORT = AttributesEnum.Ftpport.index();
    public static final int ATTIVO = AttributesEnum.Attivo.index();
    public static final int LUNGHRECORD = AttributesEnum.LunghRecord.index();
    public static final int MODALITA = AttributesEnum.Modalita.index();
    public static final int DBLINK = AttributesEnum.Dblink.index();
    public static final int ORDINE = AttributesEnum.Ordine.index();
    public static final int CONSENSO = AttributesEnum.Consenso.index();
    public static final int TEST = AttributesEnum.Test.index();
    public static final int TIPO = AttributesEnum.Tipo.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public Cnf_SoCnfImpexpImpl()
  {
  }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.conf.Cnf_SoCnfImpexp");
    }


    /**
     *
     *  Gets the attribute value for Progrulss, using the alias name Progrulss
     */
    public Integer getProgrulss()
  {
    return (Integer)getAttributeInternal(PROGRULSS);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Progrulss
   */
  public void setProgrulss(Integer value)
  {
    setAttributeInternal(PROGRULSS, value);
  }

  /**
   * 
   *  Gets the attribute value for Idcentroref, using the alias name Idcentroref
   */
  public Integer getIdcentroref()
  {
    return (Integer)getAttributeInternal(IDCENTROREF);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idcentroref
   */
  public void setIdcentroref(Integer value)
  {
    setAttributeInternal(IDCENTROREF, value);
  }

  /**
   * 
   *  Gets the attribute value for Nomefilepart, using the alias name Nomefilepart
   */
  public String getNomefilepart()
  {
    return (String)getAttributeInternal(NOMEFILEPART);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Nomefilepart
   */
  public void setNomefilepart(String value)
  {
    setAttributeInternal(NOMEFILEPART, value);
  }

  /**
   * 
   *  Gets the attribute value for Nomefilearr, using the alias name Nomefilearr
   */
  public String getNomefilearr()
  {
    return (String)getAttributeInternal(NOMEFILEARR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Nomefilearr
   */
  public void setNomefilearr(String value)
  {
    setAttributeInternal(NOMEFILEARR, value);
  }

  /**
   * 
   *  Gets the attribute value for Posizfilepart, using the alias name Posizfilepart
   */
  public String getPosizfilepart()
  {
    return (String)getAttributeInternal(POSIZFILEPART);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Posizfilepart
   */
  public void setPosizfilepart(String value)
  {
    setAttributeInternal(POSIZFILEPART, value);
  }

  /**
   * 
   *  Gets the attribute value for Posizfilearr, using the alias name Posizfilearr
   */
  public String getPosizfilearr()
  {
    return (String)getAttributeInternal(POSIZFILEARR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Posizfilearr
   */
  public void setPosizfilearr(String value)
  {
    setAttributeInternal(POSIZFILEARR, value);
  }

  /**
   * 
   *  Gets the attribute value for Ippart, using the alias name Ippart
   */
  public String getIppart()
  {
    return (String)getAttributeInternal(IPPART);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Ippart
   */
  public void setIppart(String value)
  {
    setAttributeInternal(IPPART, value);
  }





  /**
   * 
   *  Gets the attribute value for Usrftp, using the alias name Usrftp
   */
  public String getUsrftp()
  {
    return (String)getAttributeInternal(USRFTP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Usrftp
   */
  public void setUsrftp(String value)
  {
    setAttributeInternal(USRFTP, value);
  }

  /**
   * 
   *  Gets the attribute value for Pwdftp, using the alias name Pwdftp
   */
  public String getPwdftp()
  {
    return (String)getAttributeInternal(PWDFTP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Pwdftp
   */
  public void setPwdftp(String value)
  {
    setAttributeInternal(PWDFTP, value);
  }

  /**
   * 
   *  Gets the attribute value for Orasched, using the alias name Orasched
   */
  public Integer getOrasched()
  {
    return (Integer)getAttributeInternal(ORASCHED);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Orasched
   */
  public void setOrasched(Integer value)
  {
    setAttributeInternal(ORASCHED, value);
  }

  /**
   * 
   *  Gets the attribute value for Intervallo, using the alias name Intervallo
   */
  public Integer getIntervallo()
  {
    return (Integer)getAttributeInternal(INTERVALLO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Intervallo
   */
  public void setIntervallo(Integer value)
  {
    setAttributeInternal(INTERVALLO, value);
  }

  /**
   * 
   *  Gets the attribute value for Impexp, using the alias name Impexp
   */
  public String getImpexp()
  {
    return (String)getAttributeInternal(IMPEXP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Impexp
   */
  public void setImpexp(String value)
  {
    setAttributeInternal(IMPEXP, value);
  }

  /**
   * 
   *  Gets the attribute value for Tpdip, using the alias name Tpdip
   */
  public String getTpdip()
  {
    return (String)getAttributeInternal(TPDIP);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Tpdip
   */
  public void setTpdip(String value)
  {
    setAttributeInternal(TPDIP, value);
  }

  /**
     *
     *  Gets the attribute value for Cancellazione, using the alias name Cancellazione
     */
    public Boolean getCancellazione()
  {
        return (Boolean) getAttributeInternal(CANCELLAZIONE);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Cancellazione
   */
  public void setCancellazione(Boolean value)
  {
    setAttributeInternal(CANCELLAZIONE, value);
  }

  /**
   * 
   *  Gets the attribute value for Ipdirvirtuale, using the alias name Ipdirvirtuale
   */
  public String getIpdirvirtuale()
  {
    return (String)getAttributeInternal(IPDIRVIRTUALE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Ipdirvirtuale
   */
  public void setIpdirvirtuale(String value)
  {
    setAttributeInternal(IPDIRVIRTUALE, value);
  }

  /**
   * 
   *  Gets the attribute value for Posizdirvirtuale, using the alias name Posizdirvirtuale
   */
  public String getPosizdirvirtuale()
  {
    return (String)getAttributeInternal(POSIZDIRVIRTUALE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Posizdirvirtuale
   */
  public void setPosizdirvirtuale(String value)
  {
    setAttributeInternal(POSIZDIRVIRTUALE, value);
  }

  /**
   * 
   *  Gets the attribute value for Dirvirtuale, using the alias name Dirvirtuale
   */
  public String getDirvirtuale()
  {
    return (String)getAttributeInternal(DIRVIRTUALE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Dirvirtuale
   */
  public void setDirvirtuale(String value)
  {
    setAttributeInternal(DIRVIRTUALE, value);
  }

  /**
   * 
   *  Gets the attribute value for Email, using the alias name Email
   */
  public String getEmail()
  {
    return (String)getAttributeInternal(EMAIL);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Email
   */
  public void setEmail(String value)
  {
    setAttributeInternal(EMAIL, value);
  }

  /**
   * 
   *  Gets the attribute value for Template, using the alias name Template
   */
  public BlobDomain getTemplate()
  {
    return (BlobDomain)getAttributeInternal(TEMPLATE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Template
   */
  public void setTemplate(BlobDomain value)
  {
    setAttributeInternal(TEMPLATE, value);
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
     * @param progrulss key constituent
     * @param impexp key constituent
     * @param tpdip key constituent
     * @param ulss key constituent
     * @param tpscr key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer progrulss, String impexp, String tpdip, String ulss, String tpscr) {
        return new Key(new Object[] { progrulss, impexp, tpdip, ulss, tpscr });
    }

    /**
     *
     *  Gets the attribute value for TemplateCompilato, using the alias name TemplateCompilato
     */
  public BlobDomain getTemplateCompilato()
  {
    return (BlobDomain)getAttributeInternal(TEMPLATECOMPILATO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for TemplateCompilato
   */
  public void setTemplateCompilato(BlobDomain value)
  {
    setAttributeInternal(TEMPLATECOMPILATO, value);
  }

  /**
   * 
   *  Gets the attribute value for Dttransfer, using the alias name Dttransfer
   */
  public Timestamp getDttransfer()
  {
    return (Timestamp)getAttributeInternal(DTTRANSFER);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Dttransfer
   */
  public void setDttransfer(Timestamp value)
  {
    setAttributeInternal(DTTRANSFER, value);
  }

  /**
   * 
   *  Gets the attribute value for Dtimport, using the alias name Dtimport
   */
  public Timestamp getDtimport()
  {
    return (Timestamp)getAttributeInternal(DTIMPORT);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Dtimport
   */
  public void setDtimport(Timestamp value)
  {
    setAttributeInternal(DTIMPORT, value);
  }

  /**
   * 
   *  Gets the attribute value for LogFile, using the alias name LogFile
   */
  public BlobDomain getLogFile()
  {
    return (BlobDomain)getAttributeInternal(LOGFILE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for LogFile
   */
  public void setLogFile(BlobDomain value)
  {
    setAttributeInternal(LOGFILE, value);
  }

  /**
     *
     *  Gets the attribute value for Fileparziale, using the alias name Fileparziale
     */
    public Boolean getFileparziale()
  {
        return (Boolean) getAttributeInternal(FILEPARZIALE);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Fileparziale
   */
  public void setFileparziale(Boolean value)
  {
    setAttributeInternal(FILEPARZIALE, value);
  }

  /**
   * 
   *  Gets the attribute value for Suffisso, using the alias name Suffisso
   */
  public String getSuffisso()
  {
    return (String)getAttributeInternal(SUFFISSO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Suffisso
   */
  public void setSuffisso(String value)
  {
    setAttributeInternal(SUFFISSO, value);
  }

  /**
   * 
   *  Gets the attribute value for Filevirtuale, using the alias name Filevirtuale
   */
  public String getFilevirtuale()
  {
    return (String)getAttributeInternal(FILEVIRTUALE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Filevirtuale
   */
  public void setFilevirtuale(String value)
  {
    setAttributeInternal(FILEVIRTUALE, value);
  }


  /**
     *
     *  Gets the attribute value for CancellazioneDip, using the alias name CancellazioneDip
     */
    public Boolean getCancellazioneDip()
  {
        return (Boolean) getAttributeInternal(CANCELLAZIONEDIP);
    }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CancellazioneDip
   */
  public void setCancellazioneDip(Boolean value)
  {
    setAttributeInternal(CANCELLAZIONEDIP, value);
  }

  /**
   * 
   *  Gets the attribute value for Ftpport, using the alias name Ftpport
   */
  public Integer getFtpport()
  {
    return (Integer)getAttributeInternal(FTPPORT);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Ftpport
   */
  public void setFtpport(Integer value)
  {
    setAttributeInternal(FTPPORT, value);
  }


  /**
   * 
   *  Gets the attribute value for Attivo, using the alias name Attivo
   */
  public Integer getAttivo()
  {
    return (Integer)getAttributeInternal(ATTIVO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Attivo
   */
  public void setAttivo(Integer value)
  {
    setAttributeInternal(ATTIVO, value);
  }

  /**
   * 
   *  Gets the attribute value for LunghRecord, using the alias name LunghRecord
   */
  public Integer getLunghRecord()
  {
    return (Integer)getAttributeInternal(LUNGHRECORD);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for LunghRecord
   */
  public void setLunghRecord(Integer value)
  {
    setAttributeInternal(LUNGHRECORD, value);
  }


  /**
   * 
   *  Gets the attribute value for Modalita, using the alias name Modalita
   */
  public Integer getModalita()
  {
    return (Integer)getAttributeInternal(MODALITA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Modalita
   */
  public void setModalita(Integer value)
  {
    setAttributeInternal(MODALITA, value);
  }

  /**
   * 
   *  Gets the attribute value for Dblink, using the alias name Dblink
   */
  public String getDblink()
  {
    return (String)getAttributeInternal(DBLINK);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Dblink
   */
  public void setDblink(String value)
  {
    setAttributeInternal(DBLINK, value);
  }

    /**
     * Gets the attribute value for Ordine, using the alias name Ordine.
     * @return the value of Ordine
     */
    public Integer getOrdine() {
        return (Integer) getAttributeInternal(ORDINE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ordine.
     * @param value value to set the Ordine
     */
    public void setOrdine(Integer value) {
        setAttributeInternal(ORDINE, value);
    }

    /**
     * Gets the attribute value for Consenso, using the alias name Consenso.
     * @return the value of Consenso
     */
    public Boolean getConsenso() {
        return (Boolean) getAttributeInternal(CONSENSO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Consenso.
     * @param value value to set the Consenso
     */
    public void setConsenso(Boolean value) {
        setAttributeInternal(CONSENSO, value);
    }

    /**
     * Gets the attribute value for Test, using the alias name Test.
     * @return the value of Test
     */
    public String getTest() {
        return (String) getAttributeInternal(TEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Test.
     * @param value value to set the Test
     */
    public void setTest(String value) {
        setAttributeInternal(TEST, value);
    }

    /**
     * Gets the attribute value for Tipo, using the alias name Tipo.
     * @return the value of Tipo
     */
    public String getTipo() {
        return (String) getAttributeInternal(TIPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Tipo.
     * @param value value to set the Tipo
     */
    public void setTipo(String value) {
        setAttributeInternal(TIPO, value);
    }


}