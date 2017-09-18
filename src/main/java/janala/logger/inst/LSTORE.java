package janala.logger.inst;

public class LSTORE extends Instruction {
  public int var;

  public LSTORE(long tid,int iid, int mid, int var) {
    super(tid,iid, mid);
    this.var = var;
  }
  
  public LSTORE(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitLSTORE(this);
  }

  @Override
  public String toString() {
    return "LSTORE iid=" + iid + " mid=" + mid + " tid=" + tid+ " var=" + var;
  }
}
