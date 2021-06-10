package model.conf;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.Key;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Cnf_SoCnfPartemplateImpl extends EntityImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Nomepar {
            public Object get(Cnf_SoCnfPartemplateImpl obj) {
                return obj.getNomepar();
            }

            public void put(Cnf_SoCnfPartemplateImpl obj, Object value) {
                obj.setNomepar((String)value);
            }
        }
        ,
        Codaz {
            public Object get(Cnf_SoCnfPartemplateImpl obj) {
                return obj.getCodaz();
            }

            public void put(Cnf_SoCnfPartemplateImpl obj, Object value) {
                obj.setCodaz((String)value);
            }
        }
        ,
        Descrpar {
            public Object get(Cnf_SoCnfPartemplateImpl obj) {
                return obj.getDescrpar();
            }

            public void put(Cnf_SoCnfPartemplateImpl obj, Object value) {
                obj.setDescrpar((String)value);
            }
        }
        ,
        Tpscr {
            public Object get(Cnf_SoCnfPartemplateImpl obj) {
                return obj.getTpscr();
            }

            public void put(Cnf_SoCnfPartemplateImpl obj, Object value) {
                obj.setTpscr((String)value);
            }
        }
        ,
        Cnf_SoAzienda {
            public Object get(Cnf_SoCnfPartemplateImpl obj) {
                return obj.getCnf_SoAzienda();
            }

            public void put(Cnf_SoCnfPartemplateImpl obj, Object value) {
                obj.setCnf_SoAzienda((Cnf_SoAziendaImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Cnf_SoCnfPartemplateImpl object);

        public abstract void put(Cnf_SoCnfPartemplateImpl object, Object value);

        public int index() {
            return Cnf_SoCnfPartemplateImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return Cnf_SoCnfPartemplateImpl.AttributesEnum.firstIndex() + Cnf_SoCnfPartemplateImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = Cnf_SoCnfPartemplateImpl.AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int NOMEPAR = AttributesEnum.Nomepar.index();
    public static final int CODAZ = AttributesEnum.Codaz.index();
    public static final int DESCRPAR = AttributesEnum.Descrpar.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int CNF_SOAZIENDA = AttributesEnum.Cnf_SoAzienda.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public Cnf_SoCnfPartemplateImpl()
  {
  }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.Cnf_SoCnfPartemplate");
    }

    /**
     *
     *  Gets the attribute value for Nomepar, using the alias name Nomepar
     */
    public String getNomepar()
  {
    return (String)getAttributeInternal(NOMEPAR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Nomepar
   */
  public void setNomepar(String value)
  {
    setAttributeInternal(NOMEPAR, value);
  }

  /**
   * 
   *  Gets the attribute value for Codaz, using the alias name Codaz
   */
  public String getCodaz()
  {
    return (String)getAttributeInternal(CODAZ);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Codaz
   */
  public void setCodaz(String value)
  {
    setAttributeInternal(CODAZ, value);
  }

  /**
   * 
   *  Gets the attribute value for Descrpar, using the alias name Descrpar
   */
  public String getDescrpar()
  {
    return (String)getAttributeInternal(DESCRPAR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Descrpar
   */
  public void setDescrpar(String value)
  {
    setAttributeInternal(DESCRPAR, value);
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
   *  Gets the associated entity Cnf_SoAziendaImpl
   */
  public Cnf_SoAziendaImpl getCnf_SoAzienda()
  {
    return (Cnf_SoAziendaImpl)getAttributeInternal(CNF_SOAZIENDA);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity Cnf_SoAziendaImpl
   */
  public void setCnf_SoAzienda(Cnf_SoAziendaImpl value)
  {
    setAttributeInternal(CNF_SOAZIENDA, value);
  }

    /**
     * @param nomepar key constituent
     * @param codaz key constituent
     * @param tpscr key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String nomepar, String codaz, String tpscr) {
        return new Key(new Object[]{nomepar, codaz, tpscr});
    }


}