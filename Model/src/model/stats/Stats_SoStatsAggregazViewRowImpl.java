package model.stats;


import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Stats_SoStatsAggregazViewRowImpl extends ViewRowImpl implements model.common.Stats_SoStatsAggregazViewRow 
{


    public static final int ENTITY_STATS_SOSTATSAGGREGAZ = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Tipo {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getTipo();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setTipo((String)value);
            }
        }
        ,
        Aggregaz {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getAggregaz();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setAggregaz((String)value);
            }
        }
        ,
        Tpscr {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getTpscr();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setTpscr((String)value);
            }
        }
        ,
        Descrizione {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getDescrizione();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setDescrizione((String)value);
            }
        }
        ,
        Tabella {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getTabella();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setTabella((String)value);
            }
        }
        ,
        Campo {
            public Object get(Stats_SoStatsAggregazViewRowImpl obj) {
                return obj.getCampo();
            }

            public void put(Stats_SoStatsAggregazViewRowImpl obj, Object value) {
                obj.setCampo((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Stats_SoStatsAggregazViewRowImpl object);

        public abstract void put(Stats_SoStatsAggregazViewRowImpl object, Object value);

        public int index() {
            return Stats_SoStatsAggregazViewRowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return Stats_SoStatsAggregazViewRowImpl.AttributesEnum.firstIndex() + Stats_SoStatsAggregazViewRowImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = Stats_SoStatsAggregazViewRowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int TIPO = AttributesEnum.Tipo.index();
    public static final int AGGREGAZ = AttributesEnum.Aggregaz.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int DESCRIZIONE = AttributesEnum.Descrizione.index();
    public static final int TABELLA = AttributesEnum.Tabella.index();
    public static final int CAMPO = AttributesEnum.Campo.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
  public Stats_SoStatsAggregazViewRowImpl()
  {
  }

  /**
   * 
   *  Gets Stats_SoStatsAggregaz entity object.
   */
  public Stats_SoStatsAggregazImpl getStats_SoStatsAggregaz()
  {
    return (Stats_SoStatsAggregazImpl)getEntity(0);
  }

  /**
   * 
   *  Gets the attribute value for TIPO using the alias name Tipo
   */
  public String getTipo()
  {
    return (String)getAttributeInternal(TIPO);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for TIPO using the alias name Tipo
   */
  public void setTipo(String value)
  {
    setAttributeInternal(TIPO, value);
  }

  /**
   * 
   *  Gets the attribute value for AGGREGAZ using the alias name Aggregaz
   */
  public String getAggregaz()
  {
    return (String)getAttributeInternal(AGGREGAZ);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for AGGREGAZ using the alias name Aggregaz
   */
  public void setAggregaz(String value)
  {
    setAttributeInternal(AGGREGAZ, value);
  }

  /**
   * 
   *  Gets the attribute value for TPSCR using the alias name Tpscr
   */
  public String getTpscr()
  {
    return (String)getAttributeInternal(TPSCR);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for TPSCR using the alias name Tpscr
   */
  public void setTpscr(String value)
  {
    setAttributeInternal(TPSCR, value);
  }

  /**
   * 
   *  Gets the attribute value for DESCRIZIONE using the alias name Descrizione
   */
  public String getDescrizione()
  {
    return (String)getAttributeInternal(DESCRIZIONE);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for DESCRIZIONE using the alias name Descrizione
   */
  public void setDescrizione(String value)
  {
    setAttributeInternal(DESCRIZIONE, value);
  }

  /**
   * 
   *  Gets the attribute value for TABELLA using the alias name Tabella
   */
  public String getTabella()
  {
    return (String)getAttributeInternal(TABELLA);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for TABELLA using the alias name Tabella
   */
  public void setTabella(String value)
  {
    setAttributeInternal(TABELLA, value);
  }

  /**
   * 
   *  Gets the attribute value for CAMPO using the alias name Campo
   */
  public String getCampo()
  {
    return (String)getAttributeInternal(CAMPO);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for CAMPO using the alias name Campo
   */
  public void setCampo(String value)
  {
    setAttributeInternal(CAMPO, value);
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
}