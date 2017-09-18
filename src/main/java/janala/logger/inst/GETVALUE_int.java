package janala.logger.inst;

public class GETVALUE_int extends Instruction {
  public int v;

  public GETVALUE_int(int v) {
    super(-1,-1, -1);
    this.v = v;
  }
  
  public GETVALUE_int( int v,long tid) {
	    super(tid,-1, -1);
	    this.v = v;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitGETVALUE_int(this);
  }

  @Override
  public String toString() {
    return "GETVALUE_int v=" + v+ " tid="+tid;
  }
}
