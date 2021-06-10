package model.conf;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 18 14:35:07 CEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Cnf_LOVTpInvitoHPVViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Valore {
            public Object get(Cnf_LOVTpInvitoHPVViewRowImpl obj) {
                return obj.getValore();
            }

            public void put(Cnf_LOVTpInvitoHPVViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Descrizione {
            public Object get(Cnf_LOVTpInvitoHPVViewRowImpl obj) {
                return obj.getDescrizione();
            }

            public void put(Cnf_LOVTpInvitoHPVViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Cnf_LOVTpInvitoHPVViewRowImpl object);

        public abstract void put(Cnf_LOVTpInvitoHPVViewRowImpl object, Object value);

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
    public static final int VALORE = AttributesEnum.Valore.index();
    public static final int DESCRIZIONE = AttributesEnum.Descrizione.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Cnf_LOVTpInvitoHPVViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Valore.
     * @return the Valore
     */
    public Integer getValore() {
        return (Integer) getAttributeInternal(VALORE);
    }

    /**
     * Gets the attribute value for the calculated attribute Descrizione.
     * @return the Descrizione
     */
    public String getDescrizione() {
        return (String) getAttributeInternal(DESCRIZIONE);
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
}
