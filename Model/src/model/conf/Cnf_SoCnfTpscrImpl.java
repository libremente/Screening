package model.conf;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.Key;
import oracle.jbo.server.TransactionEvent;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Cnf_SoCnfTpscrImpl extends EntityImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Codscr {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getCodscr();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setCodscr((String)value);
            }
        }
        ,
        Descrizione {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getDescrizione();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setDescrizione((String)value);
            }
        }
        ,
        Etada {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getEtada();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setEtada((Integer)value);
            }
        }
        ,
        Etaa {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getEtaa();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setEtaa((Integer)value);
            }
        }
        ,
        Durata {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getDurata();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setDurata((Integer)value);
            }
        }
        ,
        Sesso {
            public Object get(Cnf_SoCnfTpscrImpl obj) {
                return obj.getSesso();
            }

            public void put(Cnf_SoCnfTpscrImpl obj, Object value) {
                obj.setSesso((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Cnf_SoCnfTpscrImpl object);

        public abstract void put(Cnf_SoCnfTpscrImpl object, Object value);

        public int index() {
            return Cnf_SoCnfTpscrImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return Cnf_SoCnfTpscrImpl.AttributesEnum.firstIndex() + Cnf_SoCnfTpscrImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = Cnf_SoCnfTpscrImpl.AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int CODSCR = AttributesEnum.Codscr.index();
    public static final int DESCRIZIONE = AttributesEnum.Descrizione.index();
    public static final int ETADA = AttributesEnum.Etada.index();
    public static final int ETAA = AttributesEnum.Etaa.index();
    public static final int DURATA = AttributesEnum.Durata.index();
    public static final int SESSO = AttributesEnum.Sesso.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public Cnf_SoCnfTpscrImpl()
  {
  }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.Cnf_SoCnfTpscr");
    }

    /**
     *
     *  Gets the attribute value for Codscr, using the alias name Codscr
     */
    public String getCodscr()
  {
    return (String)getAttributeInternal(CODSCR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Codscr
   */
  public void setCodscr(String value)
  {
    setAttributeInternal(CODSCR, value);
  }

  /**
   * 
   *  Gets the attribute value for Descrizione, using the alias name Descrizione
   */
  public String getDescrizione()
  {
    return (String)getAttributeInternal(DESCRIZIONE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Descrizione
   */
  public void setDescrizione(String value)
  {
    setAttributeInternal(DESCRIZIONE, value);
  }

  /**
   * 
   *  Gets the attribute value for Etada, using the alias name Etada
   */
  public Integer getEtada()
  {
    return (Integer)getAttributeInternal(ETADA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Etada
   */
  public void setEtada(Integer value)
  {
    setAttributeInternal(ETADA, value);
  }

  /**
   * 
   *  Gets the attribute value for Etaa, using the alias name Etaa
   */
  public Integer getEtaa()
  {
    return (Integer)getAttributeInternal(ETAA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Etaa
   */
  public void setEtaa(Integer value)
  {
    setAttributeInternal(ETAA, value);
  }

  /**
   * 
   *  Gets the attribute value for Durata, using the alias name Durata
   */
  public Integer getDurata()
  {
    return (Integer)getAttributeInternal(DURATA);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Durata
   */
  public void setDurata(Integer value)
  {
    setAttributeInternal(DURATA, value);
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
     * @param codscr key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String codscr) {
        return new Key(new Object[]{codscr});
    }

    /**
     *
     *  Add locking logic here.
     */
  public void lock()
  {
    super.lock();
  }

  /**
   * 
   *  Custom DML update/insert/delete logic here.
   */
  protected void doDML(int operation, TransactionEvent e)
  {
    super.doDML(operation, e);
  }


  /**
   * 
   *  Gets the attribute value for Sesso, using the alias name Sesso
   */
  public String getSesso()
  {
    return (String)getAttributeInternal(SESSO);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Sesso
   */
  public void setSesso(String value)
  {
    setAttributeInternal(SESSO, value);
  }


}