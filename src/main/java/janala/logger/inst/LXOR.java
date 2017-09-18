package janala.logger.inst;

public class LXOR extends Instruction {
  public LXOR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LXOR(int iid, int mid) {
	    super(iid, mid);
	  }


  public void visit(IVisitor visitor) {
    visitor.visitLXOR(this);
  }

  @Override
  public String toString() {
    return "LXOR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
