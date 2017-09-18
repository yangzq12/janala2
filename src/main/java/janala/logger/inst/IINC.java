package janala.logger.inst;

public class IINC extends Instruction {
  public int var;
  public int increment;

  public IINC(long tid, int iid, int mid, int var, int increment) {
    super(tid, iid, mid);
    this.var = var;
    this.increment = increment;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIINC(this);
  }
  
  public IINC(int iid, int mid, int var, int increment) {
	    super(iid, mid);
	    this.var = var;
	    this.increment = increment;
	  }

  @Override
  public String toString() {
    return "IINC iid=" + iid + " mid=" + mid+ " tid=" + tid + " var=" + var + " increment=" + increment;
  }
}
