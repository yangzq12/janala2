package janala.logger.inst;

public class NOP extends Instruction {
  public NOP(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitNOP(this);
  }
  
  public NOP(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "NOP iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
