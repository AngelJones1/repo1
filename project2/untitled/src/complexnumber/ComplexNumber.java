package complexnumber;

public class ComplexNumber {
    double m_dRealPart;
    double m_dImaginPar;

    public ComplexNumber() {
       this.m_dRealPart = 0;
       this.m_dImaginPar = 0;
    }

    public ComplexNumber(double m_dRealPart, double m_dImaginPar) {
        this.m_dRealPart = m_dRealPart;
        this.m_dImaginPar = m_dImaginPar;
    }

    public void setM_dRealPart(double m_dRealPart) {
        this.m_dRealPart = m_dRealPart;
    }

    public void setM_dImaginPar(double m_dImaginPar) {
        this.m_dImaginPar = m_dImaginPar;
    }

    public double getM_dRealPart() {
        return m_dRealPart;
    }

    public double getM_dImaginPar() {
        return m_dImaginPar;
    }
    public  ComplexNumber complexAdd(ComplexNumber c ){
        ComplexNumber a=new ComplexNumber();
        a.m_dRealPart=this.m_dRealPart+c.m_dRealPart;
       a.m_dImaginPar =this.m_dImaginPar+c.m_dImaginPar;
          return a;
    }
    public  ComplexNumber  complexAdd1(ComplexNumber c,ComplexNumber b){
        ComplexNumber a=new ComplexNumber();
        a.m_dRealPart=b.m_dRealPart+c.m_dRealPart;
        a.m_dImaginPar =b.m_dImaginPar+c.m_dImaginPar;
        return a;
    }

    public ComplexNumber complexMinus(ComplexNumber c) {
        ComplexNumber a=new ComplexNumber();
        a.m_dImaginPar=this.m_dImaginPar-c.m_dImaginPar;
        a.m_dRealPart=this.m_dRealPart-c.m_dRealPart;
        return a;
    }
    public  ComplexNumber  complexMinus1(ComplexNumber b,ComplexNumber c){
        ComplexNumber a=new ComplexNumber();
        a.m_dRealPart=b.m_dRealPart-c.m_dRealPart;
        a.m_dImaginPar =b.m_dImaginPar-c.m_dImaginPar;
        return a;
    }

   public String toString(){
        String a,b;
        a=((Double)this.m_dRealPart).toString();
        b=((Double)this.m_dImaginPar).toString();
        return a+"+"+"("+b+")i";
   }
}
