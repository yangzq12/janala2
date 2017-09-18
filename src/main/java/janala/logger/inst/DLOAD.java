package janala.logger.inst;

public class DLOAD extends Instruction {
  public int var;

  public DLOAD(long tid, int iid, int mid, int var) {
    super(tid, iid, mid);
    this.var = var;
  }

  public void visit(IVisitor visitor) {
    visitor.visitDLOAD(this);
  }
  
  public DLOAD(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }

  @Override
  public String toString() {
    return "DLOAD iid=" + iid + " mid=" + mid+ " tid=" + tid + " var=" + var;
  }
}
