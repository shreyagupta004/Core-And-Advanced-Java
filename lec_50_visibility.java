public class lec_50_visibility {

    public static void main(String[] args)
    {
        int privateVariable= 10;


        ScopeOfVariable scopeCheck = new ScopeOfVariable();
       scopeCheck.checkingScope();
    //    System.out.println("The Private var is : " +scopeCheck.getPrivateVariable());
    //    System.out.println("The Private var is :"+privateVariable);
    //  scopeCheck.multiplier();


    ScopeOfVariable.InnerClass innerClass = scopeCheck.new InnerClass();
    innerClass.multiplier();


    ScopeOfVariable.InnerClass innerClas = scopeCheck.new InnerClass();
    scopeCheck.accessingInner();


    System.out.println("The variable here is : "+innerClass.getInnerVariable());
    
    }
}


  class ScopeOfVariable {


    public int publicVariable = 5;
    private int outerClassVariable = 1;


    public void checkingScope(){
        System.out.println("The Private Variable is "+ +outerClassVariable + " and the public Variable is " + publicVariable);
    }


    public int getOuterClassVariable() {
        return outerClassVariable;
    }
    public void multiplier(){
        int privateVariable = 3;
        for(int i =0;i<5;i++){
            System.out.println(i + " multiplied by " +this.outerClassVariable+ " is : " + (i*this.outerClassVariable));
        }
    }
    public void accessingInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("The variable is : " +innerClass.innerVariable);
    }
    public class InnerClass{
        private int innerVariable = 4;
       
       public int getInnerVariable(){
           return innerVariable;
       }


    public void InnerClass(){
       
        System.out.println("This is from innerClass, and the value for privateVar : " +innerVariable);
    }

    public void multiplier(){
        int privateVariable = 2;
        for(int i =0;i<5;i++){
            System.out.println(i + " multiplied by " +ScopeOfVariable.this.outerClassVariable+ " is : " + (i*ScopeOfVariable.this.outerClassVariable));
        }
    }   
}
}

