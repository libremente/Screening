package model.round;

import java.util.List;

import model.round.common.Round_pianificaInvitiCountView;

import oracle.jbo.Row;
import oracle.jbo.ViewLink;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 07 08:25:05 CEST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Round_pianificaInvitiCountViewImpl extends ViewObjectImpl implements Round_pianificaInvitiCountView {
    /**
     * This is the default constructor (do not remove).
     */
    public Round_pianificaInvitiCountViewImpl() {
    }

    public String getInClause() {
        String s = this.getQuery();
        //sostituisco i bound attributes
        Object[] params = this.getWhereClauseParams();
        int i = 0;
        for (i = 0; i < params.length; i++) {
            String toReplace = ":" + String.valueOf(i + 1);
            String replaceWith = "";
            Object param = params[i];
            if (param instanceof Object[]) {
                param = ((Object[])param)[1];
            }
            if (param instanceof List) {
                List<Object> paramList = (List<Object>)param;
                for (Object p : paramList) {
                    replaceWith += (replaceWith.isEmpty() ? "" : ",");
                    if (p instanceof Integer) {
                        replaceWith += p;
                    } else {
                        replaceWith += "'" + p + "'"; 
                    }
                }
            } else {
                replaceWith += "'" + param + "'";
            }
            s = s.replaceFirst(toReplace, replaceWith);
        }
        
        
        //SE � UN DETAIL RECUPERO I DATI DAL MASTER
        String a = this.getAssociationClause(0);
        if (a != null) {
            ViewLink[] vl = this.getViewLinks();
            ViewObject source = (ViewObject) vl[0].getSource();
            Row related = source.getCurrentRow();
            if (related == null)
                s = s.replaceAll(":" + (i + 1), "null");
            else
                s = s.replaceAll(":" + (i + 1), "'" + related.getAttribute("Idtpinvito") + "'");

        }
        
        //H00292525  
        return "SELECT DISTINCT CODTS,ULSS, RICHIAMO FROM (" + s + ")";

    }
}

