package janala.logger.inst;

public class GETVALUE_short extends Instruction {
  public short v;

  public GETVALUE_short(short v) {
    super(-1,-1, -1);
    this.v = v;
  }
  
  public GETVALUE_short(short v,long tid) {
	    super(tid,-1, -1);
	    this.v = v;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitGETVALUE_short(this);
  }

  @Override
  public String toString() {
    return "GETVALUE_short v=" + v+ " tid="+tid;
  }
}
