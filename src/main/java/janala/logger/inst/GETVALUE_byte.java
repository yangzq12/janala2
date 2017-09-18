package janala.logger.inst;

public class GETVALUE_byte extends Instruction {
  public byte v;

  public GETVALUE_byte(byte v) {
    super(-1,-1, -1);
    this.v = v;
  }
  
  public GETVALUE_byte(byte v,long tid) {
	    super(tid,-1, -1);
	    this.v = v;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitGETVALUE_byte(this);
  }

  @Override
  public String toString() {
    return "GETVALUE_byte v=" + v+ " tid="+tid;
  }
}
