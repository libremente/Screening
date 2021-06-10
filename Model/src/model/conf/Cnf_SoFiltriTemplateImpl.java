package model.conf;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 07 13:02:12 CEST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Cnf_SoFiltriTemplateImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Idriga {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getIdriga();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setIdriga((Number) value);
            }
        }
        ,
        Ulss {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getUlss();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setUlss((String) value);
            }
        }
        ,
        Tpscr {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getTpscr();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setTpscr((String) value);
            }
        }
        ,
        Codtempl {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getCodtempl();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setCodtempl((Integer) value);
            }
        }
        ,
        Idcentro {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getIdcentro();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setIdcentro((Integer) value);
            }
        }
        ,
        Idtpinvito {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getIdtpinvito();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setIdtpinvito((String) value);
            }
        }
        ,
        Dtins {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getDtins();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Opins {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getOpins();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Dtmod {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getDtmod();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Opmod {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getOpmod();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Cnf_SoCentroPrelRef {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getCnf_SoCentroPrelRef();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setCnf_SoCentroPrelRef((Cnf_SoCentroPrelRefImpl) value);
            }
        }
        ,
        Cnf_SoTemplate {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getCnf_SoTemplate();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setCnf_SoTemplate((Cnf_SoTemplateImpl) value);
            }
        }
        ,
        Cnf_SoCnfTpinvito {
            public Object get(Cnf_SoFiltriTemplateImpl obj) {
                return obj.getCnf_SoCnfTpinvito();
            }

            public void put(Cnf_SoFiltriTemplateImpl obj, Object value) {
                obj.setCnf_SoCnfTpinvito((Cnf_SoCnfTpinvitoImpl) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Cnf_SoFiltriTemplateImpl object);

        public abstract void put(Cnf_SoFiltriTemplateImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IDRIGA = AttributesEnum.Idriga.index();
    public static final int ULSS = AttributesEnum.Ulss.index();
    public static final int TPSCR = AttributesEnum.Tpscr.index();
    public static final int CODTEMPL = AttributesEnum.Codtempl.index();
    public static final int IDCENTRO = AttributesEnum.Idcentro.index();
    public static final int IDTPINVITO = AttributesEnum.Idtpinvito.index();
    public static final int DTINS = AttributesEnum.Dtins.index();
    public static final int OPINS = AttributesEnum.Opins.index();
    public static final int DTMOD = AttributesEnum.Dtmod.index();
    public static final int OPMOD = AttributesEnum.Opmod.index();
    public static final int CNF_SOCENTROPRELREF = AttributesEnum.Cnf_SoCentroPrelRef.index();
    public static final int CNF_SOTEMPLATE = AttributesEnum.Cnf_SoTemplate.index();
    public static final int CNF_SOCNFTPINVITO = AttributesEnum.Cnf_SoCnfTpinvito.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Cnf_SoFiltriTemplateImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.conf.Cnf_SoFiltriTemplate");
    }


    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
            byte historyKind = attr.getHistoryKind();

            if ((historyKind == AttributeDefImpl.HISTORY_CREATE_USER) || (historyKind == AttributeDefImpl.HISTORY_MODIFY_USER)) {
                    return ADFContext.getCurrent().getSessionScope().get("user");
            }
            return super.getHistoryContextForAttribute(attr);
    }
    
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == this.DML_INSERT) { //inserisco il codice da sequenza
            SequenceImpl s = new SequenceImpl("SO_FILTRI_SEQ", getDBTransaction());
            this.setIdriga(s.getSequenceNumber());
        }

        super.doDML(operation, e);
    }

    /**
     * Gets the attribute value for Idriga, using the alias name Idriga.
     * @return the value of Idriga
     */
    public Number getIdriga() {
        if (getAttributeInternal(IDRIGA) == null) {
            SequenceImpl s = new SequenceImpl("SO_FILTRI_SEQ", getDBTransaction());
            this.setIdriga(s.getSequenceNumber());
        }
        return (Number) getAttributeInternal(IDRIGA);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idriga.
     * @param value value to set the Idriga
     */
    public void setIdriga(Number value) {
        setAttributeInternal(IDRIGA, value);
    }

    /**
     * Gets the attribute value for Ulss, using the alias name Ulss.
     * @return the value of Ulss
     */
    public String getUlss() {
        return (String) getAttributeInternal(ULSS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ulss.
     * @param value value to set the Ulss
     */
    public void setUlss(String value) {
        setAttributeInternal(ULSS, value);
    }

    /**
     * Gets the attribute value for Tpscr, using the alias name Tpscr.
     * @return the value of Tpscr
     */
    public String getTpscr() {
        return (String) getAttributeInternal(TPSCR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Tpscr.
     * @param value value to set the Tpscr
     */
    public void setTpscr(String value) {
        setAttributeInternal(TPSCR, value);
    }

    /**
     * Gets the attribute value for Codtempl, using the alias name Codtempl.
     * @return the value of Codtempl
     */
    public Integer getCodtempl() {
        return (Integer) getAttributeInternal(CODTEMPL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codtempl.
     * @param value value to set the Codtempl
     */
    public void setCodtempl(Integer value) {
        setAttributeInternal(CODTEMPL, value);
    }

    /**
     * Gets the attribute value for Idcentro, using the alias name Idcentro.
     * @return the value of Idcentro
     */
    public Integer getIdcentro() {
        return (Integer) getAttributeInternal(IDCENTRO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcentro.
     * @param value value to set the Idcentro
     */
    public void setIdcentro(Integer value) {
        setAttributeInternal(IDCENTRO, value);
    }

    /**
     * Gets the attribute value for Idtpinvito, using the alias name Idtpinvito.
     * @return the value of Idtpinvito
     */
    public String getIdtpinvito() {
        return (String) getAttributeInternal(IDTPINVITO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idtpinvito.
     * @param value value to set the Idtpinvito
     */
    public void setIdtpinvito(String value) {
        setAttributeInternal(IDTPINVITO, value);
    }

    /**
     * Gets the attribute value for Dtins, using the alias name Dtins.
     * @return the value of Dtins
     */
    public Date getDtins() {
        return (Date) getAttributeInternal(DTINS);
    }


    /**
     * Gets the attribute value for Opins, using the alias name Opins.
     * @return the value of Opins
     */
    public String getOpins() {
        return (String) getAttributeInternal(OPINS);
    }


    /**
     * Gets the attribute value for Dtmod, using the alias name Dtmod.
     * @return the value of Dtmod
     */
    public Date getDtmod() {
        return (Date) getAttributeInternal(DTMOD);
    }


    /**
     * Gets the attribute value for Opmod, using the alias name Opmod.
     * @return the value of Opmod
     */
    public String getOpmod() {
        return (String) getAttributeInternal(OPMOD);
    }


    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity Cnf_SoCentroPrelRefImpl.
     */
    public Cnf_SoCentroPrelRefImpl getCnf_SoCentroPrelRef() {
        return (Cnf_SoCentroPrelRefImpl) getAttributeInternal(CNF_SOCENTROPRELREF);
    }

    /**
     * Sets <code>value</code> as the associated entity Cnf_SoCentroPrelRefImpl.
     */
    public void setCnf_SoCentroPrelRef(Cnf_SoCentroPrelRefImpl value) {
        setAttributeInternal(CNF_SOCENTROPRELREF, value);
    }

    /**
     * @return the associated entity Cnf_SoTemplateImpl.
     */
    public Cnf_SoTemplateImpl getCnf_SoTemplate() {
        return (Cnf_SoTemplateImpl) getAttributeInternal(CNF_SOTEMPLATE);
    }

    /**
     * Sets <code>value</code> as the associated entity Cnf_SoTemplateImpl.
     */
    public void setCnf_SoTemplate(Cnf_SoTemplateImpl value) {
        setAttributeInternal(CNF_SOTEMPLATE, value);
    }

    /**
     * @return the associated entity Cnf_SoCnfTpinvitoImpl.
     */
    public Cnf_SoCnfTpinvitoImpl getCnf_SoCnfTpinvito() {
        return (Cnf_SoCnfTpinvitoImpl) getAttributeInternal(CNF_SOCNFTPINVITO);
    }

    /**
     * Sets <code>value</code> as the associated entity Cnf_SoCnfTpinvitoImpl.
     */
    public void setCnf_SoCnfTpinvito(Cnf_SoCnfTpinvitoImpl value) {
        setAttributeInternal(CNF_SOCNFTPINVITO, value);
    }

    /**
     * @param idriga key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number idriga) {
        return new Key(new Object[] { idriga });
    }


}
