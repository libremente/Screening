package model.impexp;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 22 11:43:40 CEST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Impexp_SoParametriUlssViewImpl extends ViewObjectImpl {
	/**
	 * This is the default constructor (do not remove).
	 */
	public Impexp_SoParametriUlssViewImpl() {
	}

	/**
	 * Returns the bind variable value for TpscrVar.
	 * @return bind variable value for TpscrVar
	 */
	public String getTpscrVar() {
		return (String)getNamedWhereClauseParam("TpscrVar");
	}

	/**
	 * Sets <code>value</code> for bind variable TpscrVar.
	 * @param value value to bind as TpscrVar
	 */
	public void setTpscrVar(String value) {
		setNamedWhereClauseParam("TpscrVar", value);
	}

	/**
	 * Returns the bind variable value for UlssVar.
	 * @return bind variable value for UlssVar
	 */
	public String getUlssVar() {
		return (String)getNamedWhereClauseParam("UlssVar");
	}

	/**
	 * Sets <code>value</code> for bind variable UlssVar.
	 * @param value value to bind as UlssVar
	 */
	public void setUlssVar(String value) {
		setNamedWhereClauseParam("UlssVar", value);
	}
}