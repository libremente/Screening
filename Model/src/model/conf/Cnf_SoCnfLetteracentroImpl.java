package model.conf;


import oracle.jbo.AttributeList;
import oracle.jbo.ValidationException;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.Key;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Cnf_SoCnfLetteracentroImpl extends EntityImpl {


    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Idtpinvito {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getIdtpinvito();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setIdtpinvito((String) value);
            }
        }
        ,
        Codtempl {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCodtempl();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCodtempl((Integer) value);
            }
        }
        ,
        Idsugg {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getIdsugg();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setIdsugg((Integer) value);
            }
        }
        ,
        Idsugg2l {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getIdsugg2l();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setIdsugg2l((Integer) value);
            }
        }
        ,
        Idsugg3l {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getIdsugg3l();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setIdsugg3l((Integer) value);
            }
        }
        ,
        Ulss {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getUlss();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setUlss((String) value);
            }
        }
        ,
        Tpscr {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getTpscr();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setTpscr((String) value);
            }
        }
        ,
        Idrow {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getIdrow();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setIdrow((Integer) value);
            }
        }
        ,
        EtaDa {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getEtaDa();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setEtaDa((Integer) value);
            }
        }
        ,
        EtaA {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getEtaA();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setEtaA((Integer) value);
            }
        }
        ,
        Centro {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCentro();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCentro((Integer) value);
            }
        }
        ,
        TestProposto {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getTestProposto();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setTestProposto((String) value);
            }
        }
        ,
        Cnf_SoCnfSugg1liv {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCnf_SoCnfSugg1liv();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCnf_SoCnfSugg1liv((Cnf_SoCnfSugg1livImpl) value);
            }
        }
        ,
        Cnf_SoCnfSugg2liv {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCnf_SoCnfSugg2liv();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCnf_SoCnfSugg2liv((Cnf_SoCnfSugg2livImpl) value);
            }
        }
        ,
        Cnf_SoCnfSugg3liv {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCnf_SoCnfSugg3liv();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCnf_SoCnfSugg3liv((Cnf_SoCnfSugg3livImpl) value);
            }
        }
        ,
        Cnf_SoTemplate {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCnf_SoTemplate();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCnf_SoTemplate((Cnf_SoTemplateImpl) value);
            }
        }
        ,
        Cnf_SoCnfTpinvito {
            public Object get(Cnf_SoCnfLetteracentroImpl obj) {
                return obj.getCnf_SoCnfTpinvito();
            }

            public void put(Cnf_SoCnfLetteracentroImpl obj, Object value) {
                obj.setCnf_SoCnfTpinvito((Cnf_SoCnfTpinvitoImpl) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Cnf_SoCnfLetteracentroImpl object);

        public abstract void put(Cnf_SoCnfLetteracentroImpl object, Object value);

        public int index() {
            return Cnf_SoCnfLetteracentroImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return Cnf_SoCnfLetteracentroImpl.AttributesEnum.firstIndex() + Cnf_SoCnfLetteracentroImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = Cnf_SoCnfLetteracentroImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IDTPINVITO = AttributesEnum.Idtpinvito.index();
    public static final int CODTEMPL = AttributesEnum.Codtempl.index();
    public static final int IDSUGG = AttributesEnum.Idsugg.index();
    public static final int IDSUGG2L = AttributesEnum.Idsugg2l.index();
    public static final int IDSUGG3L = AttributesEnum.Idsugg3l.index();
    public static final int ULSS = AttributesEnum.Ulss.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int IDROW = AttributesEnum.Idrow.index();
    public static final int ETADA = AttributesEnum.EtaDa.index();
    public static final int ETAA = AttributesEnum.EtaA.index();
    public static final int CENTRO = AttributesEnum.Centro.index();
    public static final int TESTPROPOSTO = AttributesEnum.TestProposto.index();
    public static final int CNF_SOCNFSUGG1LIV = AttributesEnum.Cnf_SoCnfSugg1liv.index();
    public static final int CNF_SOCNFSUGG2LIV = AttributesEnum.Cnf_SoCnfSugg2liv.index();
    public static final int CNF_SOCNFSUGG3LIV = AttributesEnum.Cnf_SoCnfSugg3liv.index();
    public static final int CNF_SOTEMPLATE = AttributesEnum.Cnf_SoTemplate.index();
    public static final int CNF_SOCNFTPINVITO = AttributesEnum.Cnf_SoCnfTpinvito.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public Cnf_SoCnfLetteracentroImpl()
  {
  }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.conf.Cnf_SoCnfLetteracentro");
    }


    /**
     *
     *  Gets the attribute value for Idtpinvito, using the alias name Idtpinvito
     */
    public String getIdtpinvito()
  {
    return (String)getAttributeInternal(IDTPINVITO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idtpinvito
   */
  public void setIdtpinvito(String value)
  {
    setAttributeInternal(IDTPINVITO, value);
  }

  /**
   * 
   *  Gets the attribute value for Codtempl, using the alias name Codtempl
   */
  public Integer getCodtempl()
  {
    return (Integer)getAttributeInternal(CODTEMPL);
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
   *  Gets the attribute value for Idsugg, using the alias name Idsugg
   */
  public Integer getIdsugg()
  {
    return (Integer)getAttributeInternal(IDSUGG);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idsugg
   */
  public void setIdsugg(Integer value)
  {
    setAttributeInternal(IDSUGG, value);
  }

  /**
   * 
   *  Gets the attribute value for Idsugg2l, using the alias name Idsugg2l
   */
  public Integer getIdsugg2l()
  {
    return (Integer)getAttributeInternal(IDSUGG2L);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idsugg2l
   */
  public void setIdsugg2l(Integer value)
  {
    setAttributeInternal(IDSUGG2L, value);
  }

  /**
   * 
   *  Gets the attribute value for Idsugg3l, using the alias name Idsugg3l
   */
  public Integer getIdsugg3l()
  {
    return (Integer)getAttributeInternal(IDSUGG3L);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idsugg3l
   */
  public void setIdsugg3l(Integer value)
  {
    setAttributeInternal(IDSUGG3L, value);
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
     *
     *  Gets the associated entity Cnf_SoTemplateImpl
     */
    public Cnf_SoTemplateImpl getCnf_SoTemplate()
  {
    return (Cnf_SoTemplateImpl)getAttributeInternal(CNF_SOTEMPLATE);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoTemplateImpl
   */
  public void setCnf_SoTemplate(Cnf_SoTemplateImpl value)
  {
    setAttributeInternal(CNF_SOTEMPLATE, value);
  }


  /**
   * 
   *  Gets the associated entity Cnf_SoCnfTpinvitoImpl
   */
  public Cnf_SoCnfTpinvitoImpl getCnf_SoCnfTpinvito()
  {
    return (Cnf_SoCnfTpinvitoImpl)getAttributeInternal(CNF_SOCNFTPINVITO);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoCnfTpinvitoImpl
   */
  public void setCnf_SoCnfTpinvito(Cnf_SoCnfTpinvitoImpl value)
  {
    setAttributeInternal(CNF_SOCNFTPINVITO, value);
  }


    /**
     * @param idrow key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer idrow) {
        return new Key(new Object[] { idrow });
    }

    /**
     *
     *  Gets the associated entity Cnf_SoCnfSugg1livImpl
     */
  public Cnf_SoCnfSugg1livImpl getCnf_SoCnfSugg1liv()
  {
    return (Cnf_SoCnfSugg1livImpl)getAttributeInternal(CNF_SOCNFSUGG1LIV);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoCnfSugg1livImpl
   */
  public void setCnf_SoCnfSugg1liv(Cnf_SoCnfSugg1livImpl value)
  {
    setAttributeInternal(CNF_SOCNFSUGG1LIV, value);
  }


  /**
   * 
   *  Gets the associated entity Cnf_SoCnfSugg2livImpl
   */
  public Cnf_SoCnfSugg2livImpl getCnf_SoCnfSugg2liv()
  {
    return (Cnf_SoCnfSugg2livImpl)getAttributeInternal(CNF_SOCNFSUGG2LIV);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoCnfSugg2livImpl
   */
  public void setCnf_SoCnfSugg2liv(Cnf_SoCnfSugg2livImpl value)
  {
    setAttributeInternal(CNF_SOCNFSUGG2LIV, value);
  }


  /**
   * 
   *  Gets the associated entity Cnf_SoCnfSugg3livImpl
   */
  public Cnf_SoCnfSugg3livImpl getCnf_SoCnfSugg3liv()
  {
    return (Cnf_SoCnfSugg3livImpl)getAttributeInternal(CNF_SOCNFSUGG3LIV);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoCnfSugg3livImpl
   */
  public void setCnf_SoCnfSugg3liv(Cnf_SoCnfSugg3livImpl value)
  {
    setAttributeInternal(CNF_SOCNFSUGG3LIV, value);
  }


  /**
   * 
   *  Gets the attribute value for Idrow, using the alias name Idrow
   */
  public Integer getIdrow()
  {
    return (Integer)getAttributeInternal(IDROW);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Idrow
   */
  public void setIdrow(Integer value)
  {
    setAttributeInternal(IDROW, value);
  }


  protected void doDML(int operation, TransactionEvent e)
  {
     if(operation==this.DML_INSERT)
    {//inserisco il codice da sequenza
      SequenceImpl s = new SequenceImpl("SO_LETTERECENTRI_SEQ", getDBTransaction());     
      this.setIdrow(s.getSequenceNumber().intValue());

      
    }
    super.doDML(operation, e);
  }

 /**
   * Ogni associazione pu� essere fatta con un solo utilizzo (per un tipo di
   * invito nessun suggerimento e cos� via)
   * @return 
   */
  public boolean validateUniqueUse()
  {
     if(this.getIdtpinvito()!=null && this.getIdtpinvito().length()>0)
    {
      if(this.getIdsugg()!=null)
        return false;
      if(this.getIdsugg2l()!=null)
        return false;
      if(this.getIdsugg3l()!=null)
        return false;
      return true;
    }
    else if(this.getIdsugg()!=null)
    {
      if(this.getIdtpinvito()!=null)
        return false;
      if(this.getIdsugg2l()!=null)
        return false;
      if(this.getIdsugg3l()!=null)
        return false;
      return true;
    }
    else if(this.getIdsugg2l()!=null)
    {
      if(this.getIdtpinvito()!=null)
        return false;
      if(this.getIdsugg()!=null)
        return false;
      if(this.getIdsugg3l()!=null)
        return false;
      return true;
    }
    else if(this.getIdsugg3l()!=null)
    {
      if(this.getIdtpinvito()!=null)
        return false;
      if(this.getIdsugg()!=null)
        return false;
      if(this.getIdsugg2l()!=null)
        return false;
      return true;
    }
    else
      //almeno uno tipo di invito o di referto deve essere associato al template
      return false;
  }
  
   /*20080721 MOD: lettere per eta e centro*/
 /**
   *L'associazione di un template ad un centro � valida solo per i template di lettere di invito,
   * non per i referti
   * @return 
   */
   public boolean validateCentroValue()
  {
    if((this.getIdtpinvito()==null 
    || this.getIdtpinvito().length()==0)
    && this.getCentro()!=null)
       return false;
       
    return true;
  }
   /*20080721 FINE MOD*/


  /**
   * 
   *  Gets the attribute value for EtaDa, using the alias name EtaDa
   */
  public Integer getEtaDa()
  {
    return (Integer)getAttributeInternal(ETADA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for EtaDa
   */
  public void setEtaDa(Integer value)
  {
    setAttributeInternal(ETADA, value);
  }

  /**
   * 
   *  Gets the attribute value for EtaA, using the alias name EtaA
   */
  public Integer getEtaA()
  {
    return (Integer)getAttributeInternal(ETAA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for EtaA
   */
  public void setEtaA(Integer value)
  {
    setAttributeInternal(ETAA, value);
  }

  /**
   * 
   *  Gets the attribute value for Centro, using the alias name Centro
   */
  public Integer getCentro()
  {
    return (Integer)getAttributeInternal(CENTRO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Centro
   */
  public void setCentro(Integer value)
  {
    setAttributeInternal(CENTRO, value);
  }

    /**
     * Gets the attribute value for TestProposto, using the alias name TestProposto.
     * @return the value of TestProposto
     */
    public String getTestProposto() {
        return (String) getAttributeInternal(TESTPROPOSTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TestProposto.
     * @param value value to set the TestProposto
     */
    public void setTestProposto(String value) {
        setAttributeInternal(TESTPROPOSTO, value);
    }


}
