package model.global.common;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 14 14:42:33 CET 2013
// ---------------------------------------------------------------------
public interface A_SoSoggScrViewRow extends Row {
    Integer getAltorischio();

	String getCodidsoggMx();

	String getCodts();

	String getMx45Braccio();

	String getMx45Codice();

    Integer getNumanatomia();

    Integer getNumlab();

    Integer getNumradiologia();

    Integer getRoundindiv();

    Integer getRoundinviti();

	String getTpscr();

	String getUlss();

	void setAltorischio(Integer value);

	void setCodidsoggMx(String value);

	void setCodts(String value);

	void setMx45Braccio(String value);

	void setMx45Codice(String value);

	void setNumanatomia(Integer value);

	void setNumlab(Integer value);

	void setNumradiologia(Integer value);

	void setRoundindiv(Integer value);

	void setRoundinviti(Integer value);

	void setTpscr(String value);

	void setUlss(String value);

    Integer getRoundindivHpv();

    void setRoundindivHpv(Integer value);

    String getCodclassepop();

    void setCodclassepop(String value);
}