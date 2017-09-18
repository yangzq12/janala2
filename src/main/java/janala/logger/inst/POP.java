package janala.logger.inst;

public class POP extends Instruction {
  public POP(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitPOP(this);
  }

  public POP(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "POP iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
