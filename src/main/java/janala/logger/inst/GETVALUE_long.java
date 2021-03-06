package janala.logger.inst;

public class GETVALUE_long extends Instruction {
  public long v;

  public GETVALUE_long(long v) {
    super(-1,-1, -1);
    this.v = v;
  }

  public GETVALUE_long( long v,long tid) {
	    super(tid,-1, -1);
	    this.v = v;
	  }
  
  public void visit(IVisitor visitor) {
    visitor.visitGETVALUE_long(this);
  }

  @Override
  public String toString() {
    return "GETVALUE_long v=" + v+ " tid="+tid;
  }
}
