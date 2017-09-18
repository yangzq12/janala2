package janala.logger.inst;

public class POP2 extends Instruction {
  public POP2(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitPOP2(this);
  }
  
  public POP2(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "POP2 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
