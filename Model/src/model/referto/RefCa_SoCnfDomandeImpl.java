package model.referto;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Date;
import oracle.jbo.RowIterator;
import oracle.jbo.Key;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class RefCa_SoCnfDomandeImpl extends EntityImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcnfdom,
        Domanda,
        Tipo,
        Lunghezza,
        Modificabile,
        Gruppo,
        DtFineVal,
        Note,
        Tpscr,
        Dtinserimento,
        Opinserimento,
        Dtultimamodifica,
        Opultmodifica,
        Minval,
        Maxval,
        RefCa_SoCnfQuestDomande;
        private static AttributesEnum[] vals = null;
        private static final int        firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int IDCNFDOM = AttributesEnum.Idcnfdom.index();
    public static final int DOMANDA = AttributesEnum.Domanda.index();
    public static final int TIPO = AttributesEnum.Tipo.index();
    public static final int LUNGHEZZA = AttributesEnum.Lunghezza.index();
    public static final int MODIFICABILE = AttributesEnum.Modificabile.index();
    public static final int GRUPPO = AttributesEnum.Gruppo.index();
    public static final int DTFINEVAL = AttributesEnum.DtFineVal.index();
    public static final int NOTE = AttributesEnum.Note.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int DTINSERIMENTO = AttributesEnum.Dtinserimento.index();
    public static final int OPINSERIMENTO = AttributesEnum.Opinserimento.index();
    public static final int DTULTIMAMODIFICA = AttributesEnum.Dtultimamodifica.index();
    public static final int OPULTMODIFICA = AttributesEnum.Opultmodifica.index();
    public static final int MINVAL = AttributesEnum.Minval.index();
    public static final int MAXVAL = AttributesEnum.Maxval.index();
    public static final int REFCA_SOCNFQUESTDOMANDE = AttributesEnum.RefCa_SoCnfQuestDomande.index();

    /**
     *
     *  This is the default constructor (do not remove)
     */
	public RefCa_SoCnfDomandeImpl() {
	}

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.RefCa_SoCnfDomande");
    }


    /**
     *
     *  Gets the attribute value for Idcnfdom, using the alias name Idcnfdom
     */
	public Integer getIdcnfdom() {
		return (Integer)getAttributeInternal(IDCNFDOM);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Idcnfdom
	 */
	public void setIdcnfdom(Integer value) {
		setAttributeInternal(IDCNFDOM, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Domanda, using the alias name Domanda
	 */
	public String getDomanda() {
		return (String)getAttributeInternal(DOMANDA);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Domanda
	 */
	public void setDomanda(String value) {
		setAttributeInternal(DOMANDA, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Tipo, using the alias name Tipo
	 */
	public String getTipo() {
		return (String)getAttributeInternal(TIPO);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Tipo
	 */
	public void setTipo(String value) {
		setAttributeInternal(TIPO, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Lunghezza, using the alias name Lunghezza
	 */
	public Integer getLunghezza() {
		return (Integer)getAttributeInternal(LUNGHEZZA);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Lunghezza
	 */
	public void setLunghezza(Integer value) {
		setAttributeInternal(LUNGHEZZA, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Modificabile, using the alias name Modificabile
	 */
	public Integer getModificabile() {
		return (Integer)getAttributeInternal(MODIFICABILE);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Modificabile
	 */
	public void setModificabile(Integer value) {
		setAttributeInternal(MODIFICABILE, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Gruppo, using the alias name Gruppo
	 */
	public String getGruppo() {
		return (String)getAttributeInternal(GRUPPO);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Gruppo
	 */
	public void setGruppo(String value) {
		setAttributeInternal(GRUPPO, value);
	}

	/**
	 * 
	 *  Gets the attribute value for DtFineVal, using the alias name DtFineVal
	 */
	public Date getDtFineVal() {
		return (Date)getAttributeInternal(DTFINEVAL);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for DtFineVal
	 */
	public void setDtFineVal(Date value) {
		setAttributeInternal(DTFINEVAL, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Note, using the alias name Note
	 */
	public String getNote() {
		return (String)getAttributeInternal(NOTE);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Note
	 */
	public void setNote(String value) {
		setAttributeInternal(NOTE, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Tpscr, using the alias name Tpscr
	 */
	public String getTpscr() {
		return (String)getAttributeInternal(TPSCR);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Tpscr
	 */
	public void setTpscr(String value) {
		setAttributeInternal(TPSCR, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Dtinserimento, using the alias name Dtinserimento
	 */
	public Date getDtinserimento() {
		return (Date)getAttributeInternal(DTINSERIMENTO);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Dtinserimento
	 */
	public void setDtinserimento(Date value) {
		setAttributeInternal(DTINSERIMENTO, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Opinserimento, using the alias name Opinserimento
	 */
	public String getOpinserimento() {
		return (String)getAttributeInternal(OPINSERIMENTO);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Opinserimento
	 */
	public void setOpinserimento(String value) {
		setAttributeInternal(OPINSERIMENTO, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Dtultimamodifica, using the alias name Dtultimamodifica
	 */
	public Date getDtultimamodifica() {
		return (Date)getAttributeInternal(DTULTIMAMODIFICA);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Dtultimamodifica
	 */
	public void setDtultimamodifica(Date value) {
		setAttributeInternal(DTULTIMAMODIFICA, value);
	}

	/**
	 * 
	 *  Gets the attribute value for Opultmodifica, using the alias name Opultmodifica
	 */
	public String getOpultmodifica() {
		return (String)getAttributeInternal(OPULTMODIFICA);
	}

	/**
	 * 
	 *  Sets <code>value</code> as the attribute value for Opultmodifica
	 */
	public void setOpultmodifica(String value) {
		setAttributeInternal(OPULTMODIFICA, value);
	}


    /**
     *
     *  Gets the associated entity oracle.jbo.RowIterator
     */
	public RowIterator getRefCa_SoCnfQuestDomande() {
    return (RowIterator)getAttributeInternal(REFCA_SOCNFQUESTDOMANDE);
	}


    /**
     * @param idcnfdom key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer idcnfdom) {
        return new Key(new Object[] { idcnfdom });
    }

    /**
     *
     *  Gets the attribute value for Minval, using the alias name Minval
     */
  public String getMinval()
  {
    return (String)getAttributeInternal(MINVAL);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Minval
   */
  public void setMinval(String value)
  {
    setAttributeInternal(MINVAL, value);
  }

  /**
   * 
   *  Gets the attribute value for Maxval, using the alias name Maxval
   */
  public String getMaxval()
  {
    return (String)getAttributeInternal(MAXVAL);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Maxval
   */
  public void setMaxval(String value)
  {
    setAttributeInternal(MAXVAL, value);
  }


}