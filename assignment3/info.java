
package assignment3;

public class info extends Assignment3 {

    private final String GClubs;
    private final String Mof;
    private final String Function;
    private final String GLoft;
    
info(String GClubs, String Mof , String Function , String GLoft ){
   this.GClubs = GClubs;
   this.Mof = Mof;
   this.Function = Function;
   this.GLoft = GLoft;
}

    String getGClubs() {
        return GClubs; 
    }

    String getFunction() {
        return Function;
    }

    String getMof() {
        return Mof;
    }

    String getGLoft() {
        return GLoft;
    }

    
}
