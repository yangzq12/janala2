package janala.logger.inst;

public class RET extends Instruction {
  int var;

  public RET(long tid,int iid, int mid, int var) {
    super(tid,iid, mid);
    this.var = var;
  }

  public void visit(IVisitor visitor) {
    visitor.visitRET(this);
  }
  
  public RET(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }

  @Override
  public String toString() {
    return "RET iid=" + iid + " mid=" + mid + " tid=" + tid+ " var=" + var;
  }
}
