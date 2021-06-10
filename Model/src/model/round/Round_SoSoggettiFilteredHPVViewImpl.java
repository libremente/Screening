package model.round;
import oracle.jbo.Row;
import oracle.jbo.ViewLink;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class Round_SoSoggettiFilteredHPVViewImpl extends ViewObjectImpl implements model.round.Round_SoSoggettiFilteredHPVView 
{
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public Round_SoSoggettiFilteredHPVViewImpl()
  {
  }
  
  public String getInClause()
  { 
      String s=this.getQuery();
      //sostituisco i bound attributes
     Object[] params=this.getWhereClauseParams();
     int i=0;
     for(i=0;i<params.length;i++)
     {
       String toReplace = ":" + String.valueOf(i+1); 
       String replaceWith = "'"+params[i]+"'";
              
       s=s.replaceFirst(toReplace,replaceWith);
    
     }   
   //SE � UN DETAIL RECUPERO I DATI DAL MASTER
     String a=this.getAssociationClause(0);
      if(a!=null)
      {
        ViewLink[] vl=this.getViewLinks();
        ViewObject source=(ViewObject)vl[0].getSource();
        Row related=source.getCurrentRow();
        if(related==null)
          s=s.replaceAll(":"+(i+1),"null");
        else
         s=s.replaceAll(":"+(i+1),"'"+related.getAttribute("Idtpinvito")+"'");
         
      }
      return "SELECT DISTINCT CODTS,ULSS FROM ("+s+")";
   
  }
}