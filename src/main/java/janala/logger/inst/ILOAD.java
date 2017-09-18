package janala.logger.inst;

public class ILOAD extends Instruction {
  public int var;

  public ILOAD(long tid, int iid, int mid, int var) {
    super(tid, iid, mid);
    this.var = var;
  }
  
  public ILOAD(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitILOAD(this);
  }

  @Override
  public String toString() {
    return "ILOAD iid=" + iid + " mid=" + mid+ " tid=" + tid + " var=" + var;
  }
}
