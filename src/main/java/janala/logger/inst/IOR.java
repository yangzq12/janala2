package janala.logger.inst;

public class IOR extends Instruction {
  public IOR(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIOR(this);
  }
  
  public IOR(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IOR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
