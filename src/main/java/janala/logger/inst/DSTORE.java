package janala.logger.inst;

public class DSTORE extends Instruction {
  public int var;

  public DSTORE(long tid, int iid, int mid, int var) {
    super(tid, iid, mid);
    this.var = var;
  }

  public void visit(IVisitor visitor) {
    visitor.visitDSTORE(this);
  }

  public DSTORE(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }
  
  @Override
  public String toString() {
    return "DSTORE iid=" + iid + " mid=" + mid + " tid=" + tid+ " var=" + var;
  }
}
